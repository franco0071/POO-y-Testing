package MenuInterfaz;

import java.util.Scanner;

class MenuOpcionesLetrasServicio implements MenuServicio {
    @Override
    public void imprimirTitulo() {
        System.out.println("Menú con Opciones de Letras");
    }

    @Override
    public void imprimirOpciones() {
        System.out.println("A. Opción A");
        System.out.println("B. Opción B");
        System.out.println("C. Opción C");
        System.out.println("0. Volver al menú anterior");
    }

    @Override
    public Integer obtenerOpcion() {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        System.out.print("Ingrese su opción: ");
        String opcion = scanner.nextLine();
        return (int) opcion.charAt(0);
    }

    @Override
    public void seleccionarOpcion(Integer opcion) {
        switch (opcion) {
            case (int) 'A':
                System.out.println("Ejecutando Opción A...");
                break;
            case (int) 'B':
                System.out.println("Ejecutando Opción B...");
                break;
            case (int) 'C':
                System.out.println("Ejecutando Opción C...");
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