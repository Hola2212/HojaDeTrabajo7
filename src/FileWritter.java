import java.io.FileWriter;
import java.io.IOException;

/**
 * Writes text to a file
 */
public class FileWritter {

    public void WriteToTarget(String target, String text) {

        try (FileWriter writer = new FileWriter(target)) {
            writer.write(text);
        } catch (IOException e) {
            throw new IllegalArgumentException("Couldn't write in the document: " + target);
        }
    }
}