package Animals;

import java.time.LocalDate;

public class Duck extends Animal{
    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void toMove() {
        System.out.println( getType()+ " умеет Ходить");

    }

    @Override
    public void toFly() {
        System.out.println( getType()+ " умеет Летать");
    }

    @Override
    public void toSwim() {
        System.out.println( getType()+ " умеет Плавать");
    }
}
