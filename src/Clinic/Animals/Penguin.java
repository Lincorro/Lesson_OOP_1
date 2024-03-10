package Clinic.Animals;

import Clinic.Animals.InterfaceForAnimals.Runable;
import Clinic.Animals.InterfaceForAnimals.Swimable;
import Clinic.Human.Owner;

import java.time.LocalDate;

public class Penguin extends Animal implements Swimable, Runable {
    public Penguin(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Кушаю");

    }

    @Override
    public double run() {
        return 1.2;
    }

    @Override
    public double swim() {
        return 2.5;
    }
}
