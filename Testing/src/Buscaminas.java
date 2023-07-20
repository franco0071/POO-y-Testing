import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Buscaminas {
    public static final char MINA = 'M';
    public static final char INEXPLORADO = 'X';
    public static final char VACIO = 'O';

    char[][] mapa;
    char[][] juego;
    int filas;
    int columnas;
    int minas;

    public static void main(String[] args) {
        Buscaminas buscaminas = new Buscaminas();
        buscaminas.menu();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("===== MENÚ =====");
            System.out.println("1. Configuración");
            System.out.println("2. Empezar juego");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    configurarJuego(scanner);
                    break;
                case 2:
                    if (mapa != null) {
                        empezarJuego();
                        jugar(scanner);
                    } else {
                        System.out.println("¡Debes configurar el juego primero!");
                    }
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo nuevamente.");
                    break;
            }
        } while (opcion != 3);
        scanner.close();
    }

    public void configurarJuego(Scanner scanner) {
        System.out.print("Ingresa el número de filas del mapa: ");
        filas = scanner.nextInt();
        System.out.print("Ingresa el número de columnas del mapa: ");
        columnas = scanner.nextInt();
        System.out.print("Ingresa el número de minas: ");
        minas = scanner.nextInt();
        generarMapa();
    }

    public void generarMapa() {
        mapa = new char[filas][columnas];
        for (char[] row : mapa) {
            Arrays.fill(row, VACIO);
        }

        Random random = new Random();
        int minasGeneradas = 0;
        while (minasGeneradas < minas) {
            int fila = random.nextInt(filas);
            int columna = random.nextInt(columnas);
            if (mapa[fila][columna] != MINA) {
                mapa[fila][columna] = MINA;
                minasGeneradas++;
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (mapa[i][j] != MINA) {
                    int minasAdyacentes = contarMinasAdyacentes(i, j);
                    if (minasAdyacentes > 0) {
                        mapa[i][j] = (char) (minasAdyacentes + '0');
                    } else {
                        mapa[i][j] = VACIO;
                    }
                }
            }
        }
    }

    public int contarMinasAdyacentes(int fila, int columna) {
        int count = 0;
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if (i >= 0 && i < filas && j >= 0 && j < columnas && mapa[i][j] == MINA) {
                    count++;
                }
            }
        }
        return count;
    }

    public void empezarJuego() {
        juego = new char[filas][columnas];
        for (char[] row : juego) {
            Arrays.fill(row, INEXPLORADO);
        }
        imprimirMapa(juego);
    }

    public void imprimirMapa(char[][] mapa) {
        System.out.println("    " + getColumnIndices());
        System.out.println("  +" + getHorizontalLine() + "+");
        for (int i = 0; i < filas; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < columnas; j++) {
                System.out.print(" " + mapa[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println("  +" + getHorizontalLine() + "+");
    }

    public String getColumnIndices() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < columnas; i++) {
            sb.append(" ").append(i);
        }
        return sb.toString();
    }

    public String getHorizontalLine() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < columnas; i++) {
            sb.append("--");
        }
        return sb.toString();
    }

    public void jugar(Scanner scanner) {
        while (true) {
            System.out.print("Ingresa las coordenadas (fila:columna): ");
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            if (mapa[fila][columna] == MINA) {
                System.out.println("¡Has explotado una mina! ¡Perdiste!");
                break;
            } else if (Character.isDigit(mapa[fila][columna])) {
                juego[fila][columna] = mapa[fila][columna];
                imprimirMapa(juego);
            } else if (mapa[fila][columna] == VACIO && juego[fila][columna] == INEXPLORADO) {
                expandirCeldasVacias(fila, columna);
                imprimirMapa(juego);
            }

            if (verificarVictoria()) {
                System.out.println("Descubriste todas las celdas sin explotar una mina. ¡Felicitaciones!");
                break;
            }
        }
    }

    public void expandirCeldasVacias(int fila, int columna) {
        juego[fila][columna] = VACIO;
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if (i >= 0 && i < filas && j >= 0 && j < columnas && juego[i][j] == INEXPLORADO) {
                    if (mapa[i][j] != MINA && mapa[i][j] != VACIO) {
                        juego[i][j] = mapa[i][j];
                    } else if (mapa[i][j] == VACIO) {
                        expandirCeldasVacias(i, j);
                    }
                }
            }
        }
    }

    public boolean verificarVictoria() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (juego[i][j] == INEXPLORADO && mapa[i][j] != MINA) {
                    return false;
                }
            }
        }
        return true;
    }
}
