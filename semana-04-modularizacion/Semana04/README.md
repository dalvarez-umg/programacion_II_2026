# Semana 04 — Métodos y modularización

Proyecto desarrollado durante la cuarta semana del curso **Programación II**.

En esta semana se aprende a dividir un programa en partes pequeñas y reutilizables mediante métodos. Esto permite que el código sea más claro, fácil de probar, corregir y ampliar.

---

## Objetivo

Aplicar métodos en Java para organizar la solución de un problema, separar responsabilidades y reutilizar instrucciones sin concentrar toda la lógica dentro del método `main`.

Al finalizar la semana, el estudiante podrá:

- Identificar cuándo conviene separar una tarea en un método.
- Crear métodos que realizan acciones mediante `void`.
- Crear métodos que devuelven datos mediante `return`.
- Enviar información utilizando parámetros y argumentos.
- Utilizar métodos que retornan valores numéricos, texto o datos booleanos.
- Reconocer la diferencia básica entre métodos `static` y métodos de instancia.
- Aplicar sobrecarga de métodos o *method overloading*.
- Organizar un programa de consola en módulos con responsabilidades claras.

---

## Temas estudiados

- Modularización de programas.
- Declaración e invocación de métodos.
- Métodos `void`.
- Métodos con valor de retorno.
- Parámetros y argumentos.
- Uso de `return`.
- Métodos que retornan `boolean`.
- Métodos `static` y métodos de instancia.
- Sobrecarga de métodos (*overloading*).
- División de responsabilidades dentro de un programa.

---

## ¿Qué es modularizar?

Modularizar consiste en dividir un problema grande en tareas más pequeñas. Cada método debe tener una responsabilidad concreta y un nombre que permita comprender qué hace.

Por ejemplo, un programa para evaluar estudiantes puede dividirse así:

| Método | Responsabilidad |
|---|---|
| `calcularPromedio` | Calcula el promedio de las notas. |
| `obtenerLiteral` | Determina la clasificación del promedio. |
| `estaAprobado` | Indica si el estudiante aprobó. |
| `mostrarResultado` | Presenta la información en consola. |

En lugar de escribir toda la solución dentro de `main`, este método se encarga principalmente de coordinar las demás partes del programa.

---

## Anatomía de un método

```java
public static double calcularPromedio(double nota1, double nota2, double nota3) {
    return (nota1 + nota2 + nota3) / 3;
}
```

| Parte | Significado |
|---|---|
| `public` | Indica el nivel de acceso del método. |
| `static` | Permite utilizar el método desde la clase sin crear un objeto. |
| `double` | Es el tipo de dato que devuelve el método. |
| `calcularPromedio` | Es el nombre del método. |
| `double nota1, ...` | Son los parámetros que recibe. |
| `return` | Devuelve el resultado al lugar desde donde se llamó el método. |

Los nombres de los métodos deben iniciar, preferiblemente, con un verbo que describa su propósito:

```java
calcularPromedio()
mostrarResultado()
obtenerEstado()
esPar()
```

---

## Métodos `void`

Un método `void` realiza una acción, pero no devuelve un valor.

```java
public static void saludar(String nombre) {
    System.out.println("Bienvenido/a, " + nombre);
}
```

Invocación del método:

```java
saludar("Andrea");
```

En este ejemplo, el método recibe un nombre y muestra un mensaje en la consola.

---

## Métodos con `return`

Un método con retorno calcula, transforma o determina un resultado y lo entrega para que pueda utilizarse posteriormente.

```java
public static int sumar(int numero1, int numero2) {
    return numero1 + numero2;
}
```

El valor retornado puede guardarse en una variable:

```java
int resultado = sumar(8, 12);
System.out.println("La suma es: " + resultado);
```

Un método con `return` no necesariamente imprime el resultado. El dato devuelto también puede utilizarse en una condición, una fórmula o como argumento de otro método.

---

## Parámetros y argumentos

Los **parámetros** son las variables declaradas por el método para recibir información. Los **argumentos** son los valores enviados al invocarlo.

```java
public static void saludar(String nombre) { // nombre es un parámetro
    System.out.println("Hola, " + nombre);
}

saludar("Carlos"); // "Carlos" es un argumento
```

La cantidad, el orden y el tipo de los argumentos deben coincidir con los parámetros definidos por el método.

---

## Métodos que toman decisiones

Un método puede devolver un valor `boolean` para responder una pregunta con `true` o `false`.

```java
public static boolean esPar(int numero) {
    return numero % 2 == 0;
}
```

Su resultado puede utilizarse directamente en una condición:

```java
if (esPar(14)) {
    System.out.println("El número es par");
} else {
    System.out.println("El número es impar");
}
```

---

## Sobrecarga de métodos

La sobrecarga u *overloading* permite crear varios métodos con el mismo nombre, siempre que sus parámetros sean diferentes.

```java
public static double calcularPromedio(double nota1, double nota2) {
    return (nota1 + nota2) / 2;
}

public static double calcularPromedio(double nota1, double nota2, double nota3) {
    return (nota1 + nota2 + nota3) / 3;
}
```

Java determina qué versión debe ejecutar según los argumentos enviados:

```java
double promedioCorto = calcularPromedio(80, 90);
double promedioCompleto = calcularPromedio(75, 80, 95);
```

Para sobrecargar un método debe cambiar al menos uno de estos elementos:

- La cantidad de parámetros.
- El tipo de los parámetros.
- El orden de los tipos de los parámetros.

Cambiar únicamente el tipo de retorno no produce una sobrecarga válida.

---

## `static` y métodos de instancia

Durante esta semana los ejemplos utilizan métodos `static` porque se invocan directamente desde `main`, que también es `static`.

```java
public static void main(String[] args) {
    saludar("Andrea");
}

public static void saludar(String nombre) {
    System.out.println("Hola, " + nombre);
}
```

| Tipo de método | Pertenece a | Forma general de uso |
|---|---|---|
| `static` | La clase | Se utiliza sin crear un objeto. |
| No `static` | Un objeto | Se utiliza mediante una instancia de la clase. |

Los métodos de instancia se estudiarán con mayor profundidad durante la semana de programación orientada a objetos.

---

## Ejemplos incluidos

| Archivo | Descripción |
|---|---|
| `Semana04_Procedimiento.java` | Presenta métodos `void`, parámetros e invocaciones desde `main`. |
| `Semana04_FuncionDecision.java` | Utiliza un método que retorna `boolean` para determinar si un número es par. |
| `Semana04_Overloading.java` | Sobrecarga el método `calcularPromedio` para trabajar con dos o tres notas. |
| `Semana04_EjemploCompleto.java` | Integra entrada de datos, métodos `void`, parámetros, retornos y condiciones en un sistema de evaluación. |
| `Semana04_EstructuraEjercicio.java` | Proporciona la estructura incompleta de la práctica de presupuesto semanal. |

Cada archivo contiene su propio método `main`, por lo que puede ejecutarse de manera independiente.

---

## Ejemplo integrador

El archivo `Semana04_EjemploCompleto.java` contiene un sistema de evaluación académica que solicita:

- Nombre del estudiante.
- Tres notas.

El programa distribuye sus responsabilidades entre los siguientes métodos:

```java
calcularPromedio(...)
obtenerLiteral(...)
estaAprobado(...)
mostrarResultado(...)
```

Este ejemplo integra conceptos estudiados en semanas anteriores, como variables, entrada de datos y condiciones, con la modularización mediante métodos.

---

## Práctica de clase — Control de presupuesto semanal

El archivo `Semana04_EstructuraEjercicio.java` contiene la estructura inicial de un programa que debe solicitar:

- Nombre de la persona.
- Presupuesto semanal.
- Gasto de alimentación.
- Gasto de transporte.
- Otros gastos.

El programa debe calcular y mostrar:

- Total gastado.
- Saldo disponible.
- Estado del presupuesto:
  - `Dentro del presupuesto`.
  - `Presupuesto agotado`.
  - `Excedió el presupuesto`.

Para completar la práctica se deben implementar e invocar estos métodos:

```java
calcularTotalGastos(...)
calcularSaldo(...)
obtenerEstado(...)
mostrarResumen(...)
```

La solución debe utilizar, como mínimo:

- Dos métodos que devuelvan datos.
- Un método `void`.
- Parámetros y argumentos.
- Condiciones.

Ejemplo de resultado esperado:

```text
--- RESUMEN SEMANAL ---
Nombre: Andrea López
Presupuesto: Q500.0
Total gastado: Q425.0
Saldo: Q75.0
Estado: Dentro del presupuesto
```

---

## Estructura del proyecto

```text
Semana04/
├── src/
│   ├── Semana04_EjemploCompleto.java
│   ├── Semana04_EstructuraEjercicio.java
│   ├── Semana04_FuncionDecision.java
│   ├── Semana04_Overloading.java
│   └── Semana04_Procedimiento.java
├── .gitignore
└── README.md
```

Las carpetas `.idea` y `out`, así como el archivo `Semana04.iml`, son archivos generados por IntelliJ IDEA y no forman parte del código fuente que se estudia.

---

## Ejecución en IntelliJ IDEA

1. Abrir el proyecto `Semana04` en IntelliJ IDEA.
2. Localizar la carpeta `src`.
3. Abrir el archivo que se desea ejecutar.
4. Presionar el botón **Run** junto al método `main`.
5. Ingresar los datos solicitados cuando corresponda.
6. Revisar el resultado en la consola.

---

## Uso del repositorio durante la clase

Este repositorio contiene los ejemplos desarrollados por el docente durante la explicación de la **Semana 04**. El código permite observar progresivamente cómo un programa puede organizarse mediante métodos.

La secuencia recomendada es:

1. Ejecutar `Semana04_Procedimiento.java` para identificar métodos `void`.
2. Analizar `Semana04_FuncionDecision.java` para observar un retorno `boolean`.
3. Ejecutar `Semana04_Overloading.java` y comparar sus dos versiones de `calcularPromedio`.
4. Revisar `Semana04_EjemploCompleto.java` para reconocer la división de responsabilidades.
5. Completar `Semana04_EstructuraEjercicio.java` durante la práctica.

Estos archivos constituyen el código base y el material de apoyo utilizado durante la clase. No representan por sí mismos una tarea o entrega en Canvas.

---

## Reto adicional

Agregar una versión sobrecargada del método `calcularTotalGastos` que permita calcular el total utilizando únicamente alimentación y transporte:

```java
public static double calcularTotalGastos(double alimentacion,
                                         double transporte) {
    // Completar
}
```

Después, ejecutar ambas versiones del método y comparar sus resultados.

---

## Próxima semana

En la **Semana 05** se estudiará programación orientada a objetos. Los métodos dejarán de verse únicamente como funciones auxiliares de una clase y comenzarán a representar el comportamiento de objetos con sus propios datos.
