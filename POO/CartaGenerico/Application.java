/*Crea una clase Carta que reciba dos enums como genéricos. Un enum será para el valor que 
puede representar la carta, y otro enum es para el palo de la carta.*/

package CartaGenerico;

public class Application {
        public static void main(String[] args) {
            Carta<ValorCarta, PaloCarta> carta = new Carta<>(ValorCarta.AS, PaloCarta.CORAZONES);
            System.out.println(carta); // Imprime: AS de CORAZONES
        }
    }
    
    enum ValorCarta {
        AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, DIEZ, J, Q, K
    }
    
    enum PaloCarta {
        PICAS, CORAZONES, DIAMANTES, TREBOLES
    }
    

