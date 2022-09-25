package com.projects;

public class Kangaroo extends Marsupial{

    public static boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }

    // if u remove static keyword from both isBiped method, it will be overriden.
    // not hidden from the parent class
}
