package groovylab

import org.junit.jupiter.api.function.ThrowingSupplier
import org.junit.Test

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow
import static org.junit.jupiter.api.Assertions.assertTrue
import static org.junit.jupiter.api.Assertions.assertFalse

class Task05Test {
    @Test
    void testImplemented() {
        assertDoesNotThrow(() -> {
            Task05.isIp("127.0.0.1")
        } as ThrowingSupplier)
        assertTrue(Task05.isIp("1.0.15.6"))
        assertFalse(Task05.isIp("0.o.14.253"))
        assertFalse(Task05.isIp("1.3333.0.7"))
    }
}
