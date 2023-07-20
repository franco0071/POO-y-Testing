public class Gato extends Animal {

    private String ronronear;

    public Gato() {
        super();
    }

    public Gato(String nombre, Integer edad, String ronronear) {
        super(nombre, edad);
        this.ronronear = ronronear;
    }

    public String getRonronear() {
        return ronronear;
    }

    public void setRonronear(String ronronear) {
        this.ronronear = ronronear;
    }

    public void ronronear() {
        System.out.println(nombre + " es un gato está ronroneando" + " y tiene " + edad + " años de edad");
    }
}