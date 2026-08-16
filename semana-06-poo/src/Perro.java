public class Perro extends Mascota {

    private String raza;

    public Perro(
            String nombre,
            int edadMeses,
            double pesoKg,
            String raza) {

        super(nombre, edadMeses, pesoKg);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public void emitirSonido() {
        System.out.println(
                getNombre() + ": ¡Guau!");
    }
}