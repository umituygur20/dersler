package day06swapvaluesstringmanipulations;

import java.util.Locale;

public class StringManipulations01 {
    public static void main(String[] args) {

        //String bir non - primitive data type'dir ve ayni zamanda bir class'dır.
        //01234567891011
        String s = "Java is easy";

        //Örnek 1  : "s" String'deki tüm karakterleri büyük harf yapınız.
        String upS = s.toUpperCase();
        System.out.println(upS);

        //Örnek  2 :"s" String'deki tüm karakterleri küçük harf yapınız.
        String downS = s.toLowerCase();
        System.out.println(downS);

        //Örnek 3 : "s" String'deki ilk Characteri alınız .

        char ilkC = s.charAt(0);
        System.out.println(ilkC);

        //Örnek 4 : "s" Stringdeki baştan ikinci ve sondan ikinci characteri alınız ve ekrana yazdiriniz.

        char birinci = s.charAt(1);
        System.out.println(birinci);
        char ikinci = s.charAt(10);
        System.out.println(ikinci);
        System.out.println("" + birinci + ikinci); // String arasında + olduğu için Concatination oldu . . .

        //Örnek 5: "s" String'deki kullanılan character sayisini bulunuz .

        int sLenght = s.length();
        System.out.println(sLenght);

        // Örnek 6 : "s" String'deki ilk 4 characteri alınız.
        //s.substring(0,4); ==> bu kullanımda ilk index dahildir , ikinci index hariçtir .
        String subzero = s.substring(0, 4);
        System.out.println(subzero);


        //Örnek 7 :"s" String'deki "is" kelimesini alınız.

        String is = s.substring(5, 7);
        System.out.println(is);

        //Örnek : 8 "s" String'deki easy kelimesini alınız.

        String easy=s.substring(8,12);
        System.out.println(easy);


        // ikinci yol
        String easy1=s.substring(8);
        System.out.println(easy1);

        //Örnek 9: "s" String'deki "money kelimesinin var olup olmadığını kontrol ediniz.

      boolean varmi=s.contains("money");
        System.out.println(varmi);

    }
}
