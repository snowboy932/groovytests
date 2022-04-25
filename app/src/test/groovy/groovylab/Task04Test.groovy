package groovylab

import org.junit.jupiter.api.function.ThrowingSupplier
import org.junit.Test

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow
import static org.junit.jupiter.api.Assertions.assertEquals

class Task04Test {
    @Test
    void testImplemented() {
        assertDoesNotThrow(() -> {
            Task04.fib(1)
        } as ThrowingSupplier)
        assertEquals(Task04.fib(2), 1)
        assertEquals(Task04.fib(5), 5)
        assertEquals(Task04.fib(8), 21)
    }
}
