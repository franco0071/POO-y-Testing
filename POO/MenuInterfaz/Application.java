package MenuInterfaz;

public class Application {
    public static void main(String[] args) {
        MenuServicio[] menus = {
                new MenuOpcionesNumericasServicio(),
                new MenuOpcionesLetrasServicio()
        };

        MenuServicio menuGeneral = new MenuGeneralServicio(menus);
        menuGeneral.iniciar();
    }
}
