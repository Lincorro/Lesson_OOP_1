package Clinic.Animals.InterfaceForAnimals;
@FunctionalInterface
public interface Flyable {
    default void toFly() {
        System.out.println("я умею летать");
    }

    double fly();
    public default boolean flyable(){
        return true;
    }

    default void geSpeedFly(){
        System.out.println(fly() + " км/ч");
    }
}
