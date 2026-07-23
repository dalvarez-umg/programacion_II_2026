import java.util.Scanner;

public class semana_03_ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Ingrese un número positivo: ");
            numero = entrada.nextInt();

            if (numero <= 0) {
                System.out.println("El número no es válido.");
            }

        } while (numero <= 0);

        System.out.println("Número aceptado: " + numero);
    }
}
