package Clinic.Animals.InterfaceForAnimals;
@FunctionalInterface
public interface Swimable {

    default void toSwim() {
        System.out.println("Я умею плавать");
    }

    double swim();

    default void geSpeedSwim() {
        System.out.println(swim() + " км/ч");

    }
    public default boolean swimable(){
        return true;
    }
}
