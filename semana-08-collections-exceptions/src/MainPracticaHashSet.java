import java.util.HashSet;
import java.util.Scanner;

public class MainPracticaHashSet {

    public static void main(String[] args) {
        HashSet<String> codigos = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos códigos desea ingresar?: ");
        String entrada = scanner.nextLine();

        try {
            int cantidad = Integer.parseInt(entrada);

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
            } else {
                for (int i = 1; i <= cantidad; i++) {
                    System.out.print("Ingrese el código " + i + ": ");
                    String codigo = scanner.nextLine().trim();
                    boolean agregado = codigos.add(codigo);

                    if (agregado) {
                        System.out.println("Código registrado.");
                    } else {
                        System.out.println("El código ya existe.");
                    }
                }
            }
        } catch (NumberFormatException error) {
            System.out.println("Debe ingresar una cantidad numérica.");
        }

        System.out.println("\n=== CÓDIGOS REGISTRADOS ===");

        for (String codigo : codigos) {
            System.out.println(codigo);
        }

        System.out.println("Total sin duplicados: " + codigos.size());
        System.out.println("El programa continúa.");
    }
}