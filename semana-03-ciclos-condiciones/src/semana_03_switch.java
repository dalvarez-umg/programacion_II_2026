public class semana_03_switch {
    public static void main(String[] args) {
        int opcion = 2;

        switch (opcion) {
            case 1:
                System.out.println("Registrar producto");
                break;
            case 2:
                System.out.println("Calcular venta");
                break;
            case 3:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
}
