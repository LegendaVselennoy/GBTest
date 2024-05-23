package less3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTestHW {

    private MainHW mainHW;

    @BeforeEach
    void setup() {
        mainHW = new MainHW();
    }

    @ParameterizedTest
    @ValueSource(ints = {4,20,72})
    public void evenOddNumberTestTrue(int n) {
       assertTrue(mainHW.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {5,33,85})
    public void evenOddNumberTestFalse(int n) {
        assertFalse(mainHW.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {25,40,81})
    public void numberInIntervalTestTrue(int n) {
        assertTrue(mainHW.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,-25,555})
    public void numberInIntervalTestFalse(int n) {
        assertFalse(mainHW.numberInInterval(n));
    }

}
