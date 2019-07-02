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

    public void feedAnimal (String animal, String animalFood) {
        System.out.println(name + " just gave some " + animalFood + " food to " + animal);
    }

    public void doActivity (String activity, String animal){
        System.out.println(name + " is " + activity + " with " + animal);
    }

}
