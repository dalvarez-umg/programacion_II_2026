public class MainColeccionesVetCare {

    public static void main(String[] args) {
        ClinicaVeterinaria clinica = new ClinicaVeterinaria();

        boolean lunaRegistrada = clinica.registrarPaciente(
                        new Perro(
                                "VET-001",
                                "Luna",
                                14,
                                24.5,
                                "Mestiza"
                        )
                );

        clinica.registrarPaciente(
                new Gato(
                        "VET-002",
                        "Milo",
                        24,
                        4.8,
                        true
                )
        );

        clinica.registrarPaciente(
                new Ave(
                        "VET-003",
                        "Piolín",
                        10,
                        0.4,
                        "Exótica"
                )
        );

        System.out.println("Luna registrada: " + lunaRegistrada);

        // Intento de utilizar un código repetido.
        boolean duplicado =
                clinica.registrarPaciente(
                        new Perro(
                                "VET-001",
                                "Max",
                                18,
                                12.0,
                                "Labrador"
                        )
                );

        System.out.println("Paciente duplicado registrado: "+ duplicado);
        System.out.println("\n=== PACIENTES REGISTRADOS ===");
        clinica.listarPacientes();

        System.out.println("\n=== BÚSQUEDA ===");

        Mascota encontrada = clinica.buscarPorCodigo("VET-002");

        if (encontrada != null) {
            System.out.println(encontrada.mostrarInformacion());
        } else {
            System.out.println("Paciente no encontrado.");
        }

        System.out.println("\n=== MODIFICACIÓN ===");

        boolean pesoModificado =
                clinica.modificarPeso(
                        "VET-001",
                        30.0
                );

        if (pesoModificado) {
            Mascota luna = clinica.buscarPorCodigo("VET-001");

            System.out.println(luna.mostrarInformacion());

            System.out.println("Nuevo costo: Q" + luna.calcularCostoConsulta());
        } else {
            System.out.println("No fue posible modificar el peso.");
        }

        System.out.println("\n=== ELIMINACIÓN ===");

        boolean eliminado =
                clinica.eliminarPaciente(
                        "VET-003"
                );

        System.out.println("Paciente eliminado: " + eliminado);
        System.out.println("\n=== LISTADO FINAL ===");
        clinica.listarPacientes();

        System.out.println("\nCantidad final: " + clinica.obtenerCantidadPacientes());
    }
}