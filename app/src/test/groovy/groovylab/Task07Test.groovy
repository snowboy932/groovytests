package groovylab

import org.junit.jupiter.api.function.ThrowingSupplier
import org.junit.Test

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow
import static org.junit.jupiter.api.Assertions.assertEquals

class Task07Test {
    @Test
    void testImplemented() {
        assertDoesNotThrow(() -> {
            Task07.encryptThis("hi")
        } as ThrowingSupplier)
        assertEquals(Task07.encryptThis("Hello"), "72olle")
        assertEquals(Task07.encryptThis("good"), "103doo")
        assertEquals(Task07.encryptThis("hello world"), "104olle 119drlo")
    }
}
