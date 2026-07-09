with cte as (
    select
        player_id
         ,device_id
         ,event_date
         ,games_played
         , lead(event_date) over(partition by player_id order by event_date asc) as next_event_date
    , row_number() over(partition by player_id order by event_date asc) as rn
    from Activity
)
   , validCount as (
    select
        player_id
         , case when
                    datediff(next_event_date, event_date) = 1 then 1
                else 0
        end as cnt
    from cte
    where rn = 1
)


select
    round((
              select count(*)
              from validCount
              where cnt = 1
          ) /
          (
              select count(distinct player_id)
              from Activity
          ), 2
    ) as fraction

