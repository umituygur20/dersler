package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

//        Örnek 1 : String array olusturun , icine 5 tane eleman ekleyin , ilk eleman ile son elemanin icerdigi
//        karakter sayilari toplamini ekrana yazdirin

        String arr[] = new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";

        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].length() + arr[arr.length - 1].length()); // toplamak icin lenght() methodu cagirdik


//        Örnek 2 : String bir Array olusturun , icine 5 tane eleman ekleyin , tüm elemanların icerdigi karakter
//        sayilari toplamini ekrana yazdirin

        String brr[] = new String[5];

        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Ankara";
        brr[3] = "Oslo";
        brr[4] = "Erzurum";

        int totalChar = 0;
        int i = 0;
        while (i < brr.length) {
            totalChar = totalChar + brr[i].length();
            i++;
        }
        System.out.println(totalChar);


//        for (int i =0 ; i<brr.length;i++){
//
//            totalChar= totalChar + brr[i].length();
//        } System.out.println(totalChar);
















        //2.yol for each loop (enhanced loop)
        // Baslangic degeri , loopun calisma sarti ve increment / decrement kismini kendisi halleder
        //for-each-loop  = "Array'lerde ve collection"larda kullanılır .

//        for (DataType w: arr/collection){
        //  calisacaak kodlar
//
//        }

        int sum = 0;
        for (String w : brr) {
            sum = sum + w.length();
        }
        System.out.println(sum);











        //Örnek 3 : Notlar adinda Integer bir array olusturunuz icine 6 tane not yerlestiriniz ve not ortalamasini ekrana yazdirin.

        int notlar [] = new int[6];

        notlar[0]=55;
        notlar[1]=65;
        notlar[2]=75;
        notlar[3]=45;
        notlar[4]=85;
        notlar[5]=75;

        // Java notlar Array'inde bulunan dizileri tek tek dolaşacak foreach loop ile
        // sonra bu verileri toplam'a ekleyip toplamını alırız
      int toplam = 0;
        for (int w:notlar) {
           toplam= toplam+w;
        }
        System.out.println("ortalama not = " +(toplam/ notlar.length));    }
}
