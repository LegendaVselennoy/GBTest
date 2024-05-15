import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TestGB {

    @Test
    void calculatingDiscountAmounts() {
        assertThat(Calculator.calculatingDiscount(5000, 25)).isEqualTo(3750);
    }

    @Test
    void calculatingDiscountDataError() {
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(-25, 405)).isInstanceOf(ArithmeticException.class);
    }

}