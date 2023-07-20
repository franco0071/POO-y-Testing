/*Crea una clase Auto que tenga los campos marca, modelo y año. Luego, genera varios objetos Auto
 con diferentes valores y muestra sus atributos en la consola. 

Debes crear métodos constructores con distintas cantidades de parámetros para crear un menú de
 opciones donde el usuario pueda elegir los datos que desea ingresar, dependiendo de la opción que elija 
 se llamará un constructor o a otro.  */

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner miscaopcion = new Scanner(System.in);
        Autos auto1 = new Autos("Fiat","Siena",2020);
        Autos auto2 = new Autos("Peugeot","206",2021);
        Autos auto3 = new Autos("Citroen","C3",2022);

        System.out.println("Ingrese valores del 1 al 3 para ver los autos almacenados: ");

        int opcion = miscaopcion.nextInt();

        switch (opcion) {
            case 1:
                auto1.imprimirAuto();
                break;
            case 2:
                auto2.imprimirAuto();
                break;
            case 3:
                auto3.imprimirAuto();
                break;
            default:
                break;
        }
       miscaopcion.close(); 
    } 
}


