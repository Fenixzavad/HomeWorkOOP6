package models.Animals.WildAnimals;

import java.util.Date;

public class Tiger extends WildAnimal{

    public Tiger(double height, double weight, String eyeColor, String habitat, Date foundDate) {
        super(height, weight, eyeColor, habitat, foundDate);
    }

    @Override
    public String sound() {
        return "Рычит";
    }

    @Override
    public String toString() {
        return String.format("Тигр (%s)", super.toString());
    }
}