package org.fasttrackit;

public class AnimalKeeper {
    private String name;
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
}
