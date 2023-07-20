package PersonasExcepciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

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

       // Solicitar la propiedad por la cual se desea ordenar
       Scanner scanner = new Scanner(System.in);
       scanner.close();
       System.out.print("\nIngresa el nombre de la propiedad por la cual deseas ordenar (nombre/edad): ");
       String propiedadOrdenamiento = scanner.nextLine();

       // Ordenar las personas por la propiedad ingresada
       try {
        Comparator<Persona> comparator = (p1, p2) -> {
            try {
                Object prop1 = p1.obtenerPropiedad(propiedadOrdenamiento);
                Object prop2 = p2.obtenerPropiedad(propiedadOrdenamiento);

                if (prop1 instanceof Comparable<?> && prop2 instanceof Comparable<?>) {
                    @SuppressWarnings("unchecked")
                    Comparable<Object> comparableProp1 = (Comparable<Object>) prop1;
                    return comparableProp1.compareTo(prop2);
                } else {
                    throw new IllegalArgumentException("La propiedad ingresada no es comparable.");
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                throw new IllegalArgumentException("La propiedad ingresada no existe en el objeto Persona.");
            }
        };

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);

        Collections.sort(personas, comparator);

        System.out.println("\nPersonas ordenadas por " + propiedadOrdenamiento + ":");
        for (Persona persona : personas) {
            System.out.println(persona.nombre + " - " + persona.edad + " - " + persona.pais.nombre);
        }
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}

}
