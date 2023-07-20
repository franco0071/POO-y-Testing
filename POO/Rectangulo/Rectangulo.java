package Rectangulo;

class Rectangulo {
    
    private double ancho;
    private double alto;
    private static int contadorRectangulos = 0;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
        contadorRectangulos++;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double área() {
        return ancho * alto;
    }

    public double perímetro() {
        return 2 * (ancho + alto);
    }

    public static int getContadorRectangulos() {
        return contadorRectangulos;
    }
}