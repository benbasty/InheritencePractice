package com.projects;

public class Wolf extends Canine {
    @Override
    public double getAverageWeight() {
        return super.getAverageWeight() + 2.0;
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }
}
