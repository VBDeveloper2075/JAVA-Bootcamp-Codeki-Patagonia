package clase2POOejercicios;//2- Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
//atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
//operaciones asociadas a dicha clase son:
//        ● Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
// ● Agregar los métodos getters y setters correspondientes
// ● Método para crear un objeto Cuenta, pidiéndole los datos al usuario.
// ● Método ingresar(double ingreso): el método recibe una cantidad de dinero a
//ingresar y se la sumará al saldo actual.
//        ● Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
//se le restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
//        ● Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo.
// ● Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//        ● MétodoconsultarDatos(): permitirá mostrar todos los datos de la cuenta.

import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.crearCuenta(123456, 123456789, 10000);
        cuenta.consultarDatos();
        cuenta.ingresarDinero(2500);
        cuenta.consultarSaldo();
        cuenta.retirarDinero(200);
        cuenta.consultarSaldo();
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();

        System.out.println("desea hacer una extraccion rapida?");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine().toLowerCase();
        if (respuesta.equals("si")) {
            double dineroRetirado = cuenta.extraccionRapida();
            System.out.println("Extraccion rapida realizada: " + dineroRetirado);
            cuenta.consultarSaldo();
        }else{
            System.out.println("Gracias por usar nuestros servicios");
        }
    }

    private int numeroCuenta;
    private int dniCliente;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, int dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta(int numeroCuenta, int dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public void ingresarDinero(double ingreso) {
        this.saldoActual += ingreso;
    }

    public void retirarDinero(double retiro) {
        if (this.saldoActual < retiro) {
            this.saldoActual = 0;
        } else {
            this.saldoActual -= retiro;
        }
    }

    public double extraccionRapida() {
        double dineroRetirado = this.saldoActual * 0.2;
        this.saldoActual -= dineroRetirado;
        return dineroRetirado;
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual es: " + this.saldoActual);
    }

    public void consultarDatos() {
        System.out.println("Numero de cuenta: " + this.numeroCuenta);
        System.out.println("DNI del cliente: " + this.dniCliente);
        System.out.println("Saldo actual: " + this.saldoActual);
    }
}
