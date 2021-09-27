public class Pig implements Domesticatable, Tradable{
    @Override
    public String sound() {
        return "Oink!";
    }

    @Override
    public int getPrice() {
        return 50;
    }
}
