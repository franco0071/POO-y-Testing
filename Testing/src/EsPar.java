/*Ejercicio anterior: Reemplaza la lógica de pedir un número por un método llamado "solicitarNumero()" 
que no reciba parámetros y devuelva un entero. También reemplaza la condición del if por un método 
llamado "esPar()" que reciba por parámetro un entero y devuelva un booleano.

Clase de test: Crea una clase test para testear este ejercicio */

import java.util.Scanner;

public class EsPar {
    public static void main(String[] args) {
        int numero = solicitarNumero();
        boolean esPar = esPar(numero);
        
        if (esPar) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado es impar.");
        }
    }
    
    public static int solicitarNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        scanner.close();
        return numero;
    }
    
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
