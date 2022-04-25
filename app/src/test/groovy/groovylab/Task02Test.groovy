package groovylab

import org.junit.jupiter.api.function.ThrowingSupplier
import org.junit.Test

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow
import static org.junit.jupiter.api.Assertions.assertEquals

class Task02Test {
    @Test
    void testImplemented() {
        assertDoesNotThrow(() -> {
            Task02.mulEvenOdd([])
        } as ThrowingSupplier)
        assertEquals(
            Task02.mulEvenOdd((6..16).collect()),
            [12, 21, 16, 27, 20, 33, 24, 39, 28, 45, 32]
        )
        assertEquals(
            Task02.mulEvenOdd((-6..6).collect()),
            [-12, -15, -8, -9, -4, -3, 0, 3, 4, 9, 8, 15, 12]
        )
    }
}
