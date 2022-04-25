package groovylab

import org.junit.jupiter.api.function.ThrowingSupplier
import org.junit.Test

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow
import static org.junit.jupiter.api.Assertions.assertEquals

class Task11Test {
    @Test
    void testImplemented() {
        assertDoesNotThrow(() -> {
            Task11.gstring("test", 2)
        } as ThrowingSupplier)
        assertEquals(Task11.gstring("word", 1), "1(word) 2() 3()")
        assertEquals(Task11.gstring("word", 3), "1() 2() 3(word)")
        assertEquals(Task11.gstring("word", 2), "1() 2(word) 3()")
    }
}
