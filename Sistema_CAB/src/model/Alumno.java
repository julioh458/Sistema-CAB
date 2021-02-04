package model;

/**
 *
 * @author Julio Hernández
 */
public class Alumno {
    
    private String nombre;
    private String grado;

    public Alumno(String nombre, String grado) {
        this.nombre = nombre;
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    
    
}
