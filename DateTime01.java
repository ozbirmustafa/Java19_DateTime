package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {

        //Ex 1 : "anlik tarihi" (current date) ekrana yazdıran kodu yazınız.

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate); //2022-10-21

        //Ex 2 : "anlık zamanı" (current time) ekrana yazdıran kodu yazınız.
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime); //20:45:37.910794

        //Ex 3 : "anlik tarihi" (current date) ve "anlık zamanı" (current time) ekrana yazdıran kodu yazınız.
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime); //2022-10-21T20:45:37.910794

        //Ex 4 : Japonya'daki anlık tarihi ve tarihi zamanı ekrana yazdıran kodu yazınız.
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan); //2022-10-22T02:50:50.477009500

        //Ex 5 : İstanbul'daki anlık tarihi ve tarihi zamanı ekrana yazdıran kodu yazınız.
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul); //2022-10-21T20:52:56.496575

        //Ex 6 : Bugünden 789 gün sonra emekli olacağınıza göre emeklilik tarihini hesaplayan kodu yazınız.

        LocalDate countDate = LocalDate.of(2022,10,21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate); //2024-12-18

        //Ex 7 : İki çocuğunuzun doğum tarihleri arasındaki farkı gün olarak hesaplayan kodu yazınız.

        LocalDate dobAlii = LocalDate.of(2005,5,17);
        LocalDate dobVelii = LocalDate.of(2013,2,8);

        //Between methodu kullanıldığında daha eski olan tarih önce yazılmalıdır.
        long diff = ChronoUnit.DAYS.between(dobAlii,dobVelii);
        System.out.println(diff); //2824

        //Ex 8 : İstanbul'un fethi ile, Cumhuriyet'in kurulması arasında kaç ay olduğunu gösteren kodu yazınız.

        LocalDate istanbulFethi = LocalDate.of(1453,5,29);
        LocalDate cumhuriyetKurulus = LocalDate.of(1923,10,29);
        Long diff2 = ChronoUnit.MONTHS.between(istanbulFethi,cumhuriyetKurulus);
        System.out.println(diff2);

        //Ex 9 : Verilen tarihin hangi burçta olduğunu gösteren kodu yazınız.
        LocalDate myDate = LocalDate.of(1989,12,7);
        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();
        System.out.println(day + " - " + month);

        if ((day>=21 && month==3)){
            System.out.println("Koc");
        } else if (day<=20 && month==4) {
            System.out.println("Koc");
        } else if (day>=21 && month==4) {
            System.out.println("Boga");
        } else if (day<=20 && month==5) {
            System.out.println("Boga");
        }

        //2.Yol
        if ((day>=21 && month==3) || (day<=20 && month==4)){
            System.out.println("Koç Burcu");
        }else if ((day>=21 && month==4) || (day<=20 && month==5)){
            System.out.println("Boğa Burcu");
        }else if ((day>=21 && month==5) || (day<=20 && month==6)){
            System.out.println("İkizler Burcu");
        }else if ((day>=21 && month==6) || (day<=20 && month==7)){
            System.out.println("Yengeç Burcu");
        }else if ((day>=21 && month==7) || (day<=20 && month==8)){
            System.out.println("Aslan Burcu");
        }else if ((day>=21 && month==8) || (day<=20 && month==9)){
            System.out.println("Başak Burcu");
        }else if ((day>=21 && month==9) || (day<=20 && month==10)){
            System.out.println("Terazi Burcu");
        }else if ((day>=21 && month==10) || (day<=20 && month==11)){
            System.out.println("Yay Burcu");
        }else if ((day>=21 && month==11) || (day<=20 && month==12)){
            System.out.println("Oğlak Burcu");
        }else if ((day>=21 && month==12) || (day<=20 && month==1)){
            System.out.println("Kova Burcu");
        }


    }
}
