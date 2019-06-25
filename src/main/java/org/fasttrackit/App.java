package org.fasttrackit;

import java.time.LocalDate;

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

        Birds parrot = new Birds();
        parrot.name = "Pauly";
        parrot.age = 1;
        parrot.healthLevel = 9;
        parrot.happyness = 8;
        parrot.favoriteActivity = "Singing";
        parrot.favoriteFood = "seeds";
        parrot.featherColour = "White";

        Mammals dog = new Mammals();
        dog.name = "Moon";
        dog.age = 2;
        dog.healthLevel = 10;
        dog.happyness = 10;
        dog.favoriteFood = "bones";
        dog.furColour = "White";
        dog.furLenght = "Short";

        AnimalKeeper animalKeeper = new AnimalKeeper();
        animalKeeper.name = "John";
        animalKeeper.availableCash = 10;

        AnimalFood animalFood = new AnimalFood();
        animalFood.name = "Pork";
        animalFood.price = 3;
        animalFood.quantity = 500;
        animalFood.stockAvailability = 10;
        animalFood.expirationDate = LocalDate.of(2019,12,12);

        Acitvity activity = new Acitvity();
        activity.name = "Running";


        Vet vet = new Vet();
        vet.name = "Rob";
        vet.specialization = "Dogs";


       System.out.println("Expiration Date for Pork is: " + animalFood.expirationDate);
    }

}
