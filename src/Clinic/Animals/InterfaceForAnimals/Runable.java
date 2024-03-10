package Clinic.Animals.InterfaceForAnimals;
@FunctionalInterface
public interface Runable {
    default void toGo() {
        System.out.println("Я умею ходить");
    }

    double run();

    default void geSpeedRun() {
        System.out.println(run() + " км/ч");

    }
}
