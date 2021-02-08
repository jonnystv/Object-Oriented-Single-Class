import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Test
    public void canAdd() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.add(2, 2));
    }
}