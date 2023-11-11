-- Create the Client table
CREATE TABLE client (
    id SERIAL PRIMARY KEY,
    name VARCHAR(200) NOT NULL
);

-- Create the Planet table
z
CREATE TABLE planet (
    id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(500) NOT NULL
);


-- Create the Ticket table with foreign keys
CREATE TABLE ticket (
    id SERIAL PRIMARY KEY,
    created_at TIMESTAMP NOT NULL,
    client_id INT,
    from_planet_id VARCHAR(10),
    to_planet_id VARCHAR(10),
    FOREIGN KEY (client_id) REFERENCES client(id),
    FOREIGN KEY (from_planet_id) REFERENCES planet(id)  -- References the starting planet
    FOREIGN KEY (to_planet_id) REFERENCES planet(id)    -- References the destination planet
);