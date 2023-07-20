/*Crea una superclase llamada Animal con características generales como nombre y edad,
 y métodos como comer y dormir. 

Luego, crea dos subclases, Perro y Gato, que hereden de Animal. Cada subclase debe tener al 
menos una característica y un método únicos. Por ejemplo, Perro puede tener un método ladrar y
 Gato un método ronronear. */

 public class ApplicationAnimal {
    public static void main(String[] args) {

        Perro perro = new Perro("Fido", 3, "Guau");
        perro.comer();  // Salida: Fido está comiendo.
        perro.dormir();  // Salida: Fido está durmiendo.
        perro.ladrar();  // Salida: Fido está ladrando.

        Gato gato = new Gato("Pelusa", 4, "Prrr");
        gato.comer();  // Salida: Pelusa está comiendo.
        gato.dormir();  // Salida: Pelusa está durmiendo.
        gato.ronronear();  // Salida: Pelusa está ronroneando.
    }
}