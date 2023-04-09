package models.Animals.WildAnimals;

import java.util.Date;

import models.Animals.Base.Animal;

public abstract class WildAnimal extends Animal{
    private String habitat;
    private Date foundDate;

    protected WildAnimal(double height, double weight, String eyeColor, String habitat, Date foundDate) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.foundDate = foundDate;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public Date getFoundDate() {
        return this.foundDate;
    }

    @Override
    public String toString() {
        return String.format(
            "%s, Ареал обитания: %s, Дата обнаружения: %s",
            super.toString(), this.getHabitat(), this.getFoundDate()
        );
    }
}
