package Homework_2.Core.Patcients;

import Clinic.Human.Owner;
import Homework_2.Core.Goable;
import Homework_2.Core.Swimable;

import java.time.LocalDate;

public class Dog extends Animal implements Goable {
    @Override
    public double go() {
        return 0;
    }

    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }


}
