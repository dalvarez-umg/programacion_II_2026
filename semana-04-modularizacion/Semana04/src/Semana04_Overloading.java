public class Semana04_Overloading {
    public static double calcularPromedio(double nota1, double nota2) {
        return (nota1 + nota2)/2;
    }

    public static double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3)/3;
    }

    public static void main(String[] args) {
        double promedioCorto = calcularPromedio(80, 90);
        System.out.println("Promedio Corto: " + promedioCorto);
        double promedioCompleto = calcularPromedio(75, 80, 95);
        System.out.println("Promedio Completo: " + promedioCompleto);
    }
}