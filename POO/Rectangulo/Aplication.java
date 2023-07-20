package Rectangulo;

import java.util.Scanner;

public class Aplication {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de rectángulos a crear: ");
        int cantidadRectangulos = scanner.nextInt();

        Rectangulo[] rectángulos = new Rectangulo[cantidadRectangulos];

        for (int i = 0; i < cantidadRectangulos; i++) {
            System.out.println("Rectángulo " + (i + 1));
            System.out.print("Ingrese el ancho: ");
            double ancho = scanner.nextDouble();
            System.out.print("Ingrese el alto: ");
            double alto = scanner.nextDouble();

            rectángulos[i] = new Rectangulo(ancho, alto);
        }

        System.out.println("=== Información de los rectángulos ===");
        for (int i = 0; i < cantidadRectangulos; i++) {
            Rectangulo rectángulo = rectángulos[i];
            System.out.println("Rectángulo " + (i + 1));
            System.out.println("Ancho: " + rectángulo.getAncho());
            System.out.println("Alto: " + rectángulo.getAlto());
            System.out.println("Área: " + rectángulo.área());
            System.out.println("Perímetro: " + rectángulo.perímetro());
            System.out.println();
        }

        System.out.println("Cantidad total de rectángulos creados: " + Rectangulo.getContadorRectangulos());
        scanner.close();
    }
}