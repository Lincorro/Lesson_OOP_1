package Homework_2.Core.VetClinic;

import Homework_2.Core.Flyable;
import Homework_2.Core.Goable;
import Homework_2.Core.Patcients.Animal;
import Homework_2.Core.Personal.Impl.Doctor;
import Homework_2.Core.Personal.Staf;
import Homework_2.Core.Swimable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VetClinic {

    private final List<Staf> stafs;
    private final List<Animal> patients;

    private HashMap<Doctor, List<Animal>> doctorsStac;
    public VetClinic() {
        this.patients = new ArrayList<>();
        this.stafs = new ArrayList<>();
    }
    public void addPersonal(Staf employee){
        stafs.add(employee);
    }
    public void fireStaf(Staf employee){
        stafs.remove(employee);
    }
    public void adPatient(Animal patient){
        patients.add(patient);
    }
    public void removePatient(Animal patient){
        patients.remove(patient);
    }
    public  List<Animal> getSwimables(){
        List<Animal> result = new ArrayList<>();
        for (Animal patient: patients) {
            if (patient instanceof Swimable) {
                result.add(patient);
            }
        }
        return result;
    }
    public List<Animal> getGoables(){
        List<Animal> result = new ArrayList<>();
        for (Animal patient: patients) {
            if (patient instanceof Goable) {
                result.add(patient);
            }
        }
        return result;
    }
    public List<Animal> getFlyables(){
        List<Animal> result = new ArrayList<>();
        for (Animal patient: patients) {
            if (patient instanceof Flyable) {
                result.add(patient);
            }
        }
        return result;
    }
    public List<Staf> getStafs() {
        return stafs;
    }
    public List<Animal> getPatients() {
        return patients;
    }


}
