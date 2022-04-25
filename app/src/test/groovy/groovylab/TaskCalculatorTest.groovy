package groovylab

import org.junit.jupiter.api.function.ThrowingSupplier
import org.junit.Test

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow
import static org.junit.jupiter.api.Assertions.assertTrue

class TaskCalculatorTest {
    @Test
    void testImplemented() {
        assertDoesNotThrow(() -> {
            TaskCalculator.exec("2 + 2")
        } as ThrowingSupplier)
        assertTrue(TaskCalculator.exec("8+6-4") == 10)
        assertTrue(TaskCalculator.exec("1+9/3") == 4)
        assertTrue(TaskCalculator.exec("3+5*2") == 13)
        assertTrue(TaskCalculator.exec("6(3+1)") == 24)
        assertTrue(TaskCalculator.exec("(5*3)+1-9") == 7)
    }
}
