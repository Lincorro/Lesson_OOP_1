package Calculator;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Programm {
    public static void main(String ... args){
        Calculator  calculator = new Calculator();
        System.out.println(calculator.clculate("*", 2, 4));

    }
}
class Calculator{
    Map<String, Calculable> calculableMap = new HashMap<>();
    private void Fill(){
        calculableMap.put("+",new Addition());
//        Calculable calculable = new Calculable() {
//            @Override
//            public double calculate(String operation, double... args) {
//                return 0;
//            }
//        };
        Calculable calculable = (operation, args)-> {
            return calculableMap.get(operation).calculate(operation,args[1],args[0]);
        };
    }
    public double add(int a, int b){
        return a+b;
    }
    public double substract(int a, int b){
        return a-b;
    }
    public double multi(int a, int b){
        return a*b;
    }
    public double deploy(int a, int b){
        return (double) a /b;
    }

    public  double clculate(String operator, int a, int b){
        if(operator.equals("+"))return add(a,b);
        if(operator.equals("-"))return substract(a,b);
        if(operator.equals("*"))return multi(a,b);
        if(operator.equals("/"))return deploy(a,b);
        else throw  new  RuntimeException("Операция не поддерживается");
    }
}
class Addition implements Calculable{
    @Override
    public double calculate(String operation, double... args) {
        if (args.length<2)
            throw  new RuntimeException("Операция не поддерживается");
        else return args[0] + args[1];
    }

}

interface Calculable{
    double calculate(String operation, double ...args);

}
