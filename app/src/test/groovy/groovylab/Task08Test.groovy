package groovylab

import org.junit.jupiter.api.function.ThrowingSupplier
import org.junit.Test

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow
import static org.junit.jupiter.api.Assertions.assertEquals

class Task08Test {
    @Test
    void testImplemented() {
        assertDoesNotThrow(() -> {
            Task08.parseAndFilterJson("{}")
        } as ThrowingSupplier)
        assertEquals(
            Task08.parseAndFilterJson("{\"Kate\":18,\"Alan\":16,\"Osvald\":27}"),
            "{\"Kate\":18,\"Osvald\":27}"
        )
    }
}
