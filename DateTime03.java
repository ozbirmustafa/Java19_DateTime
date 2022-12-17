package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {

        //Ex 1 : Japonya ile Almanya arasındaki zaman farkını hesaplayan kodu yazınız.

        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long diff = ChronoUnit.HOURS.between(germany,japan);
        System.out.println(diff); //6

        //Ex 2 : Sabit bir tarih oluşturunuz.

        LocalDate myDate = LocalDate.of(2011, Month.APRIL,13);
        System.out.println(myDate); //2011-04-13

        /*
            1) JAva'da sabit dataları (gün - ay isimleri, amerikadaki eyalet isimleri etc) depolamak ve gerektiğinde kullanmak için depolar oluştururuz.
               Bu depolara "Enum" denir.
        */

        //EX 3 : USA için "Woow!", UK için "Big", CANADA için "Cold", TURKEY için "Vatan", "GERMANY" İÇİN "Cars", RWANDA için "Tea" yazdırınız.

        Countries country = Countries.USA;

        switch (country){

            case USA:
                System.out.println("Woow!");
                break;
            case UK:
                System.out.println("BİG");
                break;
            case CANADA:
                System.out.println("COLD");
                break;
            case TURKEY:
                System.out.println("VATAN");
                break;
            case GERMANY:
                System.out.println("CARS");
                break;
            case RWANDA:
                System.out.println("TEA");
                break;
            default:
                System.out.println("Tanımlanmamış Ülke");


        }



    }
}
