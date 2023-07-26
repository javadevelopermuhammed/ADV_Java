package generics.bounding;

//parametre olarak aldığımız data tipini üstten sınırlandırabiliriz.
//bu sınıfta sadece Number classının alt sınıfları kullanılabilsin
//T:Byte,Integer,Short,Long,Float,Double,Number
public class GenericUpperBound<T extends Number> {

    private T[] numberArray;

    //param const

    public GenericUpperBound(T[] numberArray){
        this.numberArray=numberArray;
    }

    //numberArray içindeki elemanların ortalamasını bulalım
    private double getAvarage(){

        double sum = 0;
        for (T t:this.numberArray) {

            sum+=t.doubleValue();//t değerini double a dönüştürür

        }
        double avarage = sum/this.numberArray.length;
        return avarage;
    }

    //main method
    public static void main(String[] args) {
        Integer[] intArr = {1,2,3};
        Double[] doubleArr = {0.3,5.8,99.9};
        String[] stringArr = {"Genericleri","üstten","sıralayabiliriz"};

        GenericUpperBound<Integer> obj1 = new GenericUpperBound<>(intArr);
        System.out.println(obj1.getAvarage());

        GenericUpperBound<Double> obj2 = new GenericUpperBound<>(doubleArr);
        System.out.println(obj2.getAvarage());

        //GenericUpperBound<String> obj3 = new GenericUpperBound<>(stringArr);
        //Generic data tipini Number ile üstten sınırlandırdık, String kabul etmez.
    }

}
