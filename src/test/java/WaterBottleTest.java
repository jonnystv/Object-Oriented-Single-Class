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

    @Test
    public void takeDrink() {
        drinkBottle.drinkWater();
        assertEquals(90, drinkBottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        drinkBottle.drinkAllWater();
        assertEquals(0, drinkBottle.getVolume());
    }

    @Test
    public void fullBottle(){
        drinkBottle.fillBottle();
        assertEquals(100, drinkBottle.getVolume());
    }

}
