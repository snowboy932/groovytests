package groovylab

import org.junit.jupiter.api.function.ThrowingSupplier
import org.junit.Test

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow
import static org.junit.jupiter.api.Assertions.assertTrue
import static org.junit.jupiter.api.Assertions.assertFalse

class Task03Test {
    @Test
    void testImplemented() {
        assertDoesNotThrow(() -> {
            Task03.isSublist([], [])
        } as ThrowingSupplier)
        assertTrue(Task03.isSublist([4,5,6], [4,5]))
        assertFalse(Task03.isSublist([4,5,6], [4,5,18]))
    }
}
