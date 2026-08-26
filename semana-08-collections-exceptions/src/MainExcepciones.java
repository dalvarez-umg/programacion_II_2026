import java.util.Scanner;

public class MainExcepciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad en meses: ");

        String entrada = scanner.nextLine();

        try {
            int edadMeses = Integer.parseInt(entrada);

            if (edadMeses >= 0) {
                System.out.println("Edad registrada: " + edadMeses);
            } else {
                System.out.println("La edad no puede ser negativa.");
            }

        } catch (NumberFormatException error) {
            System.out.println("Debe ingresar un número entero.");
        }

        System.out.println("El programa continúa.");
    }
}