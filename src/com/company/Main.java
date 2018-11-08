package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bird eagle = new Eagle("Eagle", 7, "long", 1 );
        Bird swallow = new Swallow("Eagle", 3, "shot", 2 );
        Bird pengiun = new Penguin("Penguin", 8, "without fearth", 1 );
        Bird chicken = new Chicken("Chicken", 1, "shot", 1 );

        eagle.fly();
        System.out.println(eagle);
        swallow.fly();
        System.out.println(swallow);
        pengiun.fly();
        System.out.println(pengiun);
        chicken.fly();
        System.out.println(chicken);



    }
}
