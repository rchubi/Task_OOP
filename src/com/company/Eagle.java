package com.company;

/**
 * Created by Roman on 01.11.2018.
 */
public class Eagle extends FlyingBird {
    private String name;
    private int age;

    public Eagle(String name, int age, String feathers, int layEggs) {
        this.name = name;
        this.age = age;
        this.feathers = feathers;
        this.layEggs = layEggs;
    }



    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                ", age=" + age + ", feathers=" + feathers + ", layEggs= " + layEggs +
        '}';
    }
}
