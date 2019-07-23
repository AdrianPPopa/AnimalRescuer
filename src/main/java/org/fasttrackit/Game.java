package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
    }

    public void start () {
        initFood();
        displayFood();
        initActivities();
        displayActivities();
    }

    private List<AnimalFood> availableFood = new ArrayList<>();
    private Acitvity[] availableActivity = new Acitvity[4];

    private void initFood(){
        AnimalFood dogFood = new AnimalFood("Bones");
        availableFood.add(dogFood);
        AnimalFood parrotFood = new AnimalFood("Seeds");
        availableFood.add(parrotFood);
    }

    private void displayFood(){
        System.out.println("Available food:");
        for (int i = 0; i < availableFood.size();i++) {
            if (availableFood.get(i) != null )
                System.out.println(availableFood.get(i).getName());
        }
    }



    private void initActivities(){
        Acitvity swimming = new Acitvity("Swimming");
        availableActivity[0] = swimming;
        Acitvity training = new Acitvity("Training");
        availableActivity[1] = training;
        Acitvity playing = new Acitvity("Playing");
        availableActivity[2] = playing;
        Acitvity petting = new Acitvity("Petting");
        availableActivity[3] = petting;
    }

    private void displayActivities(){
        System.out.println("Available activities");
        for (Acitvity activity : availableActivity){
            System.out.println(activity.getName());
        }
    }
}
