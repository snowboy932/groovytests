package groovylab

import org.junit.jupiter.api.function.ThrowingSupplier
import org.junit.Test

import static org.junit.jupiter.api.Assertions.assertEquals
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow

class Task01Test {
    @Test
    void testImplemented() {
        assertDoesNotThrow(() -> {
            Task01.sum(2, 3)
        } as ThrowingSupplier)
        assertEquals(Task01.sum(2, 3), 5)
        assertEquals(Task01.sum(0, -8), -8)
    }
}
