package Homework_2.Core.Personal.Impl;

import Homework_2.Core.Personal.Staf;

import java.time.LocalDate;

public class Nurse extends Staf {
    public Nurse(String name, String shurname, String id, LocalDate age, int phoneNumber) {
        super(name, shurname, id, age, phoneNumber);
    }

}
