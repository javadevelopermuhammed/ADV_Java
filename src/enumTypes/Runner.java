package enumTypes;

import static enumTypes.PasswordStrenghtConstant.*;
import static enumTypes.PasswordStrenghtConstant.HIGH;

public class Runner {
    public static void main(String[] args) {
        System.out.println("--------------Constant Version--------------");
        useConstant("LOW");
        useConstant("HIGH");
        useConstant("medium");//CTE yok, RTE yok...
        useConstant("yüksek");//CTE yok, RTE yok...

        //--------------------------------------------------
        System.out.println("--------------Enum Version--------------");
        useEnum(PasswordStrenghtEnum.LOW);
        useEnum(PasswordStrenghtEnum.MEDIUM);
        useEnum(PasswordStrenghtEnum.HIGH);
        /*
        useEnum("high");
        useEnum(123);
        */
        //sadece sınırlı değerler olan enumları kullanmaya zorluyor



    }

    public static void useConstant(String strenght){
        switch (strenght){
            case LOW:
                System.out.println("Password gücünüz düşüktür!!!");
                break;
            case MEDIUM:
                System.out.println("Password gücünüz orta seviyededir!!!");
                break;
            case HIGH:
                System.out.println("Password gücünüz yüksektir!!!");
                break;
            default:
                System.out.println("Hatalı giriş!");
                break;

        }

    }

    public static void useEnum(PasswordStrenghtEnum strenght){
        switch (strenght){
            case LOW:
                System.out.println("Password gücünüz düşüktür!!!");
                break;
            case MEDIUM:
                System.out.println("Password gücünüz orta seviyededir!!!");
                break;
            case HIGH:
                System.out.println("Password gücünüz yüksektir!!!");
                break;
        }

        System.out.println("Enum ismi: "+strenght.name());
        System.out.println("Enum sırası: "+strenght.ordinal());
    }
}
