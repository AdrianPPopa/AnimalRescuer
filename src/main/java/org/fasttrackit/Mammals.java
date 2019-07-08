package org.fasttrackit;

public class Mammals extends Animal {
    private String furColour;
    private String furLenght;

    public Mammals(String name, double age) {
        super(name, age);
    }

    public void mood (Mammals dog){
        System.out.println(dog.getName() + " is " + dog.getHappyness());
    }

    public String getFurColour() {
        return furColour;
    }

    public void setFurColour(String furColour) {
        this.furColour = furColour;
    }

    public String getFurLenght() {
        return furLenght;
    }

    public void setFurLenght(String furLenght) {
        this.furLenght = furLenght;
    }
}
