import java.util.Scanner;

public class semana_03_ejercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String palabra;
        boolean palabraCorrecta;

        do {
            System.out.print("Escriba la palabra Guatemala: ");
            palabra = entrada.nextLine();

            palabraCorrecta = palabra
                    .trim()
                    .equalsIgnoreCase("Guatemala");

            if (!palabraCorrecta) {
                System.out.println("Palabra incorrecta. Intente nuevamente.");
            }

        } while (!palabraCorrecta);

        System.out.println("¡Palabra correcta!");

        entrada.close();
    }
}
