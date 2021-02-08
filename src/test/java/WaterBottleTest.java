import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle drinkBottle;

    @Before
    public void before(){
        drinkBottle = new WaterBottle();
    }

    @Test
    public void bottleHasVolume() {
        assertEquals(100, drinkBottle.getVolume());
    }

}
