public class WaterBottle {

    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

    public int drinkWater(){
        this.volume = this.volume - 10;
        return this.volume;
    }

    public int drinkAllWater(){
        this.volume = 0;
        return this.volume;
    }

    public int fillBottle(){
        this.volume = 100;
        return this.volume;
    }
}
