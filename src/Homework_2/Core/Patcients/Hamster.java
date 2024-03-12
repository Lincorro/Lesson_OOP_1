package Homework_2.Core.Patcients;

import Clinic.Human.Owner;
import Homework_2.Core.Goable;

import java.time.LocalDate;

public class Hamster extends Animal implements Goable {
    public Hamster(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public double go() {
        return 3.3;
    }
}
