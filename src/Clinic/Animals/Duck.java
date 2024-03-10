package Clinic.Animals;

import Clinic.Animals.InterfaceForAnimals.Flyable;
import Clinic.Animals.InterfaceForAnimals.Runable;
import Clinic.Human.Owner;
import Clinic.Animals.InterfaceForAnimals.Swimable;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Swimable, Runable {
    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Утка клюет ");

    }

    @Override
    public double fly() {
        return 2.0;
    }

    @Override
    public double swim() {
        return 0.5;
    }


    @Override
    public double run() {
        return 1.5;
    };
}
