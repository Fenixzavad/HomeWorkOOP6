package models.Animals.Birds;

public class Chicken extends NonFlyingBird{

    public Chicken(double height, double weight, String eyeColor, String feathersColor) {
        super(height, weight, eyeColor, feathersColor);
    }

    @Override
    public String sound() {
        return String.format("Кудах-тах-тах");
    }

    @Override
    public String toString() {
        return String.format("Курица (%s)", super.toString());
    }
}