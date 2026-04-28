import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TranslatorTest {

    @Test
    void testTranslateKnownWord() {
        Arbol<Association> tree = new Arbol<>();
        tree.add(new Association("hello", "hola"));

        String result = Translator.translateText("hello", tree);

        assertEquals("hola", result);
    }

    @Test
    void testTranslateUnknownWord() {
        Arbol<Association> tree = new Arbol<>();

        String result = Translator.translateText("unknown", tree);

        assertEquals("\"unknown\"", result);
    }

    @Test
    void testPreserveCase() {
        Arbol<Association> tree = new Arbol<>();
        tree.add(new Association("hello", "hola"));

        String result = Translator.translateText("Hello", tree);

        assertEquals("Hola", result);
    }

    @Test
    void testSentenceTranslation() {
        Arbol<Association> tree = new Arbol<>();
        tree.add(new Association("hello", "hola"));
        tree.add(new Association("world", "mundo"));

        String result = Translator.translateText("hello world", tree);

        assertEquals("hola mundo", result);
    }
}