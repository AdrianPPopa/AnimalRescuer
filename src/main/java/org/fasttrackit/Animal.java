package org.fasttrackit;

public class Animal {

    private String name;
    private double age;
    private int healthLevel ;
    private int hungrySensation ;
    private String happyness ;
    private int happinessLevel;
    private String favoriteFood;
    private String favoriteActivity;
    private String size;
    private String livingEnvironment;

    public Animal(String name, double age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", healthLevel=" + healthLevel +
                ", hungrySensation=" + hungrySensation +
                ", happyness='" + happyness + '\'' +
                ", happinessLevel=" + happinessLevel +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", favoriteActivity='" + favoriteActivity + '\'' +
                ", size='" + size + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    public void mood (){
        System.out.println( getName() + " is " + "Happy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungrySensation() {
        return hungrySensation;
    }

    public void setHungrySensation(int hungrySensation) {
        this.hungrySensation = hungrySensation;
    }

    public String getHappyness() {
        return happyness;
    }

    public void setHappyness(String happyness) {
        this.happyness = happyness;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }
}

