import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Test
    public void canAdd() {
        assertEquals(4, calculator.add(2, 2));
    }
}