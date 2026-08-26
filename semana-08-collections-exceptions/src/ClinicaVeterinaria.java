import java.util.ArrayList;

public class ClinicaVeterinaria {
    private ArrayList<Mascota> pacientes;

    public ClinicaVeterinaria() {
        pacientes = new ArrayList<>();
    }

    public boolean registrarPaciente(Mascota mascota) {
        Mascota existente = buscarPorCodigo(mascota.getCodigoPaciente());
        if (existente != null) {
            return false;
        }
        pacientes.add(mascota);
        return true;
    }

    public int obtenerCantidadPacientes() {
        return pacientes.size();
    }

    public void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
            return;
        }

        for (Mascota paciente : pacientes) {
            System.out.println("\n-----------------------------");
            System.out.println(paciente.mostrarInformacion());
            paciente.emitirSonido();
            System.out.println("Costo de consulta: Q" + paciente.calcularCostoConsulta());
        }
    }

    public Mascota buscarPorCodigo(String codigo) {
        for (Mascota paciente : pacientes) {
            if (paciente.getCodigoPaciente().equalsIgnoreCase(codigo)) {
                return paciente;
            }
        }
        return null;
    }

    public boolean modificarPeso(String codigo, double nuevoPeso) {
        Mascota paciente = buscarPorCodigo(codigo);
        if (paciente == null || nuevoPeso <= 0) {
            return false;
        }
        paciente.actualizarPeso(nuevoPeso);
        return true;
    }

    public boolean eliminarPaciente(String codigo) {
        Mascota paciente = buscarPorCodigo(codigo);
        if (paciente == null) {
            return false;
        }
        pacientes.remove(paciente);
        return true;
    }
}