# Write your MySQL query statement below
with cte as (
    select
    *
    , row_number() over(partition by managerId order by managerId asc) as rn
    from employee
)
select
    name
from employee
where id in (
    select
        distinct managerId
    from cte
    where rn >= 5
)