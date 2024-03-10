package Clinic.VeterinaryClinic;


import Clinic.Human.Doctor;

import Clinic.Human.Nurse;
import Clinic.VeterinaryClinic.VeterinaryClinicInterfase.Delite;
import Clinic.VeterinaryClinic.VeterinaryClinicInterfase.PrintPersonal;

import java.util.HashMap;
import java.util.Scanner;

public class DelADoc implements Delite, PrintPersonal {
    protected Scanner scanner = new Scanner(System.in);
    protected String userInput;
    public void Delite(HashMap<Integer, Doctor> Doctors, HashMap<Integer, Nurse> Nurses){
        while (true){
            System.out.println("если хотите удалить доктора введите 1,\nЕсли хотите удалить Медсестру нажмите 2\n Q для выхода");
            try {
                userInput = String.valueOf(scanner.next());
                if (userInput.equals("1")){
                    System.out.print("введите Номер врача которого хотите уволить: ");
                    deliteADoctor(Doctors, scanner.nextInt());

                }
                if (userInput.equals("2")){
                    System.out.print("введите Номер медсестры которого хотите уволить: ");
                    deliteANurse(Nurses,scanner.nextInt());
                }

                if (userInput.equalsIgnoreCase("Q")){
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            Print(Doctors,Nurses);
        }
    }
}
