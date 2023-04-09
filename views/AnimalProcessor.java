package views;

import java.util.List;

import models.Animals.Base.Animal;

public interface AnimalProcessor {

    public void PrintAnimal(Animal animal);

    public void PrintAnimals(List<Animal> animals);

    public void SoundAnimal(Animal animal);

    public void SoundAnimals(List<Animal> animals);

    public void FlyAnimal(Animal animal);

    public void PetAnimal(Animal animal);

    public void TrainAnimal(Animal animal);
}