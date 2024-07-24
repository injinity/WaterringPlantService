CREATE TABLE "PUBLIC"."PLANTS" (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    location VARCHAR(255),
    photo VARCHAR(255),
    watered BOOLEAN,
    watered_date DATE,
    days_between_hydrate INT DEFAULT 7
);

INSERT INTO "PUBLIC"."PLANTS" (name, location, photo, watered, watered_date) VALUES
('Yuka', 'Salon', '/assets/plant.jpg', true, '2021-01-16'),
('Orchidea', 'Kuchnia', '/assets/plant.jpg', false, '2022-04-11'),
('Cactus', 'Salon', '/assets/plant.jpg', true, '2023-03-27'),
('Monstera', 'Salon', '/assets/plant.jpg', true, '2022-02-26'),
('Sukulent', 'Kuchnia', '/assets/plant.jpg', false, '2024-04-22');