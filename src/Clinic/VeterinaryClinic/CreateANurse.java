package Clinic.VeterinaryClinic;

import Clinic.Human.Nurse;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CreateANurse {
    Map<Integer,String> name = new HashMap<>();
    Map<Integer, Boolean> state = new HashMap<>();
    protected Random random = new Random();

    private void createState(){
        state.put(0,false);
        state.put(1,true);
    }

    protected void createName(){
        name.put(0,"Максим");
        name.put(1,"Елена");
        name.put(2,"Александр");
        name.put(3,"Александра");
        name.put(4,"Светлана");
        name.put(5,"Татьяна");
        createState();
    }
    protected void CreateANurses(Map<Integer, Nurse> Nurses, int size){
        createName();
        for (Integer i = 0; i < size; i++) {
            Nurses.put(i, new Nurse(name.get(random.nextInt(6)), state.get(random.nextInt(2)), state.get(random.nextInt(2)), (short) random.nextInt(46)));


        }
    }

}
