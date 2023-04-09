package models.Animals.Birds;

public abstract class NonFlyingBird extends Bird {

    protected NonFlyingBird(double height, double weight, String eyeColor, String feathersColor) {
        super(height, weight, eyeColor, feathersColor);
    }
}