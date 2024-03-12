package Homework_2.Core.Patcients;

import Clinic.Human.Owner;
import Homework_2.Core.Flyable;
import Homework_2.Core.Goable;
import Homework_2.Core.Swimable;

import java.time.LocalDate;

public class Duck extends Animal implements Goable, Swimable, Flyable {
    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double go() {
        return 2.2;
    }

    @Override
    public double swim() {
        return 5.4;
    }

    @Override
    public double fly() {
        return 10.1;
    }
}
