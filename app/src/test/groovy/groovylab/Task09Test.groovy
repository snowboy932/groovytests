package groovylab

import org.junit.jupiter.api.function.ThrowingSupplier
import org.junit.Test

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow
import static org.junit.jupiter.api.Assertions.assertEquals

class Task09Test {
    @Test
    void testImplemented() {
        assertDoesNotThrow(() -> {
            Task09.exec("ls")
        } as ThrowingSupplier)
        assertEquals(
            Task09.exec("hostname -i"),
            "hostname -i".execute().text.trim()
        )
    }
}
