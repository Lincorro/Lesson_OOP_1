package Clinic.Human;

public class Nurse extends Human{
    public boolean workWithDoctor;
    public Nurse(String name, boolean workingToday, boolean busyWithAPatient, short experience) {
        super(name, workingToday, busyWithAPatient, experience);
    }

//    protected void Work(){
//
//        if (workingToday == true){
//            if (workWithDoctor == true){
//                if (busyWithAPatient == true)System.out.println("Помогаю доктору");
//                else System.out.println("Заполняю бумаги");
//            }
//            else System.out.println("Занимаюсь работой медсестры");
//        }
//        else System.out.println("Сегодня я выходной");
//
//    }
}
