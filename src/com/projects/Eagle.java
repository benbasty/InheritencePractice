package com.projects;

public class Eagle extends Bird{
    public int fly(int height) {
        System.out.println("Bird is flying at"+ height + " meters");
        return height;
    }


    public void eat(int food) {

    }
    // the return type of the method in Eagle must be a subclass of
    // the return type of the method in Bird. In this example, the return type void is not a subclass
    // of int; therefore, the compiler will throw an exception on this method defi nition.
}
