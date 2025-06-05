SELECT *
FROM CarDealership.sales_contracts
WHERE dealership_ID = 1
AND orderDate BETWEEN '1999-01-01' AND '2025-06-05';
--1st where condition handles dealership
--2nd condition handles date