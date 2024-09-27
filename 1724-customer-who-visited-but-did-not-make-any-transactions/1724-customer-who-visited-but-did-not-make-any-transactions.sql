# Write your MySQL query statement below
SELECT Visits.customer_id, COUNT(Visits.customer_id) AS count_no_trans
FROM Visits WHERE visit_id NOT IN 
(SELECT DISTINCT visit_id FROM Transactions)
GROUP BY customer_id;

/*
SELECT V.customer_id, COUNT(V.customer_id) AS count_no_trans
FROM Visits V
LEFT JOIN Transactions T
    ON V.visit_id = T.visit_id
WHERE T.visit_id IS NULL  
GROUP BY V.customer_id;*/
