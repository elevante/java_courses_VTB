package ru.vtb.animal;

public class Tiger extends Animal{
    public static int count;
    public Tiger(String type, String name, int maxRunDistance, int maxSwimDistance) {
        super(type, name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
