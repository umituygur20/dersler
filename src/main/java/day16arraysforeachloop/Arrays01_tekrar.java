package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01_tekrar {
    public static void main(String[] args) {
        int a = 13; // tek bir data depolayabiliyoruz bu şekilde.
        //Bir yapının içine çoklu data depolayabilme için java Array yapısını oluşturmuştur.


        /**
         *
         * Arrayler hesap memory'de stake ediliyor.
         * Array nasıl oluşturulur.
         */
        String[] stdNames = new String[3]; // 3 kişilik masa açtık

        //Array'e eleman ekleme
        //Arrayler index yapısı kullanır.

        stdNames[0] = "Umit";
        stdNames[1] = "Emine";
        stdNames[2] = "Zeynep";
        System.out.println(Arrays.toString(stdNames));

        String []aile = new String[3];
        aile[2] ="Zeynep";
        aile[1] ="Emine";
        aile[0] ="Umit";


        System.out.println(Arrays.toString(aile));
        System.out.println(aile[1]);
        System.out.println(stdNames[2]);
        System.out.println(aile[2]);
        //Array yazdırmayı toString ile yazdır .

        /**Arrayler diğer collectionlardan çok çok daha hızlıdırlar. (Superfast)
         * Array'ler diğer collectionlardan daha az memory kullanırlar.
         */

        //Örnek Arraydeki her elemanın sonuna "!" işareti koyarak ekrana yazdırınız.
        for (int i = 0; i <aile.length ; i++) {
            System.out.print(aile[i] + "\uD83D\uDE0D " + " ");
        }

    }


}
