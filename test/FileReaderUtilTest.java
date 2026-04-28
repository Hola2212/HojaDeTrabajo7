import org.junit.jupiter.api.Test;
import java.util.Vector;
import static org.junit.jupiter.api.Assertions.*;

public class FileReaderUtilTest {

    @Test
    void testReadFileSuccess() {
        FileReaderUtil reader = new FileReaderUtil();
        Vector<String> lines = reader.ReadFile("src/diccionario.txt");

        assertFalse(lines.isEmpty());
    }

    @Test
    void testReadFileNotFound() {
        FileReaderUtil reader = new FileReaderUtil();

        assertThrows(IllegalArgumentException.class, () -> {
            reader.ReadFile("no_existe.txt");
        });
    }
}