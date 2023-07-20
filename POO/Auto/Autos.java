public class Autos {

    String marca;
    String modelo;
    Integer año;

    public Autos (String marca, String modelo, Integer año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void imprimirAuto(){
        System.out.println("marca: " + this.marca + " modelo: " + this.modelo + " año: " + this.año);
    }
}