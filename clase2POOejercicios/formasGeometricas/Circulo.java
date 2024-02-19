package clase2POOejercicios.formasGeometricas;

public class Circulo implements calculosFormas{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}
