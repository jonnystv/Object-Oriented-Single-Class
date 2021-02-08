import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

//    @Before
//    public void before() { Calculator calc = new Calculator();}

    @Test
    public void canAdd() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    public void canSubtract() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.subtract(4,1));
    }

    @Test
    public void canMultiply() {
        Calculator calc = new Calculator();
        assertEquals(8, calc.multiply(2, 4));
    }

    @Test
    public void canDivide() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(4.0, 2.0), 0.0);
    }


}