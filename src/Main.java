import Clinic.Human.Owner;
import Clinic.Animals.InterfaceForAnimals.Flyable;
import Clinic.Animals.Duck;
import Clinic.Animals.Lion;
import Clinic.VeterinaryClinic.VeterinaryClinic;

import java.time.LocalDate;
import java.util.*;

/*
Отличие абстрактного класса от интерфейса: Интерфейс не хранит состояние.
Создать класс Doctor и подумать над его состоянием и поведением.
Создать класс Nurse(медсестра) и подумать над его состоянием и поведением.

Создайте интерфейсы Goable, Flyable, Swimable. У интерфейсов должны быть
методы получения скорости заданного действия: double run(), double fly(), double swim()

Добавьте наследников этим интерфейсам, но таким образом,
чтобы у каждого интерфейса было минимум по два наследника (при необходимости, добавьте в приложение новые классы)

Создать класс ВетеринарнаяКлиника (VeterinaryClinic)
У ветеринарной клиники добавьте методы получения всех бегающих, всех плавающих и всех летающих,
а также методы для работы с персоналом клиники.

Формат сдачи: ссылка на гитхаб
 */
public class Main {


    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.veterinaryClinic();

        }

}
