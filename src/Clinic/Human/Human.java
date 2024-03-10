package Clinic.Human;

public abstract class Human {
    protected String name;
    protected boolean workingToday;
    protected boolean busyWithAPatient;
    protected short experience;
    public Human (String name, boolean workingToday, boolean busyWithAPatient,short experience){
        this.busyWithAPatient = busyWithAPatient;
        this.workingToday = workingToday;
        this.name = name;
        this.experience = experience;
    }

    public String getName(){
        return name;
    }

    public String getWork(){
        if (workingToday== true){
            if (busyWithAPatient== true)return "занят пациентом";
            else return "Свободен";
        }
        else return "отдыхаю";
    }

    public short getExperience(){
        return experience;
    }
    public  String getInfo(){
        return String.format("Имя = %s,\tСостояние = %s,\tСтаж работы = %s",
                getName(),getWork(),getExperience());

    }

}
