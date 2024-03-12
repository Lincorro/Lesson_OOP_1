package Homework_2.Core.Personal;

import java.time.LocalDate;
import java.util.Date;

public abstract class Staf {
    protected String name;
    protected String Shurname;
    protected String id;
    protected LocalDate age;
    protected int phoneNumber;

    public Staf(String name, String shurname, String id, LocalDate age, int phoneNumber) {
        this.name = name;
        Shurname = shurname;
        this.id = id;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getShurname() {
        return Shurname;
    }
    public void setShurname(String shurname) {
        Shurname = shurname;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
