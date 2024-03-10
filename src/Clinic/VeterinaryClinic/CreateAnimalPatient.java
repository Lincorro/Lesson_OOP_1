package Clinic.VeterinaryClinic;

import Clinic.Animals.*;
import Clinic.Human.Owner;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class CreateAnimalPatient {
    protected String animalsName;
    protected Owner owner;
    protected LocalDate age;
    protected float weight;
    protected Scanner scanner = new Scanner(System.in);
    protected String userInput;

    protected HashMap<Integer, Animal> patients = new HashMap<>();
    protected void collectPatients() {
        while (true) {
            System.out.println("Кто пришел в клинику?\n1-Кот\n2-Собака\n3-Утка\n4-Хомяк\n5-Лев\n6-Попугай\n7-Пингвин\nQ-завершить создание пациента");
            try {
                userInput = String.valueOf(scanner.next());
                if (userInput.equals("1")){
                    System.out.print("введите кличку животного: ");
                    animalsName = String.valueOf(scanner.next());
                    System.out.print("введите вес животного: ");
                    weight = scanner.nextFloat();
                    patients.put(patients.size()+1, new Cat(animalsName, weight, LocalDate.now(), new Owner()));
                }
                if (userInput.equals("2")){
                    System.out.print("введите кличку животного: ");
                    animalsName = String.valueOf(scanner.next());
                    System.out.print("введите вес животного: ");
                    weight = scanner.nextFloat();
                    patients.put(patients.size()+1, new Dog(animalsName, weight, LocalDate.now(), new Owner()));
                }
                if (userInput.equals("3")){
                    System.out.print("введите кличку животного: ");
                    animalsName = String.valueOf(scanner.next());
                    System.out.print("введите вес животного: ");
                    weight = scanner.nextFloat();
                    patients.put(patients.size()+1, new Duck(animalsName, weight, LocalDate.now(), new Owner()));
                }
                if (userInput.equals("4")){
                    System.out.println("введите кличку животного: ");
                    System.out.print("введите кличку животного: ");
                    animalsName = String.valueOf(scanner.next());
                    System.out.print("введите вес животного: ");
                    weight = scanner.nextFloat();
                    patients.put(patients.size()+1, new Hamster(animalsName, weight, LocalDate.now(), new Owner()));
                }
                if (userInput.equals("6")){
                    System.out.print("введите кличку животного: ");
                    animalsName = String.valueOf(scanner.next());
                    System.out.print("введите вес животного: ");
                    weight = scanner.nextFloat();
                    patients.put(patients.size()+1, new Parrot(animalsName, weight, LocalDate.now(), new Owner()));
                }
                if (userInput.equals("7")){
                    System.out.print("введите кличку животного: ");
                    animalsName = String.valueOf(scanner.next());
                    System.out.print("введите вес животного: ");
                    weight = scanner.nextFloat();
                    patients.put(patients.size()+1, new Penguin(animalsName, weight, LocalDate.now(), new Owner()));
                }
                if (userInput.equalsIgnoreCase("Q")){
                    break;
                }
                System.out.println("Сейчас в клинике: ");
                for (int i = 1; i < patients.size()+1; i++) {
                    System.out.println("Пациент№ " +i + patients.get(i).toString());

                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
