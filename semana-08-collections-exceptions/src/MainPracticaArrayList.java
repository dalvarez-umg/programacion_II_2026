import java.util.ArrayList;
import java.util.Scanner;

public class MainPracticaArrayList {

    public static void main(String[] args) {
        ArrayList<Mascota> pacientes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        pacientes.add(
                new Perro(
                        "VET-001",
                        "Luna",
                        14,
                        24.5,
                        "Mestiza"
                )
        );

        pacientes.add(
                new Gato(
                        "VET-002",
                        "Milo",
                        24,
                        4.8,
                        true
                )
        );

        pacientes.add(
                new Ave(
                        "VET-003",
                        "Piolín",
                        10,
                        0.4,
                        "Exótica"
                )
        );

        System.out.println("=== PACIENTES REGISTRADOS ===");
        listarPacientes(pacientes);
        System.out.print("\nIngrese la posición que desea eliminar: ");
        String entrada = scanner.nextLine();
        try {
            int posicion = Integer.parseInt(entrada);
            if (posicion >= 0 && posicion < pacientes.size()) {
                Mascota eliminada = pacientes.remove(posicion);
                System.out.println("Paciente eliminado: " + eliminada.getNombre());
            } else {
                System.out.println("La posición no existe.");
            }
        } catch (NumberFormatException error) {
            System.out.println("Debe ingresar una posición numérica.");
        }

        System.out.println("\n=== LISTADO FINAL ===");
        listarPacientes(pacientes);
        System.out.println("Total: " + pacientes.size());
        System.out.println("El programa continúa.");
    }

    public static void listarPacientes(ArrayList<Mascota> pacientes) {
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println(i + " - " + pacientes.get(i).mostrarInformacion());
        }
    }
}