package day17arrays;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class Arrays01_Tekrar {
    public static void main(String[] args) {


        //Örnek : Verilen arrayde kaçtane çift sayi kaçtane tek sayı olduğu bulan kodu yazınız.
        int[] arr = {63, 19, 313, 353, 7, 100, 4};

        int sayac = 0;
        for (int w : arr) {
            if (w % 2 == 0) {
                sayac++;
            }
        }
        System.out.println("Array'de " + sayac + " adet çift sayı," + (arr.length - sayac) + " adet sayi Kullanılmıştır.");

        int tekMi[] = {1, 3, 5, 2, 4, 6};

        int tekSayi = 0;

        for (int w : tekMi) {
            if (w % 2 != 0) {
                tekSayi++;
            }
        }
        System.out.println("Arrayde " + tekSayi + " adet tek sayi," + (tekMi.length - tekSayi) + " adet çift sayı Kullanılmıştır. ");


        //ÖrneK: SİZE VERİLEN BİR STRİNG ARRAYDEKİ İSİMLERDEN 5 KARAKTERDEN DAHA AZ OLANLARI EKRANA  YAZDIRIN

        String[] names = new String[5];
        names[0] = "Ajda";
        names[1] = "Cüneyt";
        names[2] = "Tom";
        names[3] = "Ayhan";
        names[4] = "Filiz";

        for (String w : names) {

            if (w.length() < 5) {
                System.out.println(w);
            }
        }


        //Örnek : Size verilen bir String arraydeki isimleri alfabetik sıraya koyduktan sonra
        //"F" ile başlayan işlemler hariç diğer isimleri console'a yazdırınız.
        //Note1 : sort() methodu sayısal data typelari küçükten büyüğe sıralar(Ascending order)
        //Note2: sort() methodu String data typelari alfabatik olarak sıralar(Alphabetical order)
        //Note3 : ascending order + Alphabetical order ===>  Natural order)
        //Note4 : sort () methodu array elemanlarını "Natural order" a göre sıralar


        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        for (String w : names) {

            if (w.startsWith("F")) {
                continue;
            }
            System.out.println(w);
        }


    }

}
