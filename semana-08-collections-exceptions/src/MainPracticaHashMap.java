import java.util.HashMap;
import java.util.Scanner;

public class MainPracticaHashMap {

    public static void main(String[] args) {
        HashMap<String, Mascota> pacientes = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        registrarPaciente(pacientes,
                new Perro(
                        "VET-001",
                        "Luna",
                        14,
                        24.5,
                        "Mestiza"
                )
        );

        registrarPaciente(pacientes,
                new Gato(
                        "VET-002",
                        "Milo",
                        24,
                        4.8,
                        true
                )
        );

        registrarPaciente(pacientes,
                new Ave(
                        "VET-003",
                        "Piolín",
                        10,
                        0.4,
                        "Exótica"
                )
        );

        System.out.println("=== OPCIONES ===");
        System.out.println("1. Buscar paciente");
        System.out.println("2. Eliminar paciente");
        System.out.print("Seleccione una opción: ");
        String entrada = scanner.nextLine();

        try {
            int opcion = Integer.parseInt(entrada);
            if (opcion == 1) {
                System.out.print("Ingrese el código que desea buscar: ");
                String codigo = scanner.nextLine().trim();

                Mascota encontrada = pacientes.get(codigo);

                if (encontrada != null) {
                    System.out.println(encontrada.mostrarInformacion());
                } else {
                    System.out.println("Paciente no encontrado.");
                }
            } else if (opcion == 2) {
                System.out.print("Ingrese el código que desea eliminar: ");
                String codigo = scanner.nextLine().trim();
                Mascota eliminada = pacientes.remove(codigo);

                if (eliminada != null) {
                    System.out.println("Paciente eliminado: " + eliminada.getNombre());
                } else {
                    System.out.println("Paciente no encontrado.");
                }
            } else {
                System.out.println("La opción seleccionada no existe.");
            }
        } catch (NumberFormatException error) {
            System.out.println("Debe ingresar una opción numérica.");
        }
        System.out.println("Pacientes registrados: " + pacientes.size());
        System.out.println("El programa continúa.");
    }

    public static void registrarPaciente(HashMap<String, Mascota> pacientes, Mascota paciente) {

        String codigo = paciente.getCodigoPaciente();

        if (pacientes.containsKey(codigo)) {
            System.out.println("El código ya está registrado: " + codigo);
        } else {
            pacientes.put(codigo, paciente);
        }
    }
}