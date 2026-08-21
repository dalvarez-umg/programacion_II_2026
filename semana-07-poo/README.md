# Semana 07 - POO aplicada en Java

## Abstracción y clases abstractas

Este repositorio contiene el código desarrollado durante la Semana 07 del curso **Programación II**. Se continúa la evolución del sistema veterinario de consola **VetCare**, aplicando abstracción, clases abstractas, métodos abstractos, herencia, sobrescritura y polimorfismo.

## Objetivo

Transformar la clase base `Mascota` en una clase abstracta y especializar el comportamiento de las clases `Perro`, `Gato` y `Ave`, comprobando su funcionamiento mediante un arreglo polimórfico de tipo `Mascota[]`.

## Temas trabajados

- Abstracción como principio de la Programación Orientada a Objetos.
- Clases abstractas.
- Métodos abstractos y métodos concretos.
- Encapsulamiento de atributos.
- Herencia mediante `extends`.
- Uso de `super(...)` en constructores derivados.
- Sobrescritura mediante `@Override`.
- Polimorfismo mediante referencias de tipo `Mascota`.
- Arreglos de objetos y ciclo `for-each`.

## Estructura del proyecto

```text
src/
├── Mascota.java
├── Perro.java
├── Gato.java
├── Ave.java
└── Main.java
```

## Evolución de VetCare

### Clase `Mascota`

La clase `Mascota` se declara como abstracta y contiene los atributos comunes de todos los pacientes:

- Código del paciente.
- Nombre.
- Edad en meses.
- Peso en kilogramos.

También contiene métodos concretos compartidos y los siguientes métodos abstractos:

```java
public abstract void emitirSonido();

public abstract double calcularCostoConsulta();
```

Al ser abstracta, la clase `Mascota` no puede instanciarse directamente:

```java
// No permitido
Mascota mascota = new Mascota(...);
```

Sin embargo, puede utilizarse como tipo de referencia:

```java
Mascota mascota = new Perro(...);
```

### Clases derivadas

Las clases `Perro`, `Gato` y `Ave` heredan de `Mascota`, utilizan `super(...)` en sus constructores e implementan los métodos abstractos según su comportamiento específico.

## Reglas utilizadas para el costo de consulta

| Tipo de paciente | Regla | Costo |
|---|---|---:|
| Perro | Peso menor o igual a 25 kg | Q100.00 |
| Perro | Peso mayor a 25 kg | Q125.00 |
| Gato | Vive en el interior | Q90.00 |
| Gato | No vive en el interior | Q105.00 |
| Ave | Tipo común | Q75.00 |
| Ave | Tipo exótica | Q105.00 |

> Las tarifas utilizadas son ficticias y tienen fines académicos.

## Polimorfismo en `Main`

Los diferentes tipos de pacientes se almacenan en un mismo arreglo:

```java
Mascota[] pacientes = {
    new Perro(...),
    new Gato(...),
    new Ave(...)
};
```

El arreglo se recorre mediante un ciclo `for-each`:

```java
for (Mascota paciente : pacientes) {
    System.out.println(paciente.mostrarInformacion());
    paciente.emitirSonido();
    System.out.println(
        "Costo de consulta: Q"
        + paciente.calcularCostoConsulta()
    );
}
```

Aunque la referencia `paciente` es de tipo `Mascota`, Java ejecuta el comportamiento correspondiente al objeto real almacenado: `Perro`, `Gato` o `Ave`.

## Requisitos

- Java Development Kit (JDK) 17 o superior.
- IntelliJ IDEA o cualquier IDE compatible con Java.

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el JDK esté configurado correctamente.
3. Ejecutar la clase `Main.java`.
4. Comprobar en consola la información, sonidos y costos de cada paciente.

## Resultado esperado

El programa debe:

- Registrar diferentes tipos de mascotas.
- Mostrar la información de cada paciente.
- Ejecutar un sonido diferente según la clase derivada.
- Calcular el costo correspondiente a cada tipo de consulta.
- Demostrar polimorfismo mediante el arreglo `Mascota[]`.
- Permitir actualizar el peso mediante un método controlado.

---

**Curso:** Programación II  
**Proyecto:** VetCare  
**Universidad Mariano Gálvez de Guatemala**