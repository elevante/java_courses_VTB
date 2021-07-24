package ru.vtb.animal;

public class Dog extends Animal{
    public static int count;
    public Dog(String type, String name, int maxRunDistance, int maxSwimDistance) {
        super(type, name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
