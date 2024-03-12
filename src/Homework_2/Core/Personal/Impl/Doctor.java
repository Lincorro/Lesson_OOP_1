package Homework_2.Core.Personal.Impl;

import Homework_2.Core.Patcients.Animal;
import Homework_2.Core.Personal.Staf;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Doctor extends Staf {
    private Random randomDiagnose;

    private List<String> Diagnoses = List.of("Перелом", "Лишай", "Глисты");

    public Doctor(String name, String shurname, String id, LocalDate age, int phoneNumber) {
        super(name, shurname, id, age, phoneNumber);

    }


    public void doDiagnose(Animal patient){

        System.out.println(patient+" Диагноз: " + Diagnoses.get((int) (Math.random()*(2-0+1))));

    }
}
