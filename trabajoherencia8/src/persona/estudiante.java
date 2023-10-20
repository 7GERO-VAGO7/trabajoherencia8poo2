package persona;

import java.util.Date;

public class estudiante extends persona {
    private long codigo;

    public estudiante(String nombre, Date fechaNacimiento, long codigo) {
        super(nombre, fechaNacimiento); 
        this.codigo = codigo;
    }

    public void aprobar() {
        System.out.println(getNombre() + " con código " + codigo + " ha aprobado.");
    }

    public void reprobar() {
        System.out.println(getNombre() + " con código " + codigo + " ha reprobado.");
    }
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
}

	

