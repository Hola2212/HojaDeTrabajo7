import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

public class FileWritterTest {
    @Test
    void testWriteFile() {
        FileWritter writer = new FileWritter();
        String path = "test_output.txt";

        writer.WriteToTarget(path, "Hola mundo");

        File file = new File(path);
        assertTrue(file.exists());

        boolean deleted = file.delete();
        assertTrue(deleted);
    }
}