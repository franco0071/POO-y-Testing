package MenuInterfaz;

import java.util.Scanner;

class MenuOpcionesNumericasServicio implements MenuServicio {
    @Override
    public void imprimirTitulo() {
        System.out.println("Menú con Opciones Numéricas");
    }

    @Override
    public void imprimirOpciones() {
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Opción 3");
        System.out.println("0. Volver al menú anterior");
    }

    @Override
    public Integer obtenerOpcion() {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        System.out.print("Ingrese su opción: ");
        return Integer.parseInt(scanner.nextLine());
    }
    

    @Override
    public void seleccionarOpcion(Integer opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Ejecutando Opción 1...");
                break;
            case 2:
                System.out.println("Ejecutando Opción 2...");
                break;
            case 3:
                System.out.println("Ejecutando Opción 3...");
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
                break;
        }
    }

    @Override
    public Boolean validarSalida(Integer opcion) {
        return opcion == 0;
    }

    @Override
    public void saludo() {
        System.out.println("¡Volviendo al menú anterior!");
    }
}
