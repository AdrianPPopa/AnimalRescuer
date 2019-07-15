package org.fasttrackit;

public class Birds extends Animal {
    public String featherColour;

    public Birds(String name, double age) {
        super(name, age);
    }



    @Override
    public void mood() {
        System.out.println( getName() + " is " + "Singing");
    }

    public String getFeatherColour() {
        return featherColour;
    }

    public void setFeatherColour(String featherColour) {
        this.featherColour = featherColour;
    }

}
