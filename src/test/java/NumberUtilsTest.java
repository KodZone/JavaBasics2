import com410.NumberUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {

    @Test
    void evenNumberReturnsTrue() {
        assertTrue(NumberUtils.isEven(4));
    }

    @Test
    void addTwoNumbers() {
        assertEquals(10, NumberUtils.add(4, 6));
    }

    @Test
    void divisionByZeroReturnsNull() {
        assertNull(NumberUtils.safeDivide(10, 0));
    }
}

