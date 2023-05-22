package day13loops;

import java.sql.SQLOutput;

public class Loops2 {
    public static void main(String[] args) {

        // Ornek 1: 21 den 180 e kadar hem 2 hemde 3 ile
        // tam bolunebilen tamsayilari ekrana yazdiran kodu yaziniz


        for (int i = 21; i < 180; i++) {

            if (i % 2 == 0 && i % 3 == 0) {

                System.out.print(i + " ");
            }
        }

        // Örnek 2 : Size verilen kücük harflerle yazilmis Stringini index'i çift sayi olan
        //characterlerini büyük harf yazdırınız.

        //          ankara  ==> AKR
        String s = "ankara";

        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.println(ch.toUpperCase());

                //Örnek 3 : Verilen bir String de ilk 'a' harfinden önceki tüm karakterleri console'a yazdırınız.
                //" I love Java " ==> "I Love J"
            }
        }
        String s1 = "I Love Java";
        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            if (ch == 'a') {

                break;
            }
            System.out.print(ch);
        }
        System.out.println();

        //Örnek 4 : Verilen bir stringde son'a' dan sonraki tüm karakterleri ters sırada yazdırınız.
        // "Germany" ==> yn


        String t = "Germany";

        for (int i = t.length() - 1; i >= 0; i--) {

            if (t.charAt(i) == 'a') {
                break;
            }

            System.out.print(t.charAt(i));
        }


    }
}


