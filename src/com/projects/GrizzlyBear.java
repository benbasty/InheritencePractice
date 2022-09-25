package com.projects;

public class GrizzlyBear implements Herbivore, Omnivore {

    @Override
    public void eatPlants() {
        System.out.println("Eating plants");

    }

    @Override
    public void eatMeat() {
        System.out.println("Eating meat");
    }
}
