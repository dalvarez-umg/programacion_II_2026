import java.util.Scanner;

public class semana_03_ejercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String contraseñaCorrecta = "java123";
        int intentos = 0;
        boolean accesoPermitido = false;

        while (intentos < 3) {
            System.out.print("Ingrese la contraseña: ");
            String contraseña = entrada.nextLine();

            if (contraseña.equals(contraseñaCorrecta)) {
                accesoPermitido = true;
                break;
            }

            intentos++;
            System.out.println("Contraseña incorrecta.");
        }

        if (accesoPermitido) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Cuenta bloqueada.");
        }
    }
}
