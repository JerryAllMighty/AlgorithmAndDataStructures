-- 코드를 작성해주세요
select ID,
       if(LENGTH<=10,null,LENGTH) as LENGTH
from FISH_INFO
order by LENGTH desc, ID ASC
    limit 10

