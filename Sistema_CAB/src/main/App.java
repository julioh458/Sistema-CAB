package main;

import model.Alumno;

/**
 *
 * @author Julio Hernández
 */
public class App {
    
    public static void main(String[] args) {
        
        System.out.println("Hola Mundo en Java!");
        Alumno alum = presentacion_Alumno();
        System.out.println("alumno/a = " + alum.getNombre());
        System.out.println("grado = " + alum.getGrado() + " grado");
        
    }
    
    public static Alumno presentacion_Alumno(){
        Alumno alum = new Alumno("Julio","Noveno");
        return alum;
    }
    
}
