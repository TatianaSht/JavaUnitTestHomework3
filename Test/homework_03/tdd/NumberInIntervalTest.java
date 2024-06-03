package homework_03.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberInIntervalTest {

    private NumberInInterval numberInInterval;

    @BeforeEach
    void setUp() {
        numberInInterval = new NumberInInterval();
    }


    @ParameterizedTest
    @ValueSource(ints = {26, 40, 58, 76, 99})
    void theTransmittedNumberFallsWithinTheRangeFrom25To100(int n) {
        assertTrue(numberInInterval.numberInInterval(n));
    }


    @ParameterizedTest
    @ValueSource(ints = {-25, 0, 25, 100, 125})
    void theNumberPassedDoesNotFallWithinTheRangeOf25To100(int n) {
        assertFalse(numberInInterval.numberInInterval(n));
    }
}
