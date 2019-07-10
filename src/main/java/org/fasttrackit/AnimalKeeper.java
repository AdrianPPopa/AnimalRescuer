package org.fasttrackit;

public class AnimalKeeper {
    private static String name;
    private int availableCash;


    public AnimalKeeper(String name, int availableCash) {
        this.name = name;
        this.availableCash = availableCash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableCash() {
        return availableCash;
    }

    public void setAvailableCash(int availableCash) {
        this.availableCash = availableCash;
    }


    public void feedAnimal (Animal animal, AnimalFood animalFood) {
        System.out.println(name + " just gave some " + animalFood.getName() + " food to " + animal.getName());
        int currentHungrySensation;
        currentHungrySensation = animal.getHungrySensation() -1;
        System.out.println( animal.getName() + "'s new hungry sensation is " + currentHungrySensation);
    }

    public void doActivity (Acitvity activity, Animal animal){
        System.out.println(name + " is " + activity.getName() + " with " + animal.getName());
        int currentHappinessLevel;
        currentHappinessLevel = animal.getHappinessLevel() +1;
        System.out.println(animal.getName() + "'s new happiness level is " + currentHappinessLevel);
    }

}
