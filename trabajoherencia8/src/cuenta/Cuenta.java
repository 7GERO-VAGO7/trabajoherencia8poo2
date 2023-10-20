package cuenta;
import java.util.Scanner;

public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void realizarIngreso(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("deposito exitoso" + cantidad);
        } else {
            System.out.println("El ingreso debe ser mayor que cero.");
        }
    }

    public void realizarRetiro(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("retiro exitoso" + cantidad);
        } else {
            System.out.println("Fondos insuficientes o cantidad de retiro inválida.");
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cuenta miCuenta = new Cuenta(00.0); 
        int opcion;
        do {
            System.out.println("MENU:");
            System.out.println("1. ver mi saldo");
            System.out.println("2. Realizar deposito");
            System.out.println("3. Realizar retiro");
            System.out.println("0. Salir");
            System.out.print(" SELECCIONE UNA OPCION: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: $" + miCuenta.obtenerSaldo());
                    break;
                case 2:
                    System.out.print(" ¿ CUANTO DESEA DEPOSITAR ? ");
                    double ingreso = scanner.nextDouble();
                    miCuenta.realizarIngreso(ingreso);
                    break;
                case 3:
                    System.out.println(" ¿ CUANTO DESEA RETIRAR ? ");
                    double retiro = scanner.nextDouble();
                    miCuenta.realizarRetiro(retiro);
                    break;
                case 0:
                    System.out.println("fin de la consulta !muchas gracias por la visita¡ ");
                    break;
                default:
                    System.out.println(" Opción no válida. Intente de nuevo. ");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
