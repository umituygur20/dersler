package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a = 13;








        // Bu yapının içine sadece bir tane data depolanabilir.
        //Ama biz code yazarken bir yapinin icine coklu data depolama ihtiyacı hissederiz
        //Bir yapinin icinde coklu data depolayabilme icin java Array yapisini olusturmustur.

        //Array nasil olusturulur

        String stdNames[] = new String[5];

        //Arrayler console'a nasil yazidirilir  ?
        //toString() methodunu kullanmadan yazdirirsaniz sadece array ismi ile yazdirirsaniz java o Array'in adresini yazdirir
        System.out.println(Arrays.toString(stdNames));

        //Arrayler diger collectionlardan  cok cok daha hizlidir(Superfast).
        //Arrayler diger collectionlardan daha az memory kullanirlar.

        //Array'e eleman ekleme nasil yapilir.

        stdNames[2] = "Benna";
        stdNames[3] = "Abdullah";
        stdNames[4] = "Recep";
        stdNames[0] = "Ekim";
        stdNames[1] = "Ümit";
        System.out.println(Arrays.toString(stdNames));  //Ekim , Ümit , Benna , Abdullah , Recep.

        //Array'den specific bir elemani nasil aliriz?
        System.out.println(stdNames[4]);// index 'içi string olduğu için toString kullanmaya gerek yok .
        System.out.println(stdNames[3]);
        System.out.println(stdNames[1]);
        System.out.println("---------------------");
        //Örnek 1 : Array'deki her elemanin sonuna ünlem isareti koyarak ekrana yazdiriniz.

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i] + "!???");
        }


    }
}
// EXTRA NOT   //Array nasil olusturulur?
//    String stdNames [] = new String[5];   //String bir data olustrucam diyoruz javaya.
//System.out.println(stdNames);         // Stringden baska bir data type koyamayiz icine
//        //"new String[5];" bu kisma 5 yazarak 5 kisilik String icin yer ayirttim javada.
//
//        System.out.println(Arrays.toString(stdNames));
//// Arrays.toString yazip variable name i alip yerlestirirsek arrayi konsolda goruruz
////eger array i konsolda gormek istiyorsak Arryas class indan to.String methodunu kullanicaz
//// Eger 17. kodu yazdirmak istersek konsolda gordugumuz adres bu==> " [Ljava.lang.String;@19dfb72a "  goruruz.
//// SEBEBİ;
//// Array ler heap memory de reserve edilir. Heap memory cok buyu oldugundan java bir harita olusturur gibi
////java hemen bir adres olusturur. bunu stack memory e atar ki heap te aradigini kolay bulabilsin.

//for (int i = 0; i<stdNames.length; i++) {
//    System.out.println(stdNames[i]+"!");
//}
//
///*
//Burada neden length() yapmadik? cunku biz array olustururken javaya en bastan kac tane alan reserve edecegimizi
//soyluyoruz. Bu olmazsa olmaz. Biz bastan kac tane eleman koyacagimizi soyledigimiz icin java arka planda o kadar
//variable olusuruyor. Biz length diyerek javanin arka planda olusturdugu variable i cagiriyoruz. Bu sebeple
//Stringler de ki length() method dur ama Array lerde length method degildir.
// */