package day17arrays;

import java.util.Arrays;
import java.util.Formattable;

public class Arrays01 {
    public static void main(String[] args) {

        //Arrayleri kısa yoldan nasıl oluşturabiliriz.

        int arr[] = {63, 19, 313, 100, 4, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 12, 14};
        System.out.println(Arrays.toString(arr));        //[63, 19, 313, 100, 4]


        //Ornek 1 : Verilen Arrayde kactane Cift sayi kac tane Tek sayi oldugunu  bulan kodu yaziniz.

        int sayac = 0;
        for (int w : arr) {
            if (w % 2 != 0) {
                sayac++;        // sayac kac defa calistiysa o kadar tek sayi var (sayac kutusuna koyduk)

            }                                                           // Array uzunlugu - sayac
        }
        System.out.println("Array'de " + sayac + " adet tek sayi " + (arr.length - sayac) + " cift sayi kullanilmistir");
        //Array'de 9 adet tek sayi 9 cift sayi kullanilmistir


        //Ornek 2 : Size verilen bir String Array'deki isimlerden 5 Characterden az Character icerenleri Console'a yazdiriniz

//        String stdNames [] = new String[];

        String stdNames[] = {"Ajda", "Cuneyt", "Tom", "Ayhan", "Filiz"};

        for (String w : stdNames) {
            if (w.length() < 5) {
                System.out.println(w);
            }
        }

        //Ornek 3 : Size verilen bir String arraydeki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan isimler haric
        //diger isimleri Console'a yazdiriniz.

        //String stdNames [] ={"Ajda", "Cuneyt", "Tom", "Ayhan", "Filiz"};

        //Note 1 : sort() methodu sayisal data typelari  kucukten buyuge siralar  (Ascending Order)
        //Note 2 : sort() methodu sayisal data typelari  alfabetik olarak siralar  (Alphabetical order)
        //Note 3 : ascending order + alphabetical order  ==> Natural order
        //Note 4 : sort() methodu array elemanlarini "Natural order" 'a gore siralar.

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));//     [Ajda, Ayhan, Cuneyt, Filiz, Tom]

        for (String w : stdNames) {
            if (w.startsWith("F")) {
                continue;
            } else {
                System.out.print(w +" "); //Ajda Ayhan Cuneyt Tom
            }

        }

                /*Java'da Arrays sınıfı, dizilerle çalışırken çeşitli yöntemler ve işlevler sağlar. İşte bazı yaygın kullanılan yöntemler ve dikkat edilmesi gereken noktalar:
        Dizi Oluşturma:
        int[] numbers = new int[5]; şeklinde bir dizi oluşturabilirsiniz. Bu örnekte 5 elemanlı bir int dizisi tanımlanmıştır.
        Diziyi başlatırken, bellekte ayrılacak eleman sayısını belirtmelisiniz.
        Eleman Erişimi:
        numbers[0] şeklinde belirli bir indeksteki elemana erişebilirsiniz.
        Diziler 0 indeksli olduğu için ilk elemana 0 indeksiyle erişiriz.
        Dizi Uzunluğu:
        numbers.length şeklinde bir dizinin uzunluğunu (eleman sayısını) alabilirsiniz.
        Diziye Değer Atama:
        numbers[0] = 10; şeklinde bir değer atayabilirsiniz.
        Dizi Elemanlarını Sıralama:
        Arrays.sort(numbers); şeklinde bir diziyi küçükten büyüğe sıralayabilirsiniz. Bu işlem dizinin kendisini değiştirir.
        Dizi Elemanlarını Karşılaştırma:
        Arrays.equals(array1, array2); şeklinde iki diziyi karşılaştırabilirsiniz. Bu metod, dizilerin elemanlarını karşılaştırır ve eşit olup olmadıklarını döndürür.
        Dizi Elemanlarını Doldurma:
        Arrays.fill(numbers, 0); şeklinde bir diziyi belirli bir değerle doldurabilirsiniz.
        Dizi Elemanlarını Kopyalama:
        int[] copy = Arrays.copyOf(numbers, numbers.length); şeklinde bir diziyi kopyalayabilirsiniz.
        Dizi Elemanlarını Birleştirme:
        int[] merged = Arrays.copyOf(numbers1, numbers1.length + numbers2.length); System.arraycopy(numbers2, 0, merged, numbers1.length, numbers2.length); şeklinde iki diziyi birleştirebilirsiniz.
        Dizi Elemanlarını Yazdırma:
        System.out.println(Arrays.toString(numbers)); şeklinde bir diziyi yazdırabilirsiniz.
        Dikkat edilmesi gereken bazı noktalar:
        Dizilerin boyutları sabittir ve başlangıçta belirtilen boyut üzerinden değiştirilemez.
        Dizi indeksleri sınırlarının dışına çıkmamalıdır. Aksi takdirde ArrayIndexOutOfBoundsException hatası alırsınız.
        Bazı yöntemlerin çalışması için dizinin sıralı olması gerekebilir. Bu durumda, sıralamadan önce dizi elemanlarını kontrol etmekte fayda vardır.*/

    }

}
