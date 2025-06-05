--Create database plus question 1
-- Step 1: Create schema
/*CREATE SCHEMA CarDealership;
GO

-- Step 2: Create tables within the schema
CREATE TABLE CarDealership.Dealerships (
    dealership_ID INT IDENTITY(1,1) PRIMARY KEY,
    name VARCHAR(50),
    address VARCHAR(50),
    phone VARCHAR(12)
);

CREATE TABLE CarDealership.Vehicles (
    make VARCHAR(50),
    model VARCHAR(50),
    VIN INT PRIMARY KEY,
    SOLD INT
);

CREATE TABLE CarDealership.Inventory (
    dealership_ID INT,
    VIN INT
);

CREATE TABLE CarDealership.sales_contracts (
    orderID INT IDENTITY(1,1) PRIMARY KEY,
    firstName VARCHAR(50),
    lastName VARCHAR(50),
    buyerPhone VARCHAR(12),
    buyerAddress VARCHAR(50),
    price INT,
    VIN INT,
    dealership_ID INT,
    orderDate DATE
);*/

-- Insert into CarDealership.myDealerships
/*INSERT INTO CarDealership.Dealerships (name, address, phone)
VALUES 
('Speedy Autos', '123 Main St', '5551234567'),
('Luxury Wheels', '456 Elm St', '5559876543'),
('Eco Motors', '789 Oak St', '5556789123');

-- Insert into CarDealership.myVehicles
INSERT INTO CarDealership.Vehicles (make, model, VIN, SOLD)
VALUES 
('Toyota', 'Camry', 10001, 0),
('Honda', 'Civic', 10002, 1),
('Ford', 'Mustang', 10003, 0),
('Tesla', 'Model 3', 10004, 1);

-- Insert into CarDealership.myInventory
INSERT INTO CarDealership.Inventory (dealership_ID, VIN)
VALUES 
(1, 10001), -- Speedy Autos has Toyota Camry
(2, 10002), -- Luxury Wheels has Honda Civic
(3, 10003), -- Eco Motors has Ford Mustang
(1, 10004); -- Speedy Autos has Tesla Model 3
-- Insert into CarDealership.sales_contracts
INSERT INTO CarDealership.sales_contracts (firstName, lastName, buyerPhone, buyerAddress, price, VIN, dealership_ID, orderDate)
VALUES
('John', 'Doe', '5551112222', '321 Pine St', 22000, 10002, 2, '2025-05-15'),
('Jane', 'Smith', '5553334444', '654 Maple Ave', 38000, 10004, 1, '2025-06-01');*/

SELECT *
FROM CarDealership.Dealerships;