package com.projects;

public abstract class Computer {
    protected int speed;
    public void performTasks() {
        System.out.println("Animal is eating");
    }
    public abstract String getCapacity();
}
