package Homework_2.Core.Patcients;

import Clinic.Human.Owner;

import java.time.LocalDate;

public abstract class Animal {
    protected String name;
    protected Owner owner;
    protected LocalDate age;
    protected float weight;
    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getAnimalsName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public void setAnimalsName(String name) {
        this.name = name;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return"name='" + name + '\'' +
                ", owner=" + owner +
                ", age=" + age +
                ", weight=" + weight +"\n";
    }
}
