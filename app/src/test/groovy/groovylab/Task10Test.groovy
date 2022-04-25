package groovylab

import org.junit.jupiter.api.function.ThrowingSupplier
import org.junit.Test

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow
import static org.junit.jupiter.api.Assertions.assertEquals

class Task10Test {
    @Test
    void testImplemented() {
        assertDoesNotThrow(() -> {
            Task10.urlText("https://google.com")
        } as ThrowingSupplier)
        assertEquals(
            Task10.urlText("http://api.ipify.org/"),
            new URL("http://api.ipify.org/").text
        )
    }
}
