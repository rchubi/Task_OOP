package com.company;

/**
 * Created by Roman on 01.11.2018.
 */
public class Penguin extends NonFlyingBird {
    private String name;
    private int age;

    public Penguin(String name, int age, String feathers, int layEggs) {
        this.name = name;
        this.age = age;
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "name='" + name + '\'' +
                ", age=" + age + ", feathers=" + feathers + ", layEggs= " + layEggs +
                '}';
    }
}
