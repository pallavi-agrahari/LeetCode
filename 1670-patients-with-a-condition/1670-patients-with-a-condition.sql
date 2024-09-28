
SELECT patient_id, patient_name, conditions
FROM Patients
WHERE conditions LIKE 'DIAB1%'       -- DIAB1 is at the start
   OR conditions LIKE '% DIAB1%'     -- DIAB1 is in the middle
   OR conditions LIKE '% DIAB1';    