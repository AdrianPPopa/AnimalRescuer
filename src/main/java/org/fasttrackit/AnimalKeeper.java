package org.fasttrackit;

public class AnimalKeeper {
    private static String name;
    private int availableCash;

    public void feedAnimal (Animal animal, AnimalFood animalFood) {
        System.out.println(name + " just gave some " + animalFood.getName() + " food to " + animal.getName());
        int currentHungrySensation;
        currentHungrySensation = animal.getHungrySensation() -1;
        System.out.println( animal.getName() + "'s new hungry sensation is " + currentHungrySensation);

        if (animalFood.getName().equals(animal.getFavoriteFood()))
        {
            animal.setHappinessLevel(animal.getHappinessLevel()+1);
                    }
        System.out.println(animal.getName() + " s new happiness level is " + animal.getHappinessLevel());
    }

    public void doActivity (Acitvity activity, Animal animal){
        int currentHappinessLevel;
        System.out.println(name + " is " + activity.getName() + " with " + animal.getName());
        if (activity.getName().equals(animal.getFavoriteActivity())){
            currentHappinessLevel = animal.getHappinessLevel() +2;
        } else {
            currentHappinessLevel = animal.getHappinessLevel() +1;}
        System.out.println(animal.getName() + "'s new happiness level is " + currentHappinessLevel);
    }


    public AnimalKeeper(String name, int availableCash) {
        this.name = name;
        this.availableCash = availableCash;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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





}
