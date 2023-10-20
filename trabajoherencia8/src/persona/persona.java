
package persona;


import java.util.Date; 

public class persona {
    private String nombre;
    private Date fechaNacimiento;

    public persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    public void respirar() {
        System.out.println(nombre + " está respirando.");
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    
   }
}


