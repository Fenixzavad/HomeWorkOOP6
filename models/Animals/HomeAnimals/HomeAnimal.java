package models.Animals.HomeAnimals;

import java.util.Date;
import java.util.List;

import models.Animals.Base.Animal;
import models.Interfeces.Petter;

public abstract class HomeAnimal extends Animal implements Petter{
    private String name;
    private String breed;
    private List<String> vaccinations;
    private String furColor;
    private Date birthDate;

    public HomeAnimal(double height, double weight, String eyeColor, String name, String breed, List<String> vaccinations, String furColor, Date birthDate) {
        super(height, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.furColor = furColor;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public List<String> getVaccinations() {
        return this.vaccinations;
    }

    public String getFurColor() {
        return this.furColor;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String pet() {
        return String.format("Играться с животным, гладить его");
    }

    @Override
    public String toString() {
        return String.format(
            "%s, Кличка:   %s; Порода:  %s;  Наличие прививок:  %s; Окрас:  %s; Дата рождения:  %s;  %s;",
            super.toString(), this.getName(), this.getBreed(), this.getVaccinations(), this.getFurColor(), this.getBirthDate()
        );
    }
}
