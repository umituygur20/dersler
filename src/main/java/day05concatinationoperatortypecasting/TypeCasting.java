package day05concatinationoperatortypecasting;

public class TypeCasting {
    public static void main(String[] args) {


    /*
    Numeric primitive data type'larının birbirine dönüştürülmesine "Type Casting" denilir.
    Numeric (sayısal) primitive Data type'lar  :  byte , short , int , long , float , double .
     */

        // Note 1 : Küçük data type'larını büyük data type'larına dönüştürmeyi java kolaylıkla yapabilir.
        //Bu işleme " AUTO WIDENING" ( otomatik genişletme ) denir .

        //Note 2  : Büyük data type'larını küçük data type'larına çevirmek riskli bir iştir.
        //Java bu riskli işi otomatik olarak yapmaz. Bu işlemi kod yazanlar yaparlar .
        //Bu işleme "ExplicitNarrowing" (Aciktan daraltma) denir .

        //byte data type'ini int daata type'ına çeviriniz.
        byte age = 13 ;
        int ageInt =age ;

        //int data type'ını short data type'ına çeviriniz.
        int weight =313;
        short weightShort = (short) weight;

        //Örnek 1 :  int data type'ini float data type'ına çeviriniz.
        int data=444400;
        float dataF=data; //AutoWidening

        //Örnek 2 :double data type'ını short data type'ına çeviriniz.

        double yeniData =32213.0;
        short yeniDshort = (short) yeniData;
        System.out.println(yeniDshort);

        //Örnek
        short num =260;
        System.out.println(num);

        byte numByte= (byte) num;
        System.out.println(numByte);
        //NOTE : Dönüşüm yaptığınız sayi (260), dönüşeceğiniz data type'inin sinirlarini dişinda ise
        // java kullandığınız sayi ile "mod" alma işlemi yapar ve mod işleminin sonucu sizin yeni değerinizdir.




    }



}
