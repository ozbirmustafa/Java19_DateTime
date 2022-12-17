package day19datetime;

import java.text.Format;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Ex 1 : Java'dan aldığınız date i "ay/gun/yıl" olarak yazınız

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate); //2022-10-21

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //"MM" 10 dan küçük ayları 01,02,03.. şeklinde yazar
        String formattedDate1 = dtf1.format(currentDate);
        System.out.println(formattedDate1); //10/21/2022

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2 = dtf2.format(currentDate);
        System.out.println(formattedDate2); //Eki/21/2022  --ilk üç harf

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3 = dtf3.format(currentDate);
        System.out.println(formattedDate3); //Ekim/21/2022 --full isim

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy"); //"M" 10 dan küçük ayları 1,2,3.. şeklinde yazar
        String formattedDate4 = dtf4.format(currentDate);
        System.out.println(formattedDate4); //Ekim/21/2022 --full isim

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy"); //"YY" yılın son iki rakamını alır.
        String formattedDate5 = dtf5.format(currentDate);
        System.out.println(formattedDate5); //10/21/22

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yy"); //"d" 10 dan küçük günleri 1,2,3,4 etc şeklinde yazar
        String formattedDate6 = dtf6.format(currentDate);
        System.out.println(formattedDate6); //10/21/22

        System.out.println("-------");


        //Java'dan aldığınız Time in formatını değiştiriniz.

        LocalTime myTime = LocalTime.of(16,23,54,2345);
        System.out.println(myTime); //16:23:54.000002345

        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("HH:mm"); //"HH" 24 saat sistemini, "hh" 12 saat sistemini kullanır.
        String formattedMytime1 = dtf7.format(myTime);
        System.out.println(formattedMytime1);

        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("hh:mm a"); //"hh" kullanırsak "mm" den sonra bir boşluk bırakıp "a" koyarsak "am-pm" yazar
        String formattedMytime2 = dtf8.format(myTime);
        System.out.println(formattedMytime2); //04:23 ÖS



    }
}
