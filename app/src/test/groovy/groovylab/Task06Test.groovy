package groovylab

import org.junit.jupiter.api.function.ThrowingSupplier
import org.junit.Test

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow
import static org.junit.jupiter.api.Assertions.assertEquals

class Task06Test {
    @Test
    void testImplemented() {
        assertDoesNotThrow(() -> {
            Task06.adults([:])
        } as ThrowingSupplier)
        assertEquals(
            Task06.adults([Kate: 24, Alan: 16, Osvald: 18]),
            [Kate: 24, Osvald: 18]
        )
    }
}
