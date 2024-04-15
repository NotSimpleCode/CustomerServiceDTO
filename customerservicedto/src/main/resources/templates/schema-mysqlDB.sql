DROP TABLE IF EXISTS customer;
CREATE TABLE customer(
    id INT PRIMARY KEY,
    first_name VARCHAR(200) NOT NULL,
    last_name VARCHAR(200) NOT NULL,
    address VARCHAR(200)
);
