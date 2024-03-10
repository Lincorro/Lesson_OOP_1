package Clinic.Animals;

import Clinic.Animals.InterfaceForAnimals.Runable;
import Clinic.Human.Owner;

import java.time.LocalDate;

public class Hamster extends Animal implements Runable {
    public Hamster(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Хрум Хрум Хрум");

    }

    @Override
    public double run() {
        return 7.0;
    }
}
