import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssociationTest {

    @Test
    void testCompareTo() {
        Association a = new Association("apple", "manzana");
        Association b = new Association("banana", "banano");

        assertTrue(a.compareTo(b) < 0);
    }

    @Test
    void testGetters() {
        Association a = new Association("hello", "hola");

        assertEquals("hello", a.getPalabraIngles());
        assertEquals("hola", a.getPalabraEspaniol());
    }

    @Test
    void testSetters() {
        Association a = new Association("a", "b");

        a.setPalabraIngles("cat");
        a.setPalabraEspaniol("gato");

        assertEquals("cat", a.getPalabraIngles());
        assertEquals("gato", a.getPalabraEspaniol());
    }
}