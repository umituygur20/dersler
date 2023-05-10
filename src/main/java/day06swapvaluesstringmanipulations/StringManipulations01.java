package day06swapvaluesstringmanipulations;

import java.util.Locale;

public class StringManipulations01 {
    public static void main(String[] args) {

        //String bir non - primitive data type'dir ve ayni zamanda bir class'dır.

        String s = "Java is easy";

        //Örnek 1  : "s" String'deki tüm karakterleri büyük harf yapınız.
        String upS=s.toUpperCase();
        System.out.println(upS);

        //Örnek  2 :"s" String'deki tüm karakterleri küçük harf yapınız.
        String downS=s.toLowerCase();
        System.out.println(downS);

        //Örnek 3 : "s" String'deki ilk Characteri alınız .

        char ilkC= s.charAt(0);
        System.out.println(ilkC);

        //Örnek 4 : "s" Stringdeki baştan ikinci ve sondan ikinci characteri alınız ve ekrana yazdiriniz.

        char birinci= s.charAt(1);
        System.out.println(birinci);
        char ikinci= s.charAt(10);
        System.out.println(ikinci);
        System.out.println(""+birinci+ikinci); // String arasında + olduğu için Concatination oldu . . .

    }
}
