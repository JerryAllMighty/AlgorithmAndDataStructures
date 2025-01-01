-- 코드를 작성해주세요
select count(1) as FISH_COUNT
from FISH_INFO
where TIME >= '2021-01-01'
  and TIME < '2022-01-01'
