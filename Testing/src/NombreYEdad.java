
import java.util.Scanner ;

public class NombreYEdad {
 public static void main(String[] args)  {
        Scanner scanner = new Scanner (System.in) ;   

    // Solicitar al usuario su nombre
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine();

    // Solicitar al usuario su edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

    // Imprimir mensaje con el nombre y la edad del usuario
        System.out.println("Su nombre es " + nombreUsuario + " y su edad es " + edad);

    scanner.close();

    }
}



