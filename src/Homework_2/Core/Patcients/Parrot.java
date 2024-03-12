package Homework_2.Core.Patcients;

import Clinic.Human.Owner;
import Homework_2.Core.Flyable;
import Homework_2.Core.Goable;

import java.time.LocalDate;

public class Parrot extends Animal implements Goable, Flyable {
    public Parrot(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double fly() {
        return 12.2;
    }

    @Override
    public double go() {
        return 1;
    }
}
