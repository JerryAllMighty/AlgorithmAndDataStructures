select
    player_id
     ,device_id
     ,event_date
     ,games_played
     , count(player_id) over(partition by player_id order by event_date) as cnt
from Activity