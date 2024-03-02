package Animals;


import java.time.LocalDate;
import java.util.Locale;

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

    public String getType(){
        return getClass().getSimpleName();
    }

    public void lifeCycle(){
        wakeUp();
        play();
        eat();
        sleep();
    }

    private void wakeUp (){
        System.out.println(animalsName + " waked up");
    }
    private void sleep(){
        System.out.println(animalsName + " sleep");
    }
    private void play(){
        System.out.println(animalsName + " play");
    }
    private void eat(){
        System.out.println(animalsName + " eating");
    }


    public void toMove(){
         System.out.println( getType()+ " умеет ходить");
    }



    public void toFly(){
        System.out.println( getType()+ " Не умеет летать");

    }
    public void toSwim(){

        System.out.println( getType()+ " Не умеет плавать");

    }

    public void setAnimalsName(String animalsName) {
        this.animalsName = animalsName;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getAnimalsName() {
        return animalsName;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getDate() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public String toString(){

        return String.format("name = %s, weight = %s, age = %s, owner = %s",
                animalsName, weight, age, owner);
    }
}
