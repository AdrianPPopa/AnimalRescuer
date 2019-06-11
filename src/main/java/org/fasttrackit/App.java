package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        animal.name = "Bobea";
        animal.age = 2.5;
        animal.healthLevel = 9;
        animal.happyness = 9;
        animal.favoriteFood = "Pork";
        animal.hungrySensation = 4;
        animal.favoriteActivity = "Running";

        AnimalKeeper animalKeeper = new AnimalKeeper();
        animalKeeper.name = "John";
        animalKeeper.availableCash = 10;

        AnimalFood animalFood = new AnimalFood();
        animalFood.name = "Pork";
        animalFood.price = 3;
        animalFood.quantity = 500;
        animalFood.stockAvailability = 10;

        Acitvity activity = new Acitvity();
        activity.name = "Running";

        Vet vet = new Vet();
        vet.name = "Rob";
        vet.specialization = "Dogs";





    }

}
