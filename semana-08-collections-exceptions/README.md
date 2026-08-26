# Semana 08 - Colecciones y manejo de excepciones en Java

## Programación II

Este repositorio contiene el código desarrollado durante la Semana 08 del curso **Programación II**. Se continúa la evolución del sistema veterinario de consola **VetCare**, incorporando colecciones dinámicas de objetos y manejo básico de excepciones en Java.

Durante esta semana se trabajan ejemplos independientes para comprender cada estructura y, posteriormente, se aplican los conceptos al proyecto VetCare.

## Objetivo

Utilizar colecciones de Java para almacenar y administrar objetos, seleccionando la estructura adecuada según el problema y controlando entradas inválidas mediante bloques `try-catch`.

## Temas trabajados

- Diferencias entre arreglos y colecciones.
- Colecciones dinámicas.
- Uso básico de genéricos.
- `ArrayList`.
- `HashSet`.
- `HashMap`.
- Comparación entre `ArrayList` y `LinkedList`.
- Métodos para agregar, consultar, buscar y eliminar elementos.
- Recorrido de colecciones mediante ciclos.
- Colecciones de objetos personalizados.
- Excepciones durante la ejecución.
- Estructura `try-catch`.
- Manejo de `NumberFormatException`.
- Evolución del sistema VetCare.

## Estructura del proyecto

```text
src/
├── Mascota.java
├── Perro.java
├── Gato.java
├── Ave.java
│
├── MainArreglo.java
│
├── MainArrayList.java
├── MainArrayListVetCare.java
├── MainHashSet.java
├── MainHashSetVetCare.java
├── MainHashMap.java
├── MainHashMapVetCare.java
├── MainLinkedList.java
├── MainExcepciones.java
│
├── MainPracticaArrayList.java
├── MainPracticaHashSet.java
├── MainPracticaHashMap.java
│
├── ClinicaVeterinaria.java
└── MainColeccionesVetCare.java
```

## Punto de partida: VetCare

El proyecto conserva las clases desarrolladas durante la semana anterior:

- `Mascota`: clase base abstracta.
- `Perro`: clase derivada de `Mascota`.
- `Gato`: clase derivada de `Mascota`.
- `Ave`: clase derivada de `Mascota`.

Estas clases continúan aplicando:

- Encapsulamiento.
- Herencia.
- Abstracción.
- Sobrescritura.
- Polimorfismo.

Durante esta semana no se modifica la estructura interna de estas clases. La evolución ocurre en la manera de almacenar y administrar los objetos.

## Del arreglo a las colecciones

La versión anterior de VetCare utilizaba un arreglo:

```java
Mascota[] pacientes = {
    new Perro(...),
    new Gato(...),
    new Ave(...)
};
```

Los arreglos poseen un tamaño fijo. Si el sistema necesita registrar nuevos pacientes durante la ejecución, resulta más conveniente utilizar una colección dinámica.

Ejemplo con `ArrayList`:

```java
ArrayList<Mascota> pacientes =
        new ArrayList<>();
```

Registro de objetos:

```java
pacientes.add(new Perro(...));
pacientes.add(new Gato(...));
pacientes.add(new Ave(...));
```

## Genéricos

Los símbolos `< >` permiten indicar el tipo de datos que almacenará una colección.

Ejemplo:

```java
ArrayList<String> nombres;
```

Esta colección solamente admite objetos de tipo `String`.

```java
ArrayList<Mascota> pacientes;
```

Esta colección admite objetos de tipo `Mascota` y de sus clases derivadas:

```text
Perro
Gato
Ave
```

## Colecciones estudiadas

| Necesidad | Estructura recomendada |
|---|---|
| Mantener una secuencia dinámica de elementos | `ArrayList` |
| Evitar valores duplicados | `HashSet` |
| Relacionar una clave con un valor | `HashMap` |
| Insertar y retirar frecuentemente en los extremos | `LinkedList` |

La colección adecuada depende del requerimiento que se desea resolver.

---

# ArrayList

`ArrayList` permite almacenar una secuencia dinámica de elementos.

```java
ArrayList<String> estudiantes =
        new ArrayList<>();
```

## Operaciones principales

```java
estudiantes.add("Ana");
estudiantes.get(0);
estudiantes.remove("Ana");
estudiantes.size();
estudiantes.isEmpty();
estudiantes.contains("Ana");
```

## Recorrido

```java
for (String estudiante : estudiantes) {
    System.out.println(estudiante);
}
```

## Aplicación en VetCare

```java
ArrayList<Mascota> pacientes =
        new ArrayList<>();

pacientes.add(
    new Perro(
        "VET-001",
        "Luna",
        14,
        24.5,
        "Mestiza"
    )
);
```

El polimorfismo continúa funcionando al recorrer la colección:

```java
for (Mascota paciente : pacientes) {
    System.out.println(
        paciente.mostrarInformacion()
    );

    paciente.emitirSonido();

    System.out.println(
        "Costo de consulta: Q"
        + paciente.calcularCostoConsulta()
    );
}
```

---

# HashSet

`HashSet` se utiliza cuando necesitamos almacenar valores sin permitir duplicados.

```java
HashSet<String> codigos =
        new HashSet<>();
```

Ejemplo:

```java
codigos.add("VET-001");
codigos.add("VET-002");
codigos.add("VET-001");
```

El código `VET-001` solamente se almacena una vez.

El método `add()` devuelve un valor booleano:

```java
boolean agregado =
        codigos.add("VET-001");

if (agregado) {
    System.out.println(
        "Código registrado."
    );
} else {
    System.out.println(
        "El código ya existe."
    );
}
```

## Características

- No permite elementos duplicados.
- No garantiza el orden de inserción.
- Permite comprobar si un valor ya existe.
- Es útil para validar códigos, correos u otros valores únicos.

---

# HashMap

`HashMap` permite relacionar una clave con un valor.

```java
HashMap<String, Mascota> pacientes =
        new HashMap<>();
```

En VetCare:

```text
Clave → codigoPaciente
Valor → objeto Mascota
```

Ejemplo:

```java
pacientes.put(
    "VET-001",
    new Perro(...)
);
```

Búsqueda:

```java
Mascota encontrada =
        pacientes.get("VET-001");
```

Comprobación de una clave:

```java
if (pacientes.containsKey("VET-001")) {
    System.out.println(
        "Paciente encontrado."
    );
}
```

## Operaciones principales

```java
pacientes.put(clave, valor);
pacientes.get(clave);
pacientes.containsKey(clave);
pacientes.remove(clave);
pacientes.size();
```

Si se utiliza nuevamente `put()` con una clave existente, el valor anterior será reemplazado. Por esta razón, puede comprobarse primero si la clave ya está registrada.

> `Map` forma parte del Java Collections Framework, aunque técnicamente no hereda de la interfaz `Collection`.

---

# LinkedList

`LinkedList` almacena elementos mediante una estructura enlazada.

Ejemplo de turnos:

```java
LinkedList<String> turnos =
        new LinkedList<>();

turnos.addLast("Turno 1");
turnos.addLast("Turno 2");
turnos.addFirst("Emergencia");
```

Atención de turnos:

```java
while (!turnos.isEmpty()) {
    String turno =
            turnos.removeFirst();

    System.out.println(
        "Atendiendo: " + turno
    );
}
```

## ArrayList vs. LinkedList

| `ArrayList` | `LinkedList` |
|---|---|
| Basado en un arreglo dinámico | Basado en nodos enlazados |
| Acceso rápido por posición | Acceso por posición más lento |
| Adecuado para consultas y recorridos | Adecuado para operaciones en los extremos |
| Utilizado como colección principal en VetCare | Presentado como alternativa |

---

# Manejo de excepciones

Una excepción es una situación inesperada que ocurre durante la ejecución del programa.

Ejemplo:

```java
int edad =
        Integer.parseInt("dieciocho");
```

El código compila, pero durante la ejecución produce:

```text
NumberFormatException
```

## Estructura try-catch

```java
try {
    int edad =
            Integer.parseInt(entrada);

    System.out.println(
        "Edad registrada: " + edad
    );

} catch (NumberFormatException error) {
    System.out.println(
        "Debe ingresar un número entero."
    );
}
```

- `try`: contiene el código que podría generar una excepción.
- `catch`: contiene la acción que se ejecutará si ocurre la excepción.
- `NumberFormatException`: ocurre cuando un texto no puede convertirse en un número.

## Condiciones y excepciones

Las condiciones controlan reglas conocidas:

```java
if (edad >= 0) {
    System.out.println(
        "Edad válida."
    );
}
```

El bloque `catch` controla una operación que no pudo completarse:

```java
catch (NumberFormatException error) {
    System.out.println(
        "La entrada no es numérica."
    );
}
```

Las excepciones no sustituyen todas las validaciones realizadas mediante condiciones.

---

# Ejemplos disponibles

## `MainArreglo`

Conserva la versión anterior de VetCare utilizando:

```java
Mascota[] pacientes;
```

Permite comparar un arreglo fijo con una colección dinámica.

## `MainArrayList`

Ejemplo básico con una colección de nombres.

## `MainArrayListVetCare`

Aplica `ArrayList<Mascota>` al registro y recorrido de pacientes.

## `MainHashSet`

Ejemplo básico de valores únicos mediante correos electrónicos.

## `MainHashSetVetCare`

Utiliza `HashSet<String>` para impedir códigos de pacientes duplicados.

## `MainHashMap`

Ejemplo básico de productos relacionados con sus precios.

## `MainHashMapVetCare`

Utiliza `HashMap<String, Mascota>` para registrar y buscar pacientes mediante su código.

## `MainLinkedList`

Demuestra el uso de una lista enlazada para administrar turnos.

## `MainExcepciones`

Demuestra la captura de `NumberFormatException` mediante `try-catch`.

---

# Prácticas resueltas

## `MainPracticaArrayList`

Demuestra:

- Registro de objetos `Mascota`.
- Recorrido de un `ArrayList`.
- Eliminación mediante posición.
- Validación del índice.
- Captura de una entrada no numérica.

## `MainPracticaHashSet`

Demuestra:

- Registro de códigos.
- Control de duplicados.
- Recorrido de un `HashSet`.
- Captura de una cantidad no numérica.

## `MainPracticaHashMap`

Demuestra:

- Registro de pacientes mediante código.
- Búsqueda por clave.
- Eliminación por clave.
- Control de opciones incorrectas.
- Captura de una entrada no numérica.

---

# Evolución final de VetCare

## Clase `ClinicaVeterinaria`

La clase `ClinicaVeterinaria` administra la colección de pacientes.

Contiene las siguientes operaciones:

```java
registrarPaciente(Mascota mascota)
listarPacientes()
buscarPorCodigo(String codigo)
modificarPeso(String codigo, double nuevoPeso)
eliminarPaciente(String codigo)
obtenerCantidadPacientes()
```

Esta clase evita que todas las operaciones se encuentren directamente dentro de `Main`.

## Clase `MainColeccionesVetCare`

La clase principal:

- Crea la clínica.
- Registra diferentes pacientes.
- Impide códigos duplicados.
- Lista los pacientes.
- Busca por código.
- Modifica el peso.
- Elimina pacientes.
- Muestra la cantidad final.

Esta estructura prepara el proyecto para la siguiente evolución:

```text
Objetos almacenados en memoria
            ↓
Base de datos PostgreSQL
            ↓
API REST
            ↓
Spring Boot
```

---

# Requisitos

- Java Development Kit 17 o superior.
- IntelliJ IDEA o cualquier IDE compatible con Java.
- Git.
- Cuenta de GitHub.

# Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el JDK esté configurado correctamente.
3. Abrir la clase que se desea probar.
4. Ejecutar el método `main`.
5. Revisar el resultado en la consola.

Cada clase `Main` puede ejecutarse independientemente.

## Orden sugerido

1. `MainArreglo`
2. `MainArrayList`
3. `MainArrayListVetCare`
4. `MainHashSet`
5. `MainHashSetVetCare`
6. `MainHashMap`
7. `MainHashMapVetCare`
8. `MainLinkedList`
9. `MainExcepciones`
10. `MainPracticaArrayList`
11. `MainPracticaHashSet`
12. `MainPracticaHashMap`
13. `MainColeccionesVetCare`

# Resultado de aprendizaje

Al finalizar esta semana, el estudiante podrá:

- Diferenciar un arreglo de una colección.
- Utilizar genéricos básicos.
- Seleccionar una colección según el problema.
- Almacenar objetos mediante `ArrayList`.
- Evitar duplicados mediante `HashSet`.
- Buscar objetos mediante claves con `HashMap`.
- Reconocer el uso de `LinkedList`.
- Capturar entradas inválidas mediante `try-catch`.
- Administrar dinámicamente los pacientes de VetCare.

---

**Curso:** Programación II  
**Proyecto:** VetCare  
**Semana:** 08  
**Universidad Mariano Gálvez de Guatemala**