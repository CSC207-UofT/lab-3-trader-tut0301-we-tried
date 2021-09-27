public class Car implements Tradable, Drivable {
    private int maxSpeed;

    public Car() {
        this.maxSpeed = 50;
    }

    @Override
    public int getPrice(){
        return 50;
    }

    @Override
    public void upgradeSpeed(){
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed(){
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed(){
        return maxSpeed;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }

}
