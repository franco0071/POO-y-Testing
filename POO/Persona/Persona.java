package Persona;
public class Persona {

    String nombre;
    Integer edad;

    public Persona (String nombre, Integer edad){

        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimirNombreYEdad(){

      System.out.println("nombre: " + this.nombre + " edad : " + this.edad);
    }
}