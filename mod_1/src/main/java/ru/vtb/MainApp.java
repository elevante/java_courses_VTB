package ru.vtb;

import ru.vtb.animal.Animal;
import ru.vtb.animal.Cat;
import ru.vtb.animal.Dog;
import ru.vtb.animal.Tiger;

public class MainApp {
    public static void main(String[] args) {
        Animal[]  animals = {
                new Cat("Домашняя кошка", "Мика", 200),
                new Dog("Собака", "Чарли", 500, 10),
                new Tiger("Тигр", "Лео", 1000, 20),
        };
        for (Animal animal: animals){
                animal.run(100);
                animal.swim(500);
                System.out.println();
        }
        System.out.println("Количество животных: " +  Animal.count);
    }
}