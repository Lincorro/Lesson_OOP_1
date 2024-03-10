package Clinic.Animals;

import Clinic.Animals.InterfaceForAnimals.Runable;
import Clinic.Human.Owner;

import java.time.LocalDate;

public class Cat extends Animal implements Runable {
    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Ем все что дадут");
    }

    @Override
    public double run() {
        return 6.0;
    }
}
