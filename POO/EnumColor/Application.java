/*Crea un enum llamado "Color" que represente los colores primarios: ROJO, VERDE y AZUL.
 Cada constante del enum debe tener una propiedad adicional llamada "valorHexadecimal" que 
 represente el valor hexadecimal del color. Luego, crea una clase llamada "ConvertidorColor" 
 que tenga un método llamado "convertirHexadecimal" que tome como parámetro un valor hexadecimal y
 devuelva el color correspondiente del enum. */

package EnumColor;


public class Application {
    public static void main(String[] args) {
        String valorHex = "#FF0000";
        Color color = ConvertidorColor.convertirHexadecimal(valorHex);
        if (color != null) {
            System.out.println("El color correspondiente al valor hexadecimal " + valorHex + " es: " + color.name());
        } else {
            System.out.println("No se encontró ningún color correspondiente al valor hexadecimal " + valorHex);
        }
    }
}

class ConvertidorColor {
    public static Color convertirHexadecimal(String valorHexadecimal) {
        for (Color color : Color.values()) {
            if (color.getValorHexadecimal().equalsIgnoreCase(valorHexadecimal)) {
                return color;
            }
        }
        return null;
    }
}
