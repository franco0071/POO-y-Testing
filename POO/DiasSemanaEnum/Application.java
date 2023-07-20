/*Crea un enum llamado "DiaSemana" que represente los días de la semana. Define las constantes 
correspondientes a los días: LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO y DOMINGO. 

Luego en la clase Application que crea un método llamado imprimirDiaLaboral() que tome como 
parámetro una constante de DiaSemana y devuelva un String que diga “Es día de semana” 
o “Es día laboral”. */

package DiasSemanaEnum;

public class Application {

public static void main(String[] args) {

    DiaSemana dia = DiaSemana.LUNES;
    String tipoDia = switch (dia) {
    case LUNES, MARTES, MIERCOLES, JUEVES, VIERNES -> "Día laboral";

    case SABADO, DOMINGO -> "Fin de semana";
  };

    System.out.println(tipoDia);
 }
}