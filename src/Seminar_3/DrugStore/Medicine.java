//package Seminar_3.DrugStore;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class Medicine implements Iterator<MedicinCompanent> {
//    private List<MedicinCompanent> medicinCompanents ;
//    private int index;
//
//    public Medicine() {
//        this.medicinCompanents = new ArrayList<>();
//        this.index = 0;
//    }
//
//    public Medicine addComponent(MedicinCompanent companent){
//        medicinCompanents.add(companent);
//        return this;
//    }
//
//    @Override
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
//
//    @Override
//    public String toString() {
//        return toString();
//    }
//}
