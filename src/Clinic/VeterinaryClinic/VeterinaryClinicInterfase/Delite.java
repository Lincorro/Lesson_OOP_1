package Clinic.VeterinaryClinic.VeterinaryClinicInterfase;

import Clinic.Human.Doctor;
import Clinic.Human.Nurse;

import java.util.HashMap;

public interface  Delite {
    default void deliteADoctor(HashMap<Integer, Doctor> Doctors, Integer NumberDelitedDocter){
        Doctors.remove(NumberDelitedDocter);
        
    }

    default void deliteANurse(HashMap<Integer, Nurse> Nurse, Integer NumberDelitedNurse){
        Nurse.remove(NumberDelitedNurse);
    }

}
