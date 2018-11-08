package com.company;

/**
 * Created by Roman on 01.11.2018.
 */
public class NonFlyingBird extends Bird {
    @Override
    public void fly() {
        System.out.println("This bird can't fly: ");
    }
}
