import java.util.ArrayList;

public class MainArrayListVetCare {

    public static void main(String[] args) {
        ArrayList<Mascota> pacientes = new ArrayList<>();

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

        System.out.println("=== VETCARE CON ARRAYLIST ===");

        System.out.println("Pacientes registrados: "+ pacientes.size());

        for (Mascota paciente : pacientes) {
            System.out.println("\n-----------------------------");
            System.out.println(paciente.mostrarInformacion());
            paciente.emitirSonido();
            System.out.println("Costo de consulta: Q" + paciente.calcularCostoConsulta());
        }

        // Elimina el elemento de la posición 2.
        pacientes.remove(2);
        System.out.println("\nDespués de eliminar una posición:");
        System.out.println("Pacientes registrados: " + pacientes.size());
    }
}