package Homework_2.Core.Patcients.imp;

import Clinic.Human.Owner;
import Homework_2.Core.Goable;
import Homework_2.Core.Patcients.Animal;
import Homework_2.Core.Swimable;

import java.time.LocalDate;

public class Penguin extends Animal implements Swimable, Goable {
    public Penguin(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    @Override
    public double go() {
        return 2.2;
    }
    @Override
    public double swim() {
        return 6.8;
    }
}