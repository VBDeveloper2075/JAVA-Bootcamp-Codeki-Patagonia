package clase2POOejercicios.formasGeometricas;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        Circulo circulo = new Circulo (5);
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());
        System.out.println("El area del circulo es: " + circulo.calcularArea());
        System.out.println("El perimetro del circulo es: " + circulo.calcularPerimetro());
    }
}
