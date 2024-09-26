# Write your MySQL query statement below
select Visits.customer_id, count(Visits.customer_id) as count_no_trans
from Visits WHERE visit_id NOT IN 
(SELECT DISTINCT visit_id FROM Transactions)
GROUP BY customer_id;
