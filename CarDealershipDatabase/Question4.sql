SELECT d.dealership_ID, d.name, d.address
FROM CarDealership.Inventory i
JOIN CarDealership.Dealerships d
    ON i.dealership_ID = d.dealership_ID
WHERE i.VIN = 10002;
--Change VIN as needed