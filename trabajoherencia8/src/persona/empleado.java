package persona;

import java.util.Date;

public class empleado extends persona {
    private double sueldo;

    public empleado(String nombre, Date fechaNacimiento, double sueldo) {
        super(nombre, fechaNacimiento); 
        this.sueldo = sueldo;
    }

    public void trabajar() {
        System.out.println(getNombre() + " está trabajando.");
    }

    public void cobrar() {
        System.out.println(getNombre() + " ha cobrado un sueldo de $" + sueldo);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
