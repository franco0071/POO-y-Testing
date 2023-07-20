import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class EsParTest {

    @Test
    public void testEsParNumeroPar() {
        boolean esPar = EsPar.esPar(4);
        assertTrue(esPar);
    }

    @Test
    public void testEsParNumeroImpar() {
        boolean esPar = EsPar.esPar(7);
        assertFalse(esPar);
    }

    @Test
    public void testSolicitarNumero() {
        String input = "42";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int numero = EsPar.solicitarNumero();
        assertEquals(42, numero);
    }
}
