# Semana 09 - Excepciones e introducción a PostgreSQL

## Programación II

Este repositorio contiene la evidencia y los ejemplos desarrollados durante la **Semana 09** del curso Programación II.

Se inició la transición del proyecto **VetCare** desde el almacenamiento temporal mediante colecciones de Java hacia el almacenamiento permanente utilizando PostgreSQL.

## Objetivos

Al finalizar la semana, el estudiante podrá:

- Comprender la diferencia entre memoria temporal y persistencia.
- Reconocer la estructura básica de una base de datos relacional.
- Crear tablas y restricciones en PostgreSQL.
- Ejecutar operaciones CRUD mediante SQL.

## Temas trabajados

### PostgreSQL y SQL

- Persistencia de datos.
- Bases de datos relacionales.
- PostgreSQL y pgAdmin.
- Tablas, columnas y registros.
- Tipos de datos.
- Llaves primarias.
- Identificadores automáticos.
- Restricciones.
- Inserción de registros.
- Consultas.
- Filtros y ordenamiento.
- Actualización y eliminación.
- Relación entre SQL y CRUD.

## De las colecciones a PostgreSQL

Hasta esta semana, VetCare almacenaba sus pacientes en una colección:

```java
ArrayList<Mascota> pacientes =
        new ArrayList<>();
```

Esta colección funciona mientras el programa se encuentra en ejecución. Cuando el programa termina, los objetos almacenados en memoria desaparecen.

PostgreSQL permitirá conservar permanentemente la información:

```text
Clases y objetos
        ↓
Colecciones en memoria
        ↓
PostgreSQL
        ↓
Java y JDBC
        ↓
Spring Boot y JPA
        ↓
API REST
```

Las clases de Java continuarán representando los objetos del sistema, mientras que PostgreSQL almacenará sus datos.

## Modelo inicial de VetCare

Durante la práctica se creó la tabla:

```text
mascota
├── id
├── codigo
├── nombre
├── especie
├── edad_meses
├── peso
└── activa
```

Esta tabla representa la información básica de los pacientes de VetCare.

## Tipos de datos utilizados

| Columna | Tipo de PostgreSQL | Descripción |
|---|---|---|
| `id` | `BIGINT` | Identificador interno |
| `codigo` | `VARCHAR(20)` | Código del paciente |
| `nombre` | `VARCHAR(80)` | Nombre de la mascota |
| `especie` | `VARCHAR(30)` | Especie de la mascota |
| `edad_meses` | `INTEGER` | Edad expresada en meses |
| `peso` | `NUMERIC(6,2)` | Peso de la mascota |
| `activa` | `BOOLEAN` | Estado del paciente |

## Identificador automático

La columna `id` utiliza:

```sql
GENERATED ALWAYS AS IDENTITY
```

Esto permite que PostgreSQL genere automáticamente un identificador para cada registro.

Por esta razón, no es necesario proporcionar el `id` al insertar una mascota.

## Restricciones implementadas

La tabla contiene las siguientes restricciones:

| Restricción | Responsabilidad |
|---|---|
| `pk_mascota` | Define `id` como llave primaria |
| `uk_mascota_codigo` | Impide códigos duplicados |
| `ck_mascota_edad` | Impide edades negativas |
| `ck_mascota_peso` | Exige un peso mayor que cero |
| `NOT NULL` | Exige valores en las columnas obligatorias |
| `DEFAULT TRUE` | Registra las mascotas como activas de manera predeterminada |

Las restricciones permiten proteger la integridad de la información, aunque posteriormente Java también realice validaciones.

## Operaciones realizadas

### Creación de la tabla

```sql
CREATE TABLE mascota (
    id BIGINT GENERATED ALWAYS AS IDENTITY,
    codigo VARCHAR(20) NOT NULL,
    nombre VARCHAR(80) NOT NULL,
    especie VARCHAR(30) NOT NULL,
    edad_meses INTEGER NOT NULL,
    peso NUMERIC(6,2) NOT NULL,
    activa BOOLEAN NOT NULL DEFAULT TRUE,

    CONSTRAINT pk_mascota
        PRIMARY KEY (id),

    CONSTRAINT uk_mascota_codigo
        UNIQUE (codigo),

    CONSTRAINT ck_mascota_edad
        CHECK (edad_meses >= 0),

    CONSTRAINT ck_mascota_peso
        CHECK (peso > 0)
);
```

### Inserción de registros

Se registraron los siguientes pacientes:

| Código | Nombre | Especie | Edad | Peso |
|---|---|---|---:|---:|
| `VET-001` | Luna | Canino | 14 meses | 24.50 |
| `VET-002` | Milo | Felino | 24 meses | 4.80 |
| `VET-003` | Piolín | Ave | 10 meses | 0.40 |

### Consulta de registros

Consulta general:

```sql
SELECT *
FROM mascota;
```

Consulta de columnas específicas:

```sql
SELECT codigo, nombre, especie
FROM mascota;
```

En aplicaciones se recomienda seleccionar únicamente las columnas necesarias. `SELECT *` se utiliza en este ejercicio para explorar inicialmente el contenido de la tabla.

### Filtrado y ordenamiento

Se consultaron las mascotas de especie canina:

```sql
SELECT codigo, nombre, peso
FROM mascota
WHERE especie = 'Canino'
ORDER BY nombre
LIMIT 10;
```

### Actualización

Se modificó el peso de la mascota identificada con el código `VET-001`:

```sql
UPDATE mascota
SET peso = 25.20
WHERE codigo = 'VET-001';
```

### Eliminación

Se eliminó la mascota identificada con el código `VET-003`:

```sql
DELETE FROM mascota
WHERE codigo = 'VET-003';
```

Antes de ejecutar instrucciones `UPDATE` o `DELETE`, se recomienda utilizar un `SELECT` con la misma condición para comprobar qué registros serán afectados.

## SQL y CRUD

Las operaciones SQL realizadas corresponden a las operaciones CRUD:

| CRUD | Operación | Sentencia SQL |
|---|---|---|
| Create | Crear un registro | `INSERT` |
| Read | Consultar información | `SELECT` |
| Update | Modificar un registro | `UPDATE` |
| Delete | Eliminar un registro | `DELETE` |

Esta relación será utilizada posteriormente cuando se implemente el CRUD de VetCare mediante Spring Boot y JPA.

## Archivo SQL

El archivo principal de esta semana es:

```text
vetcare.sql
```

Contiene:

- Creación de la tabla `mascota`.
- Definición de restricciones.
- Inserción de registros.
- Consultas.
- Filtros.
- Ordenamiento.
- Actualización.
- Eliminación.

## Estructura del repositorio

```text
semana-09-postgresql/
├── vetcare.sql
└── README.md
```

## Requisitos

- PostgreSQL.
- pgAdmin 4 o cualquier cliente compatible con PostgreSQL.
- Servidor PostgreSQL en ejecución.
- Usuario y contraseña configurados durante la instalación.

## Ejecución

1. Iniciar PostgreSQL.
2. Abrir pgAdmin 4.
3. Conectarse al servidor utilizando el usuario y contraseña configurados.
4. Crear una base de datos llamada:

```text
vetcare
```

5. Abrir el Query Tool dentro de la base `vetcare`.
6. Abrir el archivo `vetcare.sql`.
7. Ejecutar las instrucciones en el orden en que aparecen.
8. Revisar los resultados de cada operación.

> PostgreSQL no utiliza la sentencia `USE`. Después de crear la base de datos, debe seleccionarse o abrirse una conexión hacia ella desde pgAdmin.

## Estado final esperado

Después de ejecutar todas las instrucciones:

- Luna continuará registrada con un peso de `25.20`.
- Milo continuará registrado con un peso de `4.80`.
- Piolín habrá sido eliminado.
- Los pacientes registrados conservarán el estado `activo = true`.

## Nota sobre COMMIT

Si pgAdmin tiene habilitado el modo automático de confirmación, cada instrucción se confirma al ejecutarse y los `COMMIT` incluidos en el archivo son opcionales.

Las transacciones explícitas mediante `BEGIN`, `COMMIT` y `ROLLBACK` se estudiarán posteriormente.

## Resultado de aprendizaje

Al finalizar esta práctica, se logró almacenar la información de VetCare en una tabla de PostgreSQL y ejecutar las operaciones fundamentales de un CRUD.

Este ejercicio prepara el proyecto para las siguientes etapas:

```text
PostgreSQL
→ Conexión desde Java
→ Spring Boot
→ JPA
→ Repository
→ API REST
```

---

**Curso:** Programación II  
**Proyecto:** VetCare  
**Semana:** 09  
**Universidad Mariano Gálvez de Guatemala**