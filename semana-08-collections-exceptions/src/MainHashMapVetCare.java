import java.util.HashMap;

public class MainHashMapVetCare {

    public static void main(String[] args) {
        HashMap<String, Mascota> pacientes = new HashMap<>();

        Mascota luna = new Perro(
                "VET-001",
                "Luna",
                14,
                24.5,
                "Mestiza"
        );

        Mascota milo = new Gato(
                "VET-002",
                "Milo",
                24,
                4.8,
                true
        );

        Mascota piolin = new Ave(
                "VET-003",
                "Piolín",
                10,
                0.4,
                "Exótica"
        );

        registrarPaciente(pacientes, luna);
        registrarPaciente(pacientes, milo);
        registrarPaciente(pacientes, piolin);

        // Intento de registrar otra vez a Luna.
        registrarPaciente(pacientes, luna);
        buscarPaciente(pacientes, "VET-002");
        buscarPaciente(pacientes, "VET-999");
        pacientes.remove("VET-003");
        System.out.println("Pacientes registrados: " + pacientes.size());
    }

    public static void registrarPaciente(HashMap<String, Mascota> pacientes, Mascota paciente) {
        String codigo = paciente.getCodigoPaciente();

        if (pacientes.containsKey(codigo)) {
            System.out.println("El código ya existe: " + codigo);
        } else {
            pacientes.put(codigo, paciente);
            System.out.println("Paciente registrado: " + codigo);
        }
    }

    public static void buscarPaciente(HashMap<String, Mascota> pacientes, String codigo) {
        if (pacientes.containsKey(codigo)) {
            Mascota encontrada = pacientes.get(codigo);
            System.out.println(encontrada.mostrarInformacion());
        } else {
            System.out.println("Paciente no encontrado: " + codigo);
        }
    }
}