
public class Tuolaji implements Domesticatable, Tradable, Drivable{
    private String name;
    int max_speed;
    int min_speed;

    public Tuolaji(String name){
        this.name = name;
        this.max_speed =10;
        this.min_speed =0;
    }

    @Override
    public int getPrice() {
        return 80;
    }

    @Override
    public String sound() {
        return "Hong! Hong!";
    }

    @Override
    public int getMaxSpeed() {

        return 5;}

    @Override
    public void downgradeSpeed() {
        this.max_speed -= 5;
    }

    @Override
    public void upgradeSpeed() {
        this.max_speed +=5;
    }

}