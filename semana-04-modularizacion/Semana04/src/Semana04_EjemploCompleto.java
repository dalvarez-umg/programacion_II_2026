import java.util.Scanner;

public class Semana04_EjemploCompleto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese nota 3: ");
        double nota3 = scanner.nextDouble();

        double promedio = calcularPromedio(nota1, nota2, nota3);
        String literal = obtenerLiteral(promedio);
        boolean aprobado = estaAprobado(promedio);

        mostrarResultado(nombre, promedio, literal, aprobado);
    }

    public static double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static String obtenerLiteral(double promedio) {
        if (promedio >= 90) {
            return "Excelente";
        } else if (promedio >= 70) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    public static boolean estaAprobado(double promedio) {
        return promedio >= 70;
    }

    public static void mostrarResultado(String nombre, double promedio,
                                        String literal, boolean aprobado) {
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Resultado: " + literal);

        if (aprobado) {
            System.out.println("Estado: Aprobó el curso.");
        } else {
            System.out.println("Estado: Debe reforzar los temas.");
        }
    }
}