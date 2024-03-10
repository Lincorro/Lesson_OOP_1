package Clinic.Animals;

import Clinic.Animals.InterfaceForAnimals.Flyable;
import Clinic.Animals.InterfaceForAnimals.Runable;
import Clinic.Human.Owner;

import java.time.LocalDate;

public class Parrot extends Animal implements Flyable, Runable {
    public Parrot(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Клюю");

    }

    @Override
    public double fly() {
        return 25.0;
    }

    @Override
    public double run() {
        return 0.4;
    }
}
