# Write your MySQL query statement below
SELECT Visits.customer_id, COUNT(Visits.customer_id) AS count_no_trans
FROM Visits 
LEFT JOIN Transactions T
    ON Visits.visit_id = T.visit_id
WHERE T.visit_id IS NULL  
GROUP BY Visits.customer_id;
