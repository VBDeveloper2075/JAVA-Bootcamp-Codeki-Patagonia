/*
Resolver los siguientes ejercicios aplicando los conceptos de POO
 1- Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 numero2. A continuación, se deben crear los siguientes métodos:
 ● Métodoconstructor con todos los atributos pasados por parámetro.
 ● Métodoconstructor sin los atributos pasados por parámetro.
 ● Métodos get y set.
 ● Métodopara crearOperacion(): que le pide al usuario los dos números y los
 guarda en los atributos del objeto.
 ● Métodosumar(): calcular la suma de los números y devolver el resultado al main.
 ● Métodorestar(): calcular la resta de los números y devolver el resultado al main.
 ● Métodomultiplicar(): primero valida que no se haga una multiplicación por cero,
 si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
 error. Si no, se hace la multiplicación y se devuelve el resultado al main
 ● Métododividir(): primero valida que no se haga una división por cero, si fuera a
 pasar una división por cero, el método devuelve 0 y se le informa al usuario el
 error. Si no, se hace la división y se devuelve el resultado al main.
 */
package clase2POOejercicios;

import java.util.Scanner;

public class Operacion {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        System.out.println("La suma es: " + operacion.sumar());
        System.out.println("La resta es: " + operacion.restar());
        System.out.println("La multiplicación es: " + operacion.multiplicar());
        System.out.println("La división es: " + operacion.dividir());
    }
    private Double numero1;
    private Double numero2;
    public Operacion() {
    }

    public Operacion(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Ingrese el primer número: ");
            this.numero1 = Double.parseDouble(scan.nextLine());
            System.out.println("Ingrese el segundo número: ");
            this.numero2 = Double.parseDouble(scan.nextLine());
        }

    }

    public Double sumar() {
        return numero1 + numero2;
    }

    public Double restar() {
        return numero1 - numero2;
    }

    public Double multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error: No se puede multiplicar por cero");
            return (double) 0;
        }
        return numero1 * numero2;
    }

    public Double dividir() {
        if (numero2 == 0) {
            System.out.println("No se puede dividir por cero");
            return (double) 0;
        }
        return numero1 / numero2;
    }
}
