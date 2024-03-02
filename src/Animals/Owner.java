package Animals;

import java.time.LocalDate;

public class Owner {
    int deafultIndex = 0;
    int deafultnumber = 000000;
    protected String ownersName;
    protected int ownersNumberPhone;
    public Owner(String name, int numberPhone){
        this.ownersName = name;
        this.ownersNumberPhone = numberPhone;
    }
    public Owner(){
        this.ownersName = String.format("DeafultName_%d", deafultIndex++);
        this.ownersNumberPhone = deafultnumber;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public int getOwnersNumberPhone() {
        return ownersNumberPhone;
    }

    public void setOwnersNumberPhone(int ownersNumberPhone) {
        this.ownersNumberPhone = ownersNumberPhone;
    }

    public String toString(){
        return String.format("Name : %s, Phone number:  %s", ownersName, ownersNumberPhone);
    }



}
