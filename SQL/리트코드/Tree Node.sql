# Write your MySQL query statement below
select
    t.id
     , case
           when t.p_id is null then 'Root'
           when t.p_id is not null and exists (
               select 1
               from Tree tt
               where tt.p_id = t.id
           ) then 'Inner'
           when t.p_id is not null and not exists (
               select 1
               from Tree tt
               where tt.p_id = t.id
           ) then 'Leaf'
    end as `type`
from tree t;