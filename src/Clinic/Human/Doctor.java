package Clinic.Human;

public class Doctor extends Human {
    public Doctor(String name, boolean workingToday, boolean busyWithAPatient, short experience) {
        super(name, workingToday, busyWithAPatient, experience);
    }

//    public void Work(){
//        if (workingToday == true){
//            if (busyWithAPatient == true)System.out.println("Сейчас на лечении");
//            else System.out.println("Готов принять пациента");
//        }
//        else System.out.println("Сегодня я выходной");
//
//    }
}
