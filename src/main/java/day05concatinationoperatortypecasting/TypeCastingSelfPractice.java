package day05concatinationoperatortypecasting;

public class TypeCastingSelfPractice {
    public static void main(String[] args) {
        /*
        * Numeric primitive data type'larının birbirine dönüştürülmesine "Type Casting" denilir.
        * Numeric (sayisal) primitive Data type'lar : byte , short , int , long , float , double   'dir
        */
/*        Note 1 : Kucuk data type'larini buyuk data type'larina donusturmeyi java kolaylıkla yapabilir.
         + Bu isleme "AUTO Widening (otomatik genisletme) denilir.
  */

        /* Note 2 : Buyuk data type'larini kucuk data type'larina cevirmek riskli bir istir.
        Java bu riskli isi otomatik olarak yapmaz. Bu islemi kod yazanlar yaparlar.
        Bu isleme "Explicit Narrowing (aciktan daraltma) denir.
         */

        // Ornek : byte data type'ini int data type'ina ceviriniz.
        byte age =33;
        int intAge = age; //

        // Ornek : int data type'ini short data type'na ceviriniz.

        int weight =433;
        short sWeight = (short) weight;

        // Ornek int data type'ni float data type'na ceviriniz

        int data = 444000;
        float iData = data; // Auto Widening denir. kucuk datayi buyuk dataya koymak.


        // Ornek 2 :double data type'ını short data type'ına çeviriniz.

        double yeniData = 32213.0;
        short sYeniData= (short) yeniData;
        System.out.println(yeniData);

        short num =260;
        System.out.println(num);

        byte numByte = (byte)  num ;
        System.out.println(numByte);

        // Note : Donusum yaptiginiz sayi (260) , donuseceginiz data type'ini sinirlari disinda ise
        // Java kullandiginiz sayi ile "MOD" alma islemi yapar ve mod isleminin sonucu sizin yeni degerinizdir.

    }


}
