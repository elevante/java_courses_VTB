package ru.vtb.animal;

public class Cat extends Animal{
    public static int count;
    public Cat(String type, String name, int maxRunDistance) {
        super(type, name, maxRunDistance, 0);
        count++;
    }
}
