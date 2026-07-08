# Write your MySQL query statement below
with recursive cte as (
    select
    id
    , num
    , 1 as ConsecutiveNums
    from Logs
    where id = 1
    union all
    select
    l.id
    , l.num
    , if(l.num = c.num, ConsecutiveNums + 1, 1) as ConsecutiveNums
    from cte c
    inner join Logs l on l.id = c.id + 1
)

select distinct num as ConsecutiveNums
from cte
where ConsecutiveNums  >= 3
