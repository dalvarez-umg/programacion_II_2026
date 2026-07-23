public class semana_03_while_1 {
    public static void main(String[] args) {
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("1. Registrar");
            System.out.println("2. Consultar");
            System.out.println("3. Salir");

            opcion++;
        }
    }
}
