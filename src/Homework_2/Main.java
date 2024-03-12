package Homework_2;

import Clinic.Human.Owner;
import Homework_2.Core.Patcients.imp.Cat;
import Homework_2.Core.Patcients.imp.Dog;
import Homework_2.Core.Patcients.imp.Duck;
import Homework_2.Core.Patcients.imp.Hamster;
import Homework_2.Core.Personal.Impl.Doctor;
import Homework_2.Core.VetClinic.VetClinic;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        VetClinic clinic = new VetClinic();
        Hamster Bobr = new Hamster("Бобр",12, LocalDate.now(),new Owner() );
        clinic.adPatient(Bobr);
//        clinic.adPatient(new Dog("Бобик",4,LocalDate.now(), new Owner()));
//        clinic.adPatient(new Duck("Дональд", 6, LocalDate.now(),new Owner()));
        System.out.println(clinic.getPatients());
        Doctor doctor = new Doctor("Игорь", "Васильевич", "74AD7", LocalDate.now(), 89888);
        doctor.doDiagnose(Bobr);


    }
}
