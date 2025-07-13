select
T1.ID
, COUNT(T2.ID) AS CHILD_COUNT
from ecoli_data T1
left join ecoli_data T2 on T1.id = T2.parent_id
group by T1.ID
ORDER BY ID ASC
