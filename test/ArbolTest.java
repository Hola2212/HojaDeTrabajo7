import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArbolTest {

    @Test
    void testAddAndSearch() {
        Arbol<Integer> tree = new Arbol<>();

        tree.add(10);
        tree.add(5);
        tree.add(15);

        assertEquals(10, tree.search(10));
        assertEquals(5, tree.search(5));
        assertEquals(15, tree.search(15));
    }

    @Test
    void testSearchNotFound() {
        Arbol<Integer> tree = new Arbol<>();
        tree.add(10);

        assertNull(tree.search(99));
    }

    @Test
    void testDuplicateThrowsException() {
        Arbol<Integer> tree = new Arbol<>();
        tree.add(10);

        assertThrows(IllegalArgumentException.class, () -> {
            tree.add(10);
        });
    }

    @Test
    void testInOrderSorting() {
        Arbol<Integer> tree = new Arbol<>();
        tree.add(10);
        tree.add(5);
        tree.add(15);

        String result = tree.SortedArbolInOrder();
        assertEquals("5, 10, 15.", result);
    }
}