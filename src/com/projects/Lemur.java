package com.projects;

public class Lemur extends PrimeAnimal implements HasSuperTails {
    @Override
    public Boolean isTailStripped() {
        return false;
    }
    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasSuperTails hasSuperTails = lemur;
        System.out.println(hasSuperTails.isTailStripped());

        PrimeAnimal primeAnimal = lemur;
        System.out.println(primeAnimal.HasHair());
    }

}
