package day05concatinationoperatortypecasting;

public class Concatination {
    public static void main(String[] args) {

        //Örnek 1 : Bir String ve iki int Oluşturunu.String değeri ile int'lerin toplamını Console'a yazdırın.

        String s = "elma";
        int x =10;
        int y= 11;

        System.out.println(s+x+y);  //elma1011
        System.out.println(s+(x+y));//elma21
        System.out.println(s+x*y); // elma110 ---- işlem önceliğine göre hareket eder .
        System.out.println(x+y+s);//  21elma    ----
        System.out.println(x+s+y);//  10elma11

        // String + tamsayı sonuç her zaman String yapar .

        // Javada "+" sembolü iki sayı arasında kullanılırsa "toplama" işlemi olur.
        // Javada "+" sembolü iki String arasında veya bir String bir int arasında kullanılırsa
        //Concatination işlemi olur.
        //Concatination birleştirme işlemi yapar .
        // Note : Concatination işlemlerinde Java matematikteki işlem önceliği kurallarini kullanır .

        //1) Önce Üslü sayilar
        //2) Parantez içi işlemler
        //3) Çarpma ve bölme işlemleri yapılır
        //4) Toplama ve Çıkarma işlemleri yapılır
        //5) Aynı öncelikli olanlarda hem çarpma ve hem bölme işlemi varsa SOLDAN SAĞA doğru işleme başlanır.

        //Örnek 2 : Size String olarak verilen iki fiyatın toplamını ekrana yazdırınız.

        String shirt ="2300";
        String shoes ="5200";
        System.out.println(shirt+shoes); //  23005200

//        Integer.valueOf() String değerleri integer'a çevirir..

        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);  // 7500

        //Örnek 3 : Size String olarak verilen iki fiyatın toplamını ekrana yazdırınız .
        String tv = "1100";
        String radio ="300$";

        int totalPrice =Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);

        //Note: valueOf() Tüm karakterleri rakam olan Stringleri sayılara çevirir.
        //Eger valueOf() methodu kullanılırken String'in içine rakam olmayan bir karakter koyarsanız HATA alırsınız.
        //Bu tarz hataları düzeltmeyi ilerleyen derslerimizde öğreniriz .




    }
}
