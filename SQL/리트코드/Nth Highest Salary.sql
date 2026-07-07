CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE M INT;
    SET M = N - 1;
RETURN (
        # Write your MySQL query statement below.
      with cte as (
        select
        id
        , salary
        , dense_rank() over(order by salary desc) as rnk
        from Employee
      )
      select
      distinct salary
      from cte
      LIMIT M, 1
    );
END