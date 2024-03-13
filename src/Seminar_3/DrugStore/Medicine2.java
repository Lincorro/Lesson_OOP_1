package Seminar_3.DrugStore;

import java.util.*;

public class Medicine2 implements Iterable<MedicinCompanent>, Comparable<Medicine2> {
    private List<MedicinCompanent> medicinCompanents ;

    private int index;

    public Medicine2() {
        this.medicinCompanents = new ArrayList<>();
        this.index = 0;
    }

    public Medicine2 addComponent(MedicinCompanent companent){
        medicinCompanents.add(companent);
        return this;
    }
//    public boolean hasNext() {
//        //return medicinCompanents.iterator().hasNext();
//        return index < medicinCompanents.size();
//    }
//
//    @Override
//    public MedicinCompanent next() {
//        //return medicinCompanents.iterator().next();
//        return medicinCompanents.get(index++);
//    }

    @Override
    public String toString() {
        return "Medicine: " + medicinCompanents.toString();
    }

    @Override
    public Iterator<MedicinCompanent> iterator() {
        return new Iterator<MedicinCompanent>() {
            @Override
            public boolean hasNext() {
                return index < medicinCompanents.size();
            }

            @Override
            public MedicinCompanent next() {
                return medicinCompanents.get(index++);
            }
        };
    }
    public double getMedicinWeight(){
        double weight = 0;
        for (int i = 0; i < medicinCompanents.size(); i++) {
            weight = medicinCompanents.get(i).getWeight();
        }
        return weight;
    }
    public int getMedicinPower(){
        int power = 0;
        for (int i = 0; i < medicinCompanents.size(); i++) {
            power += medicinCompanents.get(i).getPower();
        }
        return power;
    }
    @Override
    public int compareTo(Medicine2 o) {
            int power = 0;
            Collections.sort(this.medicinCompanents, new Comparator<MedicinCompanent>() {
                @Override
                public int compare(MedicinCompanent o1, MedicinCompanent o2) {
                    return Integer.compare(o1.getPower(), o2.getPower());
                }
            });
            Collections.sort(o.medicinCompanents, new Comparator<MedicinCompanent>() {
                @Override
                public int compare(MedicinCompanent o1, MedicinCompanent o2) {
                    return Integer.compare(o1.getPower(), o2.getPower());
                }
            });
            return Integer.compare(this.getMedicinPower(),o.getMedicinPower());

    }


}
