package ru.vtb.animal;

public class Animal{
    public static int count;

    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance){
        if (maxRunDistance >= distance)
            System.out.println(type + " " + name + " пробежал " + distance + " м.");
        else
            System.out.println("Большая дистанция, может пробежать только " + maxRunDistance + " м.");
    }
    public void swim(int distance){
        if (maxSwimDistance >= distance)
            System.out.println(type + " " + name + " проплыл" + distance + " м.");
        if (maxSwimDistance == 0)
            System.out.println(type + " " + name + " не умеет плавать");
        else
            System.out.println("Большая дистанция, может только " + maxSwimDistance + " м.");
    }
}
