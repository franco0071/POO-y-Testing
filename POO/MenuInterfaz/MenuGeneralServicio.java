package MenuInterfaz;

import java.util.Scanner;

class MenuGeneralServicio implements MenuServicio {
    private MenuServicio[] menus;
    

    public MenuGeneralServicio(MenuServicio[] menus) {
        this.menus = menus;
    }

    @Override
    public void imprimirTitulo() {
        System.out.println("Menú General");
    }

    @Override
    public void imprimirOpciones() {
        System.out.println("1. Menú 1");
        System.out.println("2. Menú 2");
        System.out.println("3. Menú 3");
        System.out.println("0. Salir");
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
        if (opcion >= 0 && opcion <= menus.length) {
            menus[opcion - 1].iniciar();
        } else {
            System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
        }
    }

    @Override
    public Boolean validarSalida(Integer opcion) {
        return opcion == 0;
    }

    @Override
    public void saludo() {
        System.out.println("¡Hasta luego!");
    }
    
}