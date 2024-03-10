package Clinic.Animals;

import Clinic.Animals.InterfaceForAnimals.Runable;
import Clinic.Animals.InterfaceForAnimals.Swimable;
import Clinic.Human.Owner;

import java.time.LocalDate;

public class Dog extends Animal implements Runable, Swimable {
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Грызу");
    }

    @Override
    public double run() {
        return 15.0;
    }

    @Override
    public double swim() {
        return 5.0;
    }
}
