package Clinic.Animals;
import Clinic.Animals.InterfaceForAnimals.Runable;

import Clinic.Human.Owner;

import java.time.LocalDate;

public class Lion extends Animal implements Runable {
    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Лев кушает");
    }

    @Override
    public double run() {
        return 15.0;
    }
}
