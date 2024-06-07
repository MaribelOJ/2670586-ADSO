create database api_deportes;
create table categoria( id_categoria INT PRIMARY  KEY AUTO_INCREMENT,
                        nombre VARCHAR(255) NOT NULL
                        );


create table deportes(  id_deporte INT PRIMARY  KEY AUTO_INCREMENT,
                        nombre VARCHAR(255) NOT NULL,
                        modalidad ENUM('individual','equipos','dobles','mixtos'), 
                        participantes_min INT,
                        participantes_max int,
                        implementos VARCHAR(255) NOT NULL,
                        categoria INT,
                        FOREIGN KEY (categoria) REFERENCES categoria(id_categoria));


INSERT INTO categoria(nombre)
VALUES ('deporte de campo'),
       ('deporte acuático'),
       ('deporte de contacto'),
       ('deporte de resistencia');
       

INSERT INTO deportes(nombre, modalidad, participantes_min,participantes_max,implementos,categoria)
VALUES ('Tenis', 'individual', 1, 1, 'Raquetas,pelotas,red', 1),
       ('Tenis', 'dobles', 2, 2, 'Raquetas,pelotas,red', 1),
       ('Ciclismo', 'individual', 1, 1, 'Bicicleta, Casco', 4),
       ('Futbol', 'equipos', 11, 14, 'pelotas', 1),
       ('Hockey sobre Hielo', 'equipos', 6, 14, 'Palo, Disco, Patines', 3),
       ('Surf', 'individual', 1, 1, 'Tabla de surf', 2);
