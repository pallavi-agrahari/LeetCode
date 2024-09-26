# Write your MySQL query statement below
select Employee.name, Bonus.bonus
from Employee
Left join Bonus On Employee.empId=Bonus.empId
having Bonus.bonus<1000 or Bonus.bonus is null;
