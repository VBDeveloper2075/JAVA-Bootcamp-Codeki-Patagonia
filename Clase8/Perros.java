package Clase8;

import java.util.ArrayList;
import java.util.Scanner;

public class Perros {
    public static void main(String[] args) {
        // ArrayList de tipo String
        ArrayList<String> razas = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String raza;
        //
        boolean salir = false;
        while (!salir) {
            System.out.println("Ingrese la raza del perro: ");
            raza = scanner.nextLine();
            razas.add(raza);
            System.out.println("Desea ingresar otra raza? (s/n)");
            if (scanner.nextLine().equals("n")) {
                salir = true;
            }
        }
        System.out.println("Las razas de perros ingresadas son: ");
        for (String razaPerro : razas) {
            System.out.println(razaPerro);
        }
    }
}
