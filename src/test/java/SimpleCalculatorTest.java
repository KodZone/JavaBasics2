import com410.SimpleCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    // Scenario: Check that adding two positive numbers returns the correct result.
    @Test
    void addTwoNumbersReturnsCorrectSum() {
        assertEquals(10, SimpleCalculator.add(4, 6));
    }

    // Scenario: Check that subtraction does not return an incorrect value.
    @Test
    void subtractionDoesNotReturnWrongValue() {
        assertNotEquals(5, SimpleCalculator.subtract(10, 3));
    }

    // Scenario: Check that multiplying two positive numbers produces a positive result.
    @Test
    void multiplicationResultIsPositive() {
        assertTrue(SimpleCalculator.multiply(4, 5) > 0);
    }

    // Scenario: Check that multiplication of a positive and negative number
    // does not result in a positive value.
    @Test
    void multiplicationWithNegativeIsNotPositive() {
        assertFalse(SimpleCalculator.multiply(4, -3) > 0);
    }

    // Scenario: Check that division returns the expected quotient.
    @Test
    void divisionReturnsCorrectQuotient() {
        assertEquals(5, SimpleCalculator.divide(10, 2));
    }

    // Scenario: Check that modulus returns the correct remainder after division.
    @Test
    void modulusReturnsCorrectRemainder() {
        assertEquals(1, SimpleCalculator.modulus(10, 3));
    }

    // Scenario: Check that the result of an addition operation is not null
    @Test
    void additionResultIsNotNull() {
        Integer result = SimpleCalculator.add(2, 3);
        assertNotNull(result);
    }

    // Scenario: Demonstrate assertNull using a reference variable that is not assigned.
    @Test
    void uninitialisedReferenceIsNull() {
        Integer value = null;
        assertNull(value);
    }

// Scenario: Verify that adding a positive number and a negative number returns the correct result.

// Scenario: Check that dividing two numbers does not return an incorrect quotient.

// Scenario: Verify that the modulus operation returns zero when a number is divisible by another.

// Scenario: Check that subtracting a number from itself results in zero.

// Scenario: Verify that the result of a multiplication operation is not null.

}

