package generics.classes;

public class RunnerNonGeneric {

    public static void main(String[] args) {

        //2 tane farklı obje
        NonGenericType obj1 = new NonGenericType();
        NonGenericType obj2 = new NonGenericType();

        obj1.setField("Advanced Java");//fieldi String ile set ettik
        obj2.setField(123);//fieldi Integer ile set ettik

        //String string = obj1.getField();//CTE --> CAST problemi
        String string = (String) obj1.getField();
        System.out.println(string);

        //String str = (String) obj2.getField();//CTE --> CAST problemi
        String str = (String) obj2.getField();//Cast'ten sonra sorun yok gözüküyor
        System.out.println(str);//ClassCastException!!







    }

}
