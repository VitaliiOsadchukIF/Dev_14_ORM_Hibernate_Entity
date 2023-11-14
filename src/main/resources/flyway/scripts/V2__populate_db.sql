-- Додавання даних в таблицю "client"
INSERT INTO client (name_) VALUES ('Alice');
INSERT INTO client (name_) VALUES ('Bob');
INSERT INTO client (name_) VALUES ('Charlie');
INSERT INTO client (name_) VALUES ('David');
INSERT INTO client (name_) VALUES ('Eve');
INSERT INTO client (name_) VALUES ('Frank');
INSERT INTO client (name_) VALUES ('Grace');
INSERT INTO client (name_) VALUES ('Hank');
INSERT INTO client (name_) VALUES ('Ivy');
INSERT INTO client (name_) VALUES ('Jack');


-- Додавання даних в таблицю "planet"
INSERT INTO planet (id, name_) VALUES ('MARS', 'Mars');
INSERT INTO planet (id, name_) VALUES ('VENUS', 'Venus');
INSERT INTO planet (id, name_) VALUES ('EARTH', 'Earth');
INSERT INTO planet (id, name_) VALUES ('JUPITER', 'Jupiter');
INSERT INTO planet (id, name_) VALUES ('SATURN', 'Saturn');

-- Додавання даних в таблицю "ticket"
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 1, 'MARS', 'VENUS');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 1, 'VENUS', 'MARS');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 3, 'EARTH', 'JUPITER');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 4, 'MARS', 'SATURN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 5, 'JUPITER', 'VENUS');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 6, 'SATURN', 'EARTH');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 7, 'EARTH', 'MARS');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 8, 'VENUS', 'JUPITER');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 9, 'JUPITER', 'SATURN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES (CURRENT_TIMESTAMP, 10, 'SATURN', 'MARS');
