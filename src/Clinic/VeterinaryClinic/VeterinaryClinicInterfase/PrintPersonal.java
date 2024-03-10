package Clinic.VeterinaryClinic.VeterinaryClinicInterfase;

import Clinic.Human.Doctor;
import Clinic.Human.Nurse;

import java.util.HashMap;

public interface PrintPersonal {
    public default void Print(HashMap<Integer, Doctor> Doctors, HashMap<Integer, Nurse> Nurse){
        for (int i = 0; i < Doctors.size(); i++) {
            System.out.println("Доктор № "+ i +" информация: " + Doctors.get(i).getInfo());
        }
        System.out.println("\n");
        for (int i = 0; i < Nurse.size(); i++) {
            System.out.println("Персонал № "+ i +" информация: " + Nurse.get(i).getInfo());
        }

    }
}
