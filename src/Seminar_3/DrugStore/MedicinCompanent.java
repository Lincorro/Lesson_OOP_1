package Seminar_3.DrugStore;

public abstract class MedicinCompanent implements Comparable<MedicinCompanent>{
    protected String name;
    protected float weight;
    protected int power;

    public MedicinCompanent(String name, float weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public float getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    @Override
    public int compareTo(MedicinCompanent o) {
        return this.power-o.power;

//        return Integer.compare(this.power, o.power);

//        if (this.power > o.power) return 1;
//        else if (this.power < o.power)  return -1;
//        else return 0;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", weight=" + weight +
                ", power=" + power;
    }
}
