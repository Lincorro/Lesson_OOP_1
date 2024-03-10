package Clinic.VeterinaryClinic;

import Clinic.Human.Doctor;
import Clinic.Human.Nurse;
import Clinic.VeterinaryClinic.VeterinaryClinicInterfase.Delite;
import Clinic.VeterinaryClinic.VeterinaryClinicInterfase.PrintPersonal;


import java.util.HashMap;
import java.util.Map;

public class VeterinaryClinic implements Delite, PrintPersonal {
    protected Map<Integer, Doctor> Doctors = new HashMap<>();
    CreateADoctors doctorsList = new CreateADoctors();
    CreateANurse nurseList = new CreateANurse();
    protected Map<Integer, Nurse> Nurse = new HashMap<>();
    public void veterinaryClinic(){
        doctorsList.CreateADoctors(Doctors,10);
        nurseList.CreateANurses(Nurse,25);
        Print((HashMap<Integer, Doctor>) Doctors, (HashMap<Integer, Clinic.Human.Nurse>) Nurse);
        CreateAnimalPatient animalPatient = new CreateAnimalPatient();
        animalPatient.collectPatients();
        DelADoc delADoc = new DelADoc();
        delADoc.Delite((HashMap<Integer, Doctor>) Doctors, (HashMap<Integer, Clinic.Human.Nurse>) Nurse);



    }

}
