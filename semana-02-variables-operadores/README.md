# Semana 2 — Variables y operadores

Proyecto desarrollado durante la segunda semana del curso **Programación II**.

---

## Objetivo

Comprender cómo almacenar información en Java mediante variables y utilizar operadores para realizar cálculos y comparaciones.

---

## Temas estudiados

- Creación de proyectos en IntelliJ IDEA.
- Estructura básica de un proyecto Java.
- Clases y método principal.
- Variables.
- Tipos de datos.
- Operadores aritméticos.
- Operadores comparativos.
- Operadores lógicos.
- Entrada de datos con `Scanner`.
- Salida de datos en consola.

---

## Tipos de datos utilizados

| Tipo | Uso | Ejemplo |
|---|---|---|
| `String` | Texto | `"Andrea"` |
| `int` | Números enteros | `20` |
| `double` | Números decimales | `85.50` |
| `boolean` | Verdadero o falso | `true` |
| `char` | Un carácter | `'A'` |

---

## Ejemplo básico

```java
public class Main {

    public static void main(String[] args) {
        String nombre = "Andrea";
        int edad = 20;
        double promedio = 85.5;
        boolean aprobado = promedio >= 61;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("¿Aprobó?: " + aprobado);
    }
}