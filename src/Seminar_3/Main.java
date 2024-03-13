package Seminar_3;

import Seminar_3.DrugStore.MedicinCompanent;
//import Seminar_3.DrugStore.Medicine;
import Seminar_3.DrugStore.Medicine2;
import Seminar_3.DrugStore.impl.Asytromin;
import Seminar_3.DrugStore.impl.Penicilinr;
import Seminar_3.DrugStore.impl.Vedmicit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/*
* Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
Скрыть
Добавить интерфейс Copmparable<Medicine> к классу Medicine. Переопределить метод compareTo()

Создать несколько экземпляров Medicine(лекарство), добавить их в ArrayList, написать метод, выводящий Medicine в отсортированном виде.

*(усложненное, не обязательное) Постараться написать еще 1 метод сортировки лекарств, но уже по другому параметру
Формат сдачи: ссылка на гит*/
public class Main {
    public static void main(String[] args ) {

        //Medicine2 medicine = new Medicine2();
        MedicinCompanent Asytronit = new Asytromin("Asytro",50,70);
        MedicinCompanent Penicilin = new Penicilinr("Penicilin", 25,40);
        MedicinCompanent Vedimicit = new Vedmicit("Vermicit", 40,120);
        MedicinCompanent Asytronit2 = new Asytromin("Asytro",50,170);
        MedicinCompanent Penicilin2= new Penicilinr("Penicilin", 25,140);
        MedicinCompanent Vedimicit2 = new Vedmicit("Vermicit", 40,1120);

        ArrayList<MedicinCompanent> medicinCompanents = new ArrayList<>();
        medicinCompanents.add(Asytronit);
        medicinCompanents.add(Penicilin);
        medicinCompanents.add(Vedimicit);
        System.out.println(medicinCompanents);

        ArrayList<MedicinCompanent> medicinCompanents2 = new ArrayList<>();
        medicinCompanents2.add(Asytronit);
        medicinCompanents2.add(Penicilin);
        medicinCompanents2.add(Vedimicit);
        System.out.println(medicinCompanents);

        Medicine2 medicine = new Medicine2();
        medicine.addComponent(Asytronit).addComponent(Penicilin).addComponent(Vedimicit);

        Medicine2 medicine2 = new Medicine2();
        medicine2.addComponent(Asytronit2).addComponent(Penicilin2).addComponent(Vedimicit2);
        ArrayList<Medicine2> medicine2s = new ArrayList<>();
        medicine2s.add(medicine);
        medicine2s.add(medicine2);
        System.out.println(medicine2s);

        Collections.sort(medicine2s);
        System.out.println(medicine2s);

    }
}
