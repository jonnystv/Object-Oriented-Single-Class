public class WaterBottle {

    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

    public int drinkWater(){
        this.volume = volume - 10;
    }
}
