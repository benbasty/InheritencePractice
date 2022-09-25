package com.projects;

public class AgitatedBear implements Herbivore2,Omnivore2 {
    @Override
    public int eatPlants(int quantity) {
        System.out.println("Eating plants: "+quantity);
        return quantity;
    }

    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
