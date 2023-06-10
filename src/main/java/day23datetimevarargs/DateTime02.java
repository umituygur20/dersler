package day23datetimevarargs;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class DateTime02 {
    public static void main(String[] args) {


        //Anlik zamani nasil aliriz *

        LocalTime myCurrentTime = LocalTime.now(); // Classtan bir obje oluşturduk . Mevcut zamanı aldık .
        System.out.println(myCurrentTime);        //    21:13:58.308623900

        int hour = myCurrentTime.getHour();
        System.out.println(hour);     // saati aldık .

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);  // dakikayı aldık .

        int second = myCurrentTime.getSecond();
        System.out.println(second);  // saniyeyi aldık

        int nSecond = myCurrentTime.getNano();
        System.out.println(nSecond);  // nano saniyeyi aldık


        //Gelecek ve gecmise nasil gidilir  ? *

        LocalTime next = myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);
        System.out.println(next);    /** 13 dakika ekledik 3 saat ekledik --- ayrıcca 13 dakika çıkardık 3 saat çıkardik :)*/


        //Zaman formati nasil degistirilir ?**

        /**
         DateTime classta kullanılan tarih saat formatlari .
         HH : mm ==> 24 'lü saat sistemi    --saat ve dakika
         hh : mm ==> 12 'li saat sistemi    -- saat ve dakika
         hh : mm a ==> 12'li saat sistemi  AM , PM gösterilir.
         hh : mm : ss ==> 24 'lü saat sistemi

         HH : MM ==> yanlis format MM 'aylar icin' kullanılır .
         "mm" minute demektir.   "MM" month demektir.

         dd - MM -yyyy ==>> Gün Ay ve Yil verir.

         MMM ===> Aug
         MMMM ==> August

         */

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");

        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);


        /** Date Formati Nasil degistirilir ?*/

        LocalDate myDate = LocalDate.of(2023, 8, 13);
        System.out.println(myDate);  //2023-08-13

        // Tarihi AY / GUN / YIL şekline çeviriniz

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String newFormatedCurrentTime = dtf2.format(myDate);
        System.out.println(newFormatedCurrentTime);

        //Tarih GUN / Ay isminin ilk 3 harfi / YIL şekline çeviriniz

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String nf = dtf3.format(myDate);
        System.out.println(nf);


        // Tarih GUN / Ay ismş / YIL şekline çeviriniz  25/Aug/2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String nff = dtf4.format(myDate);
        System.out.println(nff);

        /** Baska bir zaman dilimindeki tarih ve zamani nasil alabiliriz ? */
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);     // Tokyodaki zaman dilimini aldık ..

        // Amsterdam da ayin kaci ?
        LocalDate amsterdamDate = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(amsterdamDate);

        // Tokyo' da saat kaç ?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo + " Tokyo");      //04:17:15.684429500 Tokyo

        //Amsterdam' da saat kaç ?
        LocalTime timeAmsterdam = LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeAmsterdam); //21:18:45.825980

        //Berlin'de saat kaç ?

        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin); //21:17:15.696440200

    }
}
