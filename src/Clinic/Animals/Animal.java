package Clinic.Animals;


import Clinic.Human.Owner;

import java.time.LocalDate;


public abstract class Animal {
    protected String animalsName;
    protected Owner owner;
    protected LocalDate age;
    protected float weight;



    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.animalsName = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }



    public abstract void eat();

    public String getType(){
        return  getClass().getSimpleName();
    }

    public String toString(){

        return String.format("name = %s, weight = %s, age = %s, owner = %s",
                animalsName, weight, age, owner);
    }

}
