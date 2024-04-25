-- Insertar datos en la tabla socios
INSERT INTO socios (nombre, apellidos) VALUES ('Carlos', 'Martínez');
INSERT INTO socios (nombre, apellidos) VALUES ('Ana', 'Sánchez');
INSERT INTO socios (nombre, apellidos) VALUES ('Luis', 'Fernández');

-- Insertar datos en la tabla patrones
INSERT INTO patrones (nombre, apellidos) VALUES ('Juan', 'Pérez');
INSERT INTO patrones (nombre, apellidos) VALUES ('María', 'López');
INSERT INTO patrones (nombre, apellidos) VALUES ('Pedro', 'González');

-- Insertar datos en la tabla amarres
INSERT INTO amarres (cuota) VALUES (100);
INSERT INTO amarres (cuota) VALUES (200);
INSERT INTO amarres (cuota) VALUES (300);
INSERT INTO amarres (cuota) VALUES (400);
INSERT INTO amarres (cuota) VALUES (500);
INSERT INTO amarres (cuota) VALUES (600);
INSERT INTO amarres (cuota) VALUES (700);
INSERT INTO amarres (cuota) VALUES (800);

-- Insertar datos en la tabla barcos
INSERT INTO barcos (n_matricula, nombre, n_amarre, id_socio) VALUES ('ABC123', 'Barco1', 1, 1);
INSERT INTO barcos (n_matricula, nombre, n_amarre, id_socio) VALUES ('DEF456', 'Barco2', 2, 2);
INSERT INTO barcos (n_matricula, nombre, n_amarre, id_socio) VALUES ('GHI789', 'Barco3', 3, 3);

-- Insertar datos en la tabla salidas
INSERT INTO salidas (destino, id_barco, id_patron) VALUES ('Destino1', 1, 1);
INSERT INTO salidas (destino, id_barco, id_patron) VALUES ('Destino2', 2, 2);
INSERT INTO salidas (destino, id_barco, id_patron) VALUES ('Destino3', 3, 3);

