package MenuInterfaz;


interface MenuServicio {
    void imprimirTitulo();
    void imprimirOpciones();
    Integer obtenerOpcion();
    void seleccionarOpcion(Integer opcion);
    Boolean validarSalida(Integer opcion);
    void saludo();

    default void iniciar() {
        imprimirTitulo();
        imprimirOpciones();
        Integer opcion = obtenerOpcion();
        seleccionarOpcion(opcion);
        if (!validarSalida(opcion)) {
            iniciar();
        } else {
            saludo();
        }
    }
}
