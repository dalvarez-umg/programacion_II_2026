CREATE TABLE mascota (
    id BIGINT GENERATED ALWAYS AS IDENTITY,
    codigo VARCHAR(20) NOT NULL,
    nombre VARCHAR(80) NOT NULL,
    especie VARCHAR(30) NOT NULL,
    edad_meses INTEGER NOT NULL,
    peso NUMERIC(6,2) NOT NULL,
    activa BOOLEAN NOT NULL DEFAULT TRUE,

    CONSTRAINT pk_mascota PRIMARY KEY (id),

    CONSTRAINT uk_mascota_codigo UNIQUE (codigo),

    CONSTRAINT ck_mascota_edad CHECK (edad_meses >= 0),

    CONSTRAINT ck_mascota_peso CHECK (peso > 0)
);

INSERT INTO mascota (
    codigo,
    nombre,
    especie,
    edad_meses,
    peso
)
VALUES (
    'VET-001',
    'Luna',
    'Canino',
    14,
    24.50
);

COMMIT;

INSERT INTO mascota (
    codigo,
    nombre,
    especie,
    edad_meses,
    peso
)
VALUES
    ('VET-002', 'Milo', 'Felino', 24, 4.80),
    ('VET-003', 'Piolín', 'Ave', 10, 0.40);

COMMIT;

SELECT *
FROM mascota;

SELECT codigo, nombre, especie
FROM mascota;

SELECT codigo, nombre, peso
FROM mascota
WHERE especie = 'Canino'
ORDER BY nombre
LIMIT 10;

UPDATE mascota
SET peso = 25.20
WHERE codigo = 'VET-001';

DELETE FROM mascota
WHERE codigo = 'VET-003';