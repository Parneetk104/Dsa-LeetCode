# Write your MySQL query statement below
SELECT (
    SELECT DISTINCT salary  from Employee ORDER BY salary DESC Limit 1 OFFSET 1
) AS SecondHighestSalary;