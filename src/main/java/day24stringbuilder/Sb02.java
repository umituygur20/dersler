package day24stringbuilder;

import java.sql.SQLOutput;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);
        sb1.reverse(); //  String'in ters cevirilmesi looplar ile de yapilir bu kısa yoldur.
        System.out.println(sb1); // ysae si avaJ // interview= = ben String builder ile de reverse methodu kullanarak da ters cevirebilirim.

        sb1.deleteCharAt(6); //indexte bulunan karakteri sil demek . .//verilen indexteki karakteri siler+

        System.out.println(sb1);  //ysae s avaJ       / i harfi gitti ...

        sb1.delete(1, 5); // baslangic index dahil bitis index harif olan karakterleri siler.
        System.out.println(sb1); //ys avaJ


        //sb1.replace(2,5,"0"); methodu 2 dahil 5 haric yani index 2,3,4'deki karakterlerin yerine "0" koyar.
        sb1.replace(2, 5, "000000000");
        System.out.println(sb1); //ys000000000aJ

        sb1.insert(3, "XXX");  // OFFSET kaç ise o kadar say ve atla demek !!
        System.out.println(sb1); //ys0XXX00000000aJ



        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Kava");

        /**  sonuc 0 ise alfabetik olarak ayni siradalar demektir.
             sonuc -1 ise sb2 sb3 'ten alfabetik  olarak bir önde demektir.
             sonuc -2 ise sb2 sb3 'ten alfabetik  olarak bir sonra demektir.*/

        //iki tane StringBuilder kıyaslıyor . hiçbir farklılık yoksa sonuc olarak "0" verir.
        int sb4 = sb2.compareTo(sb3);
        System.out.println(sb4);

        /** StringBuilder nasil String'e çevirilir ? */
         String str =sb2.toString().toUpperCase();
        System.out.println(str); //JAVA

        /** String nasil StringBuilder'a çevirilir ? */
        StringBuilder newSb2 = new StringBuilder(str);
        System.out.println(newSb2);

    }
}
