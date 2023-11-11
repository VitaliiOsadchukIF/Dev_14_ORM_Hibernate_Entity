-- Додавання даних в таблицю "client"
INSERT INTO client (name) VALUES ('Alice');
INSERT INTO client (name) VALUES ('Bob');
INSERT INTO client (name) VALUES ('Charlie');
INSERT INTO client (name) VALUES ('David');
INSERT INTO client (name) VALUES ('Eve');
INSERT INTO client (name) VALUES ('Frank');
INSERT INTO client (name) VALUES ('Grace');
INSERT INTO client (name) VALUES ('Hank');
INSERT INTO client (name) VALUES ('Ivy');
INSERT INTO client (name) VALUES ('Jack');


-- Додавання даних в таблицю "planet"
INSERT INTO planet (id, name) VALUES ('MARS', 'Mars');
INSERT INTO planet (id, name) VALUES ('VENUS', 'Venus');
INSERT INTO planet (id, name) VALUES ('EARTH', 'Earth');
INSERT INTO planet (id, name) VALUES ('JUPITER', 'Jupiter');
INSERT INTO planet (id, name) VALUES ('SATURN', 'Saturn');

-- Додавання даних в таблицю "ticket"
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 1, 'MARS', 'VENUS');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 2, 'VENUS', 'MARS');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 3, 'EARTH', 'JUPITER');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 4, 'MARS', 'SATURN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 5, 'JUPITER', 'VENUS');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 6, 'SATURN', 'EARTH');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 7, 'EARTH', 'MARS');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 8, 'VENUS', 'EARTH');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 9, 'JUPITER', 'SATURN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 10, 'SATURN', 'MARS');
