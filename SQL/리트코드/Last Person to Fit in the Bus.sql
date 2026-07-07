# Write your MySQL query statement below
with cte as (
    select
    person_name
    , sum(weight) over(order by turn asc) as sum_total
    , turn
    from Queue
)
select person_name
from cte
where sum_total <= 1000
order by sum_total desc
    limit 1
