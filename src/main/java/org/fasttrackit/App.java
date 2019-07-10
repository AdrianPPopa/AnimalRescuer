package org.fasttrackit;

import java.time.LocalDate;

public class App
{
    public static void main(String[] args) {


        {
            Animal animal = new Animal("Bobea", 2.5);
            animal.setHealthLevel(9);
            animal.setHappyness("happy");
            animal.setHappinessLevel(4);
            animal.setFavoriteFood("Pork");
            animal.setHungrySensation(4);
            animal.setFavoriteActivity("Running");

            Animal parrot = new Birds("Polly", 1);
            parrot.setHealthLevel(9);
            parrot.setHappyness("singing");
            parrot.setFavoriteActivity("Singing");
            parrot.setFavoriteFood("seeds");
            ((Birds) parrot).setFeatherColour("White");

            Animal dog = new Mammals("Moon", 2);
            dog.setHealthLevel(10);
            dog.setHappyness("wagging his tail");
            dog.setFavoriteFood("bones");
            ((Mammals) dog).setFurColour("White");
            ((Mammals) dog).setFurColour("White");
            ((Mammals) dog).setFurLenght("Short");

            AnimalKeeper animalKeeper = new AnimalKeeper("John", 100);

            AnimalFood animalFood = new AnimalFood("Pork");
            animalFood.setPrice(3);
            animalFood.setQuantity(500);
            animalFood.setStockAvailability(10);
            animalFood.setExpirationDate(LocalDate.of(2019, 12, 12));

            Acitvity activity = new Acitvity("Running");
            activity.setDuration(10.5);

            Vet vet = new Vet("Rob", "Mammals");


            System.out.println("Expiration Date for Pork is: " + animalFood.getExpirationDate());
            animalKeeper.feedAnimal(animal, animalFood);
            animalKeeper.doActivity(activity, animal);
            animal.mood(animal);
            parrot.mood(parrot);
            dog.mood(dog);
        }
    }

}
