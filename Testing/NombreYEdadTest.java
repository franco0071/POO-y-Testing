import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class NombreYEdadTest {
    @Test
    public void testNombreYEdad() {
        String input = "John\n25\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        NombreYEdad.main(new String[]{});

        String output = outputStream.toString().trim();
        Assertions.assertTrue(output.contains("Su nombre es John"));
        Assertions.assertTrue(output.contains("su edad es 25"));
    }
}
