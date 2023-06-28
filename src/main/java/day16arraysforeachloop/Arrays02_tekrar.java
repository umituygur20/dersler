package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02_tekrar {
    public static void main(String[] args) {
        //String array olusturun , icine 5 tane eleman ekleyin, ilk eleman ile son elemanın içerdiği karakter
        //sayiları toplamını yazdırın.
        String[] array = new String[5];
        array[0] = "Math";
        array[1] = "Science";
        array[2] = "Music";
        array[3] = "English";
        array[4] = "Art";

        System.out.println(Arrays.toString(array)); //[Math, Science, Music, English, Art]

        System.out.println(array[0].length() + array[array.length - 1].length()); // ilk eleman ve son eleman karakter sayısı 7

        System.out.println(array[1].length() + array[array.length - 2].length()); //2.eleman ve sondan ikinci eleman karakter sayisi 14


        //Örnek : String bir array oluşturun ,içine 5 tane eleman ekleyin, tüm elemanları içerdiği karakter sayıları toplamını ekrana yazdırın.

        String[] birArray = new String[5];
        birArray[0] = "Miami";
        birArray[1] = "Istanbul";
        birArray[2] = "Ankara";
        birArray[3] = "Oslo";
        birArray[4] = "Erzurum";


        //1 yol for loop
        int toplamKarakterSayisi = 0;
        for (int i = 0; i < birArray.length; i++) {

            toplamKarakterSayisi += birArray[i].length();

        }
        System.out.println("for loop çözümü ::: " + toplamKarakterSayisi);


        //2.yol foreach loop(enhanced loop)
        /**Baslangişc değeri , loopun calisma şartı  ve incerement  / decrement kısmını kendisi halleder.
         * for- each loop "Array"lerde ve " collection " lardan kullanılır.
         * Java birşeye yönelik yeni bir şey oluşturduysa hep onu kullanacaksınız.
         * bir array veya bir collection ile çalışıyorsanız ilk terchin mutlaka for-each loop olsun.
         */

        int toplamaKutusu = 0;
        for (String gezilecekArray : birArray) {

            toplamaKutusu += gezilecekArray.length();
        }

        System.out.println("for-each loop çözümünün sonucu :" + toplamaKutusu);


        //Örnek: NOTLAR ADINDA INTEGER BIR ARRAY OLUSTURUN ICINE 6 TANE NOT YERLESTIRIN VE NOT ORTALAMASINI EKRANA YAZDIRIN.

        int[] notlar = new int[6];
        notlar[0] = 50;
        notlar[1] = 70;
        notlar[2] = 60;
        notlar[3] = 40;
        notlar[4] = 90;
        notlar[5] = 80;


        int toplam = 0; // toplama yapacağımız için 0 değeri verdik.
        for (int dolasanDataw : notlar) {

            toplam +=   dolasanDataw;

        }
        System.out.println(toplam / notlar.length); // ortalamayı almak için array'in uzunluğuna böldük toplam notları ..


    }
}
