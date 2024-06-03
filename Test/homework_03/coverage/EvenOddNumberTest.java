package homework_03.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenOddNumberTest {

    private EvenOddNumber evenOddNumber;

    @BeforeEach
    void setUp() {
        evenOddNumber = new EvenOddNumber();
    }


    @ParameterizedTest
    @ValueSource(ints = {-10, -8, -4, 0, 2, 22})
    void theNumberPassedIsEven(int n) {
        assertTrue(evenOddNumber.evenOddNumber(n));
    }


    @ParameterizedTest
    @ValueSource(ints = {-17, -9, -1, 3, 15, 25})
    void theNumberPassedIsOdd(int n) {
        assertFalse(evenOddNumber.evenOddNumber(n));
    }

}
