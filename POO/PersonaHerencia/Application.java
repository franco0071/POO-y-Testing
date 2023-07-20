package PersonaHerencia;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        // Crear una instancia de la clase Pais con el constructor sin argumentos
        Pais pais1 = new Pais();
        ArrayList<String> propiedadesPais1 = pais1.propiedades();

        System.out.println("Propiedades del primer país:");
        for (String propiedad : propiedadesPais1) {
            System.out.println(propiedad);
        }

        // Crear una instancia de la clase Persona con el constructor sin argumentos
        Persona persona1 = new Persona();
        ArrayList<String> propiedadesPersona1 = persona1.propiedades();

        System.out.println("\nPropiedades de la primera persona:");
        for (String propiedad : propiedadesPersona1) {
            System.out.println(propiedad);
        }

        // Crear una instancia de la clase Persona con el constructor que recibe nombre y edad
        Persona persona2 = new Persona("Juan", 25);
        ArrayList<String> propiedadesPersona2 = persona2.propiedades();

        System.out.println("\nPropiedades de la segunda persona:");
        for (String propiedad : propiedadesPersona2) {
            System.out.println(propiedad);
        }

        // Crear una instancia de la clase Persona con el constructor que recibe nombre, edad y nombre del país
        Persona persona3 = new Persona("María", 30, "España");
        ArrayList<String> propiedadesPersona3 = persona3.propiedades();

        System.out.println("\nPropiedades de la tercera persona:");
        for (String propiedad : propiedadesPersona3) {
            System.out.println(propiedad);
        }

        // Crear una instancia de la clase Pais con un nombre específico
        Pais pais2 = new Pais("Brasil");
        ArrayList<String> propiedadesPais2 = pais2.propiedades();
        
        System.out.println("\nPropiedades del segundo país:");
        for (String propiedad : propiedadesPais2) {
            System.out.println(propiedad);
        }

        // Crear una instancia de la clase Persona con el constructor que recibe nombre, edad y una instancia de la clase Pais
        Persona persona4 = new Persona("Pedro", 40, pais2);
        ArrayList<String> propiedadesPersona4 = persona4.propiedades();

        System.out.println("\nPropiedades de la cuarta persona:");
        for (String propiedad : propiedadesPersona4) {
            System.out.println(propiedad);
        }
    }
}
