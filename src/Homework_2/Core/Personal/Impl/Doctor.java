package Homework_2.Core.Personal.Impl;

import Homework_2.Core.Personal.Staf;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Doctor extends Staf {

    private List<String> Diagnoses = List.of("Перелом", "Лишай", "Глисты");

    public Doctor(String name, String shurname, String id, LocalDate age, int phoneNumber, List<String> diagnoses) {
        super(name, shurname, id, age, phoneNumber);
        Diagnoses = diagnoses;
    }


    public String getName() {
        return name;
    }

    public void doDiagnose(){
        int randomDiagnose = (int) (1 + Math.random()) * 3;
        System.out.println("Диагноз: " + Diagnoses.get(randomDiagnose));

    }
}
