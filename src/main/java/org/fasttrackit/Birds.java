package org.fasttrackit;

public class Birds extends Animal {
    private String featherColour;

    public Birds(String name, double age) {
        super(name, age);
    }

    public void mood (Birds parrot){
        System.out.println(parrot.getName() + " is " + parrot.getHappyness());
    }

    public String getFeatherColour() {
        return featherColour;
    }

    public void setFeatherColour(String featherColour) {
        this.featherColour = featherColour;
    }

}
