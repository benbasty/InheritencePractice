package com.projects;

public class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda is also eating Bear's food");
    }

    public static void main(String[] args) {
        Panda.eat();
    }
}
