package day24stringbuilder;

public class Sb01 {
    public static void main(String[] args) {

        /**
         1) StringBuilder classida string üreten bir classtir.
         2) String class kullanarak String üretiriz Java nicin StringBuilder class'ida olusturdu ?
         String class "immutable" ( degistirilemez ) string üretir.
         StringBuilder "mutable" ( degistirilebilir ) string üretir.
         3) "Immutable" olmak demek orjinal degerin korunmasi , degistirilemez olmasi demektir.
         "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir.
         */


        /**   Immutable  */
        String s = "Java";  // Java
        String t = s + "!";   // Java!   --asil degeri degistirmiyor memory'de yeni bir kopya oluşturur.Immutaable...
        String w = t + "?";    // Java!?


        //String'i degistirdikten sonra ayni String' e assing= ederseniz , Java yine yeni bir container oluşturur.
        //Degismiş bu degeri bu yeni container'in icine koyar ve eski container'i gösteren pointer yeni container'a yonlendirilir.
        //Dolayisiyla eski container adressiz kalır ve garbage collector adressiz kalır .
        String a = "Money";
        a = a + "More";      // a ==> Sepetindeki refarans pointerini kırıyor .
        // a adresinin update edilmiş yeni sepetini referans olarak gösterir.


        //Java "Garbage Collector"  ile  memory'i tarar ve adresi olmayan container'lari siler ve memory boşaltır.


        // passByValue ve passByReferance programlama dillerinin özelliği
        // Immutable olmak class'lara ait bir özelliktir.

        /**   Mutable  */
        //StringBuilder kullanarak String üretmenin 1. yolu :

        StringBuilder sb1 = new StringBuilder("Pyhton");
        System.out.println(sb1); //Pyhton
        sb1.append("!");
        System.out.println(sb1); //Pyhton!

//        StringBuilder kullanarak string üretmenin 2. yolu
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());    //0  degeri verdi.

        System.out.println(sb2.capacity()); /** 16 çünkü  */

        sb2.append("Java");
        sb2.append("XXXXXXXXXXXXXX");

        System.out.println(sb2.length());    // 19
        System.out.println(sb2.capacity());   // 34 // Java bir 16lik daha yer açıyor ve +2 de sonuna ekliyor fazladan .

        //capacity () ve lenght () arasindaki fark nedir ?
        /** capacity() Java'nin size verdigi depolama yer sayisidir.
         *  lenght() ise size verilen data depolama yerinin kullanılan kısmıdır .
         *
         *  Java başlangic olarak size capacity'i 16 olarak verir .
         *  siz verilen capacity'yi asarsaniz Java yeni capacity'i varolanın 2 katinin 2 fazlasi olacak sekilde degistirir.
         *  16==> 16*2+2   - 34 ===> 34*2+2 ;şeklinde devam eder
         *
         *  */

        //Default capacity'i nasil degistirebiliriz ?
        StringBuilder sb3 = new StringBuilder(3); //3 çünkü capacity' int deger vererek 3 verdik.
        System.out.println(sb3.capacity());   //^3
        sb3.append("ali");
        System.out.println(sb3.capacity()); //^3
        System.out.println(sb3.length()); //^3


    }
}
