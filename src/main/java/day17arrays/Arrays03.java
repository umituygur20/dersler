package day17arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Specific bir elemanin Array\de olup olmadigini anlamak icin gereken kodu yaziniz.

        String names[] = {"K", "C", "R", "A", "S"};

        String el = "R";

        //YOL 1 :----------------------------------------------------------------------------------------

        int counter = 0;
        for (String w : names) {
            if (w.equals(el)) {
                counter++;
                break;
            }

        }
        if (counter > 0) {
            System.out.println("Array has " + el);
        } else {
            System.out.println("Array does not have " + el);
        }

        //YOL 2:----------------------------binarySearch() Methodu -----------------------------------
//        String names[] = {"K", "C", "R", "A", "S"};
//             sort() ==>    A     C   K    R     S
//        binarySearch soyle calisir ==> oncelikle elemanlarin sirali olmasi lazim on kosul olarak ve
//        gider once ortadan calisir.ASCII deger aradigimizdan kucukse siler . sort methodu olmadan saglikli sonuc vermez
//        Dusunsene 1000lerce elemanlar var bakiyor duruma gore buyuk yada kucukse yarisini siliyor 500 e bakiyor
//        yani once Ortaya bakiyor buyukluk kucuklugune gore karar verip ikiye bolup ona gore calisiyor
//        o yuzden sort yapmazsak karar verme asamasi dogru calismaz .Bu mantik sayesinde hizli calisir

//        binarSearch() methodunu sort() methodu kullanmadan KULLANMA! Sirali elemanlar icin gecerlidir bu method.

        //2. way : binarySearch() methodu hizli calisir
        /*
        1)  binarySearch() methodunu sort() kullanmadan kullanmayiniz, cunku  binarySearch() mantigi sirali elemanlar icin gecerlidir.
        2)  binarySearch() methodu var olan elemanlar icin size o elemanin index ini verir.
             binarySearch() methodundan aldiginiz index 0 veya 0 dan buyuk ise bu o eleman arrayde var demektir
        3)  binarySearch() methodu olmayan elemanlar icin negatif tamsayi degeri verir.
        "-" isaretinin anlami o eleman yok demektir
        "sayi" ise o eleman olsaydi kacinci eleman olurdu demektir.
         */

        Arrays.sort(names);
        int result = Arrays.binarySearch(names, el);
        System.out.println(Arrays.toString(names));//[A, C, K, R, S]
        System.out.println(result);

        if (result < 0) {
            System.out.println("Array does not have " + el);
        } else {
            System.out.println("Array has " + el);
        }

        int num1 = Arrays.binarySearch(names, "A");
        System.out.println(num1);//0 ==> var hemde indexi sifir

        int num2 = Arrays.binarySearch(names, "K");
        System.out.println(num2);//2==> var hem de indexi 2

        int num3 = Arrays.binarySearch(names, "U");
        System.out.println(num3);//-6 ==> "-" bu eleman yok demek
        //"6"==> ise olsaydi  6. eleman olurdu demek


    }
}
