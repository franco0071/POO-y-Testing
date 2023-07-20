public class Perro extends Animal {

    private String ladrar;

    public Perro() {
        super();
    }

    public Perro(String nombre, Integer edad, String ladrar) {
        super(nombre, edad);
        this.ladrar = ladrar;
    }

    public String getLadrar() {
        return ladrar;
    }

    public void setLadrar(String ladrar) {
        this.ladrar = ladrar;
    }

    public void ladrar() {
        System.out.println(nombre + " es un perro y está ladrando " + " y tiene " + edad + " años de edad");
    }
}

