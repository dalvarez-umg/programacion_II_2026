# Semana 03 — Condiciones y ciclos

Proyecto desarrollado durante la tercera semana del curso **Programación II**.

En esta semana se estudia cómo controlar el flujo de ejecución de un programa mediante decisiones, repeticiones, validaciones y menús interactivos en consola.

---

## Objetivo

Aplicar estructuras condicionales y ciclos en Java para resolver problemas de lógica, validar información y construir programas que ejecuten acciones de forma repetitiva.

Al finalizar la semana, el estudiante podrá:

- Tomar decisiones mediante `if`, `else if` y `else`.
- Evaluar varias opciones mediante `switch`.
- Repetir instrucciones utilizando `for`, `while` y `do while`.
- Controlar ciclos mediante `break` y `continue`.
- Validar valores numéricos y cadenas de texto.
- Combinar condiciones y ciclos dentro de un programa de consola.

---

## Temas estudiados

- Estructuras condicionales.
- Operadores relacionales y lógicos.
- Condiciones simples y compuestas.
- Estructura `switch`.
- Ciclo `for`.
- Ciclo `while`.
- Ciclo `do while`.
- Uso de `break` y `continue`.
- Contadores y acumuladores.
- Validación de rangos numéricos.
- Comparación y normalización de texto.
- Menús repetitivos en consola.

---

## Estructuras utilizadas

### Condición `if`

Permite ejecutar una acción cuando se cumple una condición.

```java
int nota = 75;

if (nota >= 61) {
    System.out.println("Aprobado");
} else {
    System.out.println("Reprobado");
}
```

### Estructura `switch`

Permite seleccionar una acción entre varias opciones.

```java
switch (opcion) {
    case 1:
        System.out.println("Registrar producto");
        break;
    case 2:
        System.out.println("Calcular venta");
        break;
    case 3:
        System.out.println("Salir");
        break;
    default:
        System.out.println("Opción inválida");
}
```

### Ciclo `for`

Se utiliza cuando se conoce la cantidad de repeticiones.

```java
for (int i = 5; i <= 100; i += 5) {
    System.out.println(i);
}
```

### Ciclo `while`

Se utiliza cuando una acción debe repetirse mientras se cumpla una condición.

```java
int numero = 1;

while (numero <= 10) {
    System.out.println(numero);
    numero++;
}
```

### Ciclo `do while`

Ejecuta las instrucciones al menos una vez y luego evalúa la condición.

```java
int numero;

do {
    System.out.print("Ingrese un número positivo: ");
    numero = entrada.nextInt();
} while (numero <= 0);
```

---

## Ejercicios incluidos

| Archivo | Descripción |
|---|---|
| `semana_03_condiciones.java` | Determina si una nota representa aprobación o reprobación. |
| `semana_03_ejemplo1.java` | Valida la edad y la disponibilidad de DPI mediante una condición compuesta. |
| `semana_03_ejemplo2.java` | Clasifica una nota mediante `if`, `else if` y `else`. |
| `semana_03_switch.java` | Presenta un ejemplo básico de selección mediante `switch`. |
| `semana_03_for_1.java` | Muestra los números del 1 al 10. |
| `semana_03_for_2.java` | Genera una tabla de multiplicar. |
| `semana_03_while_1.java` | Presenta un ciclo controlado mediante una condición. |
| `semana_03_while_2_break.java` | Detiene un ciclo al encontrar el número 37. |
| `semana_03_while_3_continue.java` | Omite los múltiplos de 3 mediante `continue`. |
| `semana_03_do_while.java` | Presenta la estructura básica de un menú con `do while`. |
| `semana_03_ejercicio01.java` | Muestra números de 5 en 5 hasta 100. |
| `semana_03_ejercicio02.java` | Realiza un conteo regresivo de 20 a 0. |
| `semana_03_ejercicio03.java` | Muestra números pares utilizando dos soluciones diferentes. |
| `semana_03_ejercicio04.java` | Calcula la suma acumulada de los números del 1 al 100. |
| `semana_03_ejercicio05.java` | Solicita una contraseña y permite un máximo de tres intentos. |
| `semana_03_ejercicio06.java` | Solicita un número hasta que sea positivo. |
| `semana_03_ejercicio07.java` | Solicita una palabra hasta que sea equivalente a `Guatemala`. |
| `semana_03_practica_guiada.java` | Integra condiciones, ciclos, validaciones y un menú interactivo. |

---

## Validación de texto

El ejercicio `semana_03_ejercicio07.java` solicita una palabra hasta que el usuario escriba `Guatemala`.

La comparación acepta variaciones en mayúsculas, minúsculas y espacios al inicio o al final:

```java
palabraCorrecta = palabra
        .trim()
        .equalsIgnoreCase("Guatemala");
```

Métodos utilizados:

- `trim()`: elimina espacios al inicio y al final.
- `equalsIgnoreCase()`: compara textos sin diferenciar mayúsculas y minúsculas.

Ejemplos aceptados:

```text
Guatemala
GUATEMALA
guatemala
 GuAtEmAlA 
```

---

## Práctica guiada

El archivo `semana_03_practica_guiada.java` contiene un menú con las siguientes opciones:

1. Calcular el total de una compra.
2. Validar y clasificar una nota.
3. Mostrar una tabla de multiplicar.
4. Salir del programa.

En esta práctica se integran:

- Entrada de datos con `Scanner`.
- Condiciones simples y compuestas.
- Validación de rangos.
- Estructura `switch`.
- Ciclo `for`.
- Ciclo `do while`.
- Uso de `break`.

---

## Estructura del proyecto

```text
semana-03-ciclos-condiciones/
├── src/
│   ├── semana_03_condiciones.java
│   ├── semana_03_do_while.java
│   ├── semana_03_ejemplo1.java
│   ├── semana_03_ejemplo2.java
│   ├── semana_03_ejercicio01.java
│   ├── semana_03_ejercicio02.java
│   ├── semana_03_ejercicio03.java
│   ├── semana_03_ejercicio04.java
│   ├── semana_03_ejercicio05.java
│   ├── semana_03_ejercicio06.java
│   ├── semana_03_ejercicio07.java
│   ├── semana_03_for_1.java
│   ├── semana_03_for_2.java
│   ├── semana_03_practica_guiada.java
│   ├── semana_03_switch.java
│   ├── semana_03_while_1.java
│   ├── semana_03_while_2_break.java
│   └── semana_03_while_3_continue.java
├── .gitignore
└── README.md
```

---

## Ejecución en IntelliJ IDEA

1. Abrir el proyecto en IntelliJ IDEA.
2. Localizar la carpeta `src`.
3. Abrir el archivo que se desea ejecutar.
4. Presionar el botón **Run** junto al método `main`.
5. Revisar el resultado en la consola.

Cada archivo contiene su propio método `main`, por lo que los ejemplos pueden ejecutarse de forma independiente.

---

## Uso del repositorio durante la clase

Este repositorio contiene los ejemplos desarrollados por el docente durante la explicación de la **Semana 03**. Cada archivo puede ejecutarse de forma independiente para observar el funcionamiento de una estructura específica.

La secuencia recomendada para utilizar los ejemplos es:

1. Ejecutar el programa tal como se encuentra.
2. Analizar la condición o ciclo utilizado.
3. Modificar valores, límites y condiciones.
4. Predecir el resultado antes de volver a ejecutarlo.
5. Comparar diferentes formas de resolver el mismo problema.

Los archivos no representan una tarea ni una entrega del estudiante; constituyen el código base y el material de apoyo utilizado durante la clase.

---

## Reto adicional

Construir un programa con un menú que permita:

1. Mostrar números de 5 en 5 hasta 100.
2. Realizar un conteo regresivo de 20 a 0.
3. Mostrar números pares del 1 al 50.
4. Solicitar una contraseña con tres intentos.
5. Solicitar una palabra hasta ingresar `Guatemala`.
6. Salir.

El menú debe repetirse mediante `do while` y procesar las opciones mediante `switch`.

---

## Curso

**Programación II**  
**Módulo I:** Fundamentos de Java  
**Semana 03:** Condiciones y ciclos
