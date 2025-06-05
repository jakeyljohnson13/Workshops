SELECT d.dealership_ID, d.name, v.model, v.VIN 
FROM CarDealership.Inventory i
JOIN CarDealership.Vehicles v
    ON i.VIN = v.VIN
JOIN CarDealership.Dealerships d
    ON i.dealership_ID = d.dealership_ID
WHERE v.make = 'Toyota';
--Sorts by make, can also do partial search by using 'like' and '%'
--Can search by model by replacing v.make with v.model