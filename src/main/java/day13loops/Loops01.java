package day13loops;

public class Loops01 {
    public static void main(String[] args) {


        //Ornek 1: Ekrana 5 kere "Hi" yazdiriniz

        //1. Yol tavsiye edilmez
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");

        /*
         Code Standarts
         1) Tekrar (Repetition) olmamalidir
         2) Dynamic olmalidir
         3) Tamir (Fix) ve update kolay yapilabilmelidir.
         */

        //2 yol
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop" lar kullanilir
        //Dort tane loop var a) for-loop b) while-loop c) do-while-loop d) for-each loop

        //a) for - loop
        /*
        for(Baslangic Degeri      ; Loop un calisma sarti   ;  Artirma/Eksiltme     ){
            //calisacak kodlar
        }
        *///i=i+i /  i+=1 / i++
        //Baslangic Degeri      ; Loop un calisma sarti   ;  Artirma/Eksiltme

        for (int i = 1; i < 6; i++) {
            System.out.println("Hi");

        }

        //Örnek 2  : 11 'den 14'e kadar tüm sayilari ekrana yazdiran kodu yaziniz.

        for (int j = 11; j < 14; j += 2) {
            System.out.println("j = " + j);
        }


        //Örnek 3 : 40' dan 23 ' e kadar tüm çift sayıları ekrana yazdırınız.

        for (int c = 40; c > 23; c--) {
            if (c % 2 == 0) {
                System.out.print(c + " ");
            }
        }


        //Örnek 4 : 18 den 56' ya kadar tüm tek sayilari ekrana yazdıran kodu yaziniz.
        for (int a = 18; a < 57; a++) {
            if (a % 2 != 0) {
                System.out.print(a+ "   " );

            }
        }

    }
}
