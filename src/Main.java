import Animals.Animal;
import Animals.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*

1) Добавить в класс Animal public методы двигаться(toGo), летать(fly), плавать(swim).

2) Создать по два класса
наследника Animal, умеющих летать, плавать, бегать(животное может как уметь что-то одно, так и все сразу).

3) В main добиться того, чтобы при вызове метода действия, которое конкретное животное не умеет, оно этого не делало (кошки не летают, рыбы не ходят)

4) В файле readme.md в репозитории гитхаб описать
какие проблемы в таком проектировании Вы увидели,
а также там же написать возникшие при выполнении дз вопросы
(если они есть)

Формат сдачи:
Ссылка на гитхаб

 */
public class Main {

    public static void main(String[] args) {
        Lion animal = new Lion("Bobik", 100, LocalDate.now(), new Owner());
        Animal duck = new Duck("Дональд", 25,LocalDate.now(), new Owner() );

        System.out.println(animal.toString());
        System.out.println("-------------");
        animal.toMove();
        animal.toFly();
        animal.lifeCycle();
        System.out.println("-------------");
        System.out.println(duck.toString());
        duck.toMove();


        }
    }
