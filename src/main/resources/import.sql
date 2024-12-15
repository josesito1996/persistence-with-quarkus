INSERT INTO Country (id, name, code, continent) VALUES
(1, 'Peru', 'PE', 'South America'),
(2, 'Brazil', 'BR', 'South America'),
(3, 'Argentina', 'AR', 'South America'),
(4, 'USA', 'US', 'North America'),
(5, 'Colombia', 'CO', 'South America');

INSERT INTO CUSTOMER (name, email, district, country_id) VALUES
('Carlos Martínez', 'carlos.martinez@example.com', 'SJL', 1),
('Ana López', 'ana.lopez@example.com', 'SJM', 3),
('Beatriz González', 'beatriz.gonzalez@example.com', 'CALLAO', null),
('David Torres', 'david.torres@example.com', 'La Victoria', 2),
('Elena Pérez', 'elena.perez@example.com', 'Surco', 5),
('Fernando García', 'fernando.garcia@example.com', 'ATE', 3),
('Gabriela Sánchez', 'gabriela.sanchez@example.com', 'San Isidro', 1),
('Héctor Ramírez', 'hector.ramirez@example.com', 'Independencia', 4),
('Isabel Fernández', 'isabel.fernandez@example.com', 'La molina', 2),
('Jorge Rodríguez', 'jorge.rodriguez@example.com', 'SJL', 1),
('Enrique Borja', 'eborja@example.com', 'Huaycan', 5);