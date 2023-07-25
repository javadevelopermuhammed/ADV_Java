package generics.classes;

import java.util.ArrayList;
import java.util.HashMap;

public class RunnerGenericType {
    public static void main(String[] args) {

        //Generics ile hangi data type ini kullanacağımıza sonradan karar verebiliriz
        //Java 7 den sonra sağ tarafta data type ini belirlemeye gerek kalmadı
        //                                        aha bu
        GenericClass<String> obj1 = new GenericClass<>();
        obj1.setField("Generic Types");

        String string = obj1.getField();//CTE vermedi
        System.out.println(string);//ClassCastExceptionı  da engelledi.

        //-----------------------------------------------

        GenericClass<String> obj2 = new GenericClass<>();
        //obj2.setField(123);//Genericler tür güvenliğini sağlar CTE verir

        GenericClass<Integer> obj3 = new GenericClass<>();
        obj3.setField(123);

        Integer integer = obj3.getField();

        //GenericClass<double> obj4 = new GenericClass<>();-- sadece NON-PRIMITIVE

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        //list.add(12);//type safety
        String s = list.get(0);


        HashMap<String,Integer> map = new HashMap<>();
        map.put("Generics",54);
        //map.put(54,"Generics");//type safety


        //----------------------Çok Parametreli Class--------------------------

        GenericClassTwoParam<String,Double> myMap = new GenericClassTwoParam<>("Generics",3.141592653589793238462643383279502884197169399375);
        GenericClassTwoParam<Integer,Integer> mymap2=new GenericClassTwoParam<>(12,34);



    }
}
