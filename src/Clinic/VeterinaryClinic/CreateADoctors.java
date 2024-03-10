package Clinic.VeterinaryClinic;

import Clinic.Human.Doctor;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public  class CreateADoctors {
    Map<Integer,String> name = new HashMap<>();
    Map<Integer, Boolean> state = new HashMap<>();
    protected Random random = new Random();

    protected void createState(){
        state.put(0,false);
        state.put(1,true);
    }
    private void createName(){
        name.put(0,"Иван");
        name.put(1,"Игорь");
        name.put(2,"Александр");
        name.put(3,"Вячеслав");
        name.put(4,"Николай");
        name.put(5,"Сергей");
        createState();
    }
    protected void CreateADoctors(Map<Integer, Doctor> Doctors,int size){
        createName();
        for (Integer i = 0; i < size; i++) {
            Doctors.put(i, new Doctor(name.get(random.nextInt(6)), state.get(random.nextInt(2)), state.get(random.nextInt(2)), (short) random.nextInt(46)));
        }
    }


}
