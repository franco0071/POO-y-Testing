import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class BuscaminasTest {

    private Buscaminas buscaminas;

    @BeforeEach
    public void setup() {
        buscaminas = new Buscaminas();
    }

    @Test
    public void testConfigurarJuego() {
        String input = "3\n3\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        buscaminas.configurarJuego(scanner);

        Assertions.assertEquals(3, buscaminas.filas);
        Assertions.assertEquals(3, buscaminas.columnas);
        Assertions.assertEquals(2, buscaminas.minas);
    }

    @Test
    public void testGenerarMapa() {

    buscaminas.filas = 3;
    buscaminas.columnas = 3;
    buscaminas.minas = 2;

    buscaminas.generarMapa();

    char[][] mapa = buscaminas.mapa;

    int minasCount = 0;
    for (char[] row : mapa) {
        for (char cell : row) {
            if (cell == Buscaminas.MINA) {
                minasCount++;
            }
        }
    }

    Assertions.assertEquals(2, minasCount);
}

    @Test
    public void testContarMinasAdyacentes() {
        buscaminas.filas = 3;
        buscaminas.columnas = 3;
        buscaminas.minas = 2;
        buscaminas.generarMapa();

        int minasAdyacentes = buscaminas.contarMinasAdyacentes(1, 1);

        Assertions.assertTrue(minasAdyacentes >= 0 && minasAdyacentes <= 8);
    }

    @Test
    public void testEmpezarJuego() {
        buscaminas.filas = 3;
        buscaminas.columnas = 3;
        buscaminas.minas = 2;

        buscaminas.empezarJuego();

        char[][] juego = buscaminas.juego;

        int inexploradoCount = 0;
        for (char[] row : juego) {
            for (char cell : row) {
                if (cell == Buscaminas.INEXPLORADO) {
                    inexploradoCount++;
                }
            }
        }

        Assertions.assertEquals(3 * 3, inexploradoCount);
    }

  @Test
    public void testExpandirCeldasVacias() {
       buscaminas.filas = 3;
       buscaminas.columnas = 3;
       buscaminas.minas = 0;
       buscaminas.generarMapa();
       buscaminas.empezarJuego();

       buscaminas.expandirCeldasVacias(1, 1);

       char[][] juego = buscaminas.juego;

       // Verificar que todas las celdas vacías y adyacentes se hayan expandido

       for (int i = 0; i < buscaminas.filas; i++) {
        for (int j = 0; j < buscaminas.columnas; j++) {
            if (buscaminas.mapa[i][j] == Buscaminas.VACIO) {
                Assertions.assertEquals(Buscaminas.VACIO, juego[i][j]);
            }
        }
    }
}


    @Test
    public void testVerificarVictoria() {
        buscaminas.filas = 3;
        buscaminas.columnas = 3;
        buscaminas.minas = 2;
        buscaminas.generarMapa();
        buscaminas.empezarJuego();

        boolean victoria = buscaminas.verificarVictoria();

        Assertions.assertFalse(victoria);

        // Explorar todas las celdas sin explotar una mina
        for (int i = 0; i < buscaminas.filas; i++) {
            for (int j = 0; j < buscaminas.columnas; j++) {
                if (buscaminas.mapa[i][j] != Buscaminas.MINA) {
                    buscaminas.juego[i][j] = buscaminas.mapa[i][j];
                }
            }
        }

        victoria = buscaminas.verificarVictoria();

        Assertions.assertTrue(victoria);
    }

   @Test
public void testJugar() {
    // Simular entrada de usuario
    String input = "0\n0\n1\n1\n";
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);

    // Crear nuevo Scanner usando la entrada simulada
    Scanner scanner = new Scanner(System.in);

    buscaminas.filas = 3;
    buscaminas.columnas = 3;
    buscaminas.minas = 2;
    buscaminas.generarMapa();
    buscaminas.empezarJuego();

    buscaminas.jugar(scanner);

    char[][] juego = buscaminas.juego;

    Assertions.assertEquals(Buscaminas.INEXPLORADO, juego[0][0]);
     Assertions.assertEquals(Buscaminas.INEXPLORADO, juego[1][1]);

    // Restaurar la entrada estándar original
    System.setIn(System.in);
}



    // Pruebas adicionales para cubrir otros métodos

   @Test
    public void testGetColumnIndices() {
       buscaminas.columnas = 3;

       String columnIndices = buscaminas.getColumnIndices();

       Assertions.assertEquals(" 0 1 2", columnIndices);
}

    @Test
    public void testGetHorizontalLine() {
        buscaminas.columnas = 3;

        String horizontalLine = buscaminas.getHorizontalLine();

        Assertions.assertEquals("------", horizontalLine);
    }

}

