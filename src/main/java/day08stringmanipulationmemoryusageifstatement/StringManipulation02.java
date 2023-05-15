package day08stringmanipulationmemoryusageifstatement;

import java.nio.charset.StandardCharsets;

public class StringManipulation02 {
    public static void main(String[] args) {

        //Örnek 1: Bir String'in belirli bir karakterinden başlayarak belirli bir karaktere kadar dynamic olarak alınız.
        // abc@gmail.com  ==> gmail

        String a = "abc@hotmail.com";

        int startingIndex = a.indexOf('@') + 1;

        //başlangıç index +1 yapıyoruz ki dynamic olsun yahoo 'da olur hotmailde sorun olur diğer türlü.

        int endingIndex = a.indexOf('.');

        String companyName = a.substring(startingIndex, endingIndex);

        System.out.println(companyName);


        /////// HARD CODING
        //ÖRNEK  : : : : : : :  : :  hotma ' olarak yazdırır.
        System.out.println("hard coding ==> "+ a.substring(4,9));

        //ÖRNEK: 2 : Verilen iki string'in birbirnin aynı olup olmadığını kontrol ediniz.

        String h = "ali Can";
        String i = "Ali Can";
        // Java Case sensitive olduğu için küçük büyük harf bakar ve false verir .
       boolean result= h.equals(i);// equals methodu eşit mi diye bakar string sepetine bakıp.
        System.out.println(result);



        //Javada Memory Kullanımı

        /*
        Java'da iki tane memory vardir .
        1) Stack Memory ==> small
            a) küçük memory'dir
            b) Primitiveleri ve Non-Primitive'lerin adreslerini(Reference) tutar .
        2) Heap Memory ==> Huge
            a)Büyük memory'dir.
            b)Non-Pirimitive Dataları içerir.

        ==> Java HEAP memory'de yerleştirilen tüm non-primitive datalar için
bir ADRES(Reference) oluşturur ve STACK memory'de saklar.

///NOTE Örnekleme : Az miktardaki parayı Cüzdanımızda taşırız ( Stack Memory ). Cüzdana sığmayacak miktardaki parayı Banka'da saklamayı tercih ederiz.
 ( Heap Memory ). Banka'daki paramıza ulaşmak için gerekli Hesap Bilgilerini de yine Cüzdanımızda saklarız ( Referance - Adres )


     NOTE : Stringlerin eşitliklerini kontrol ederken "==" yerine "equals()" methodu kullanırız.
     Neden Kullanırız ?
     Çünkü "==" sembolu iki string'i karşılaştırırken hem adreslerine hem değerlerine bakar ,
     ikisi de aynı ise string'ler eşittir der. ama biz code yazarken genellikle Stringlerin adresleri
     ile ilgili değil değerleri ile ilgileniriz.
     Bu yüzden String karşılaştırmalarında "==" kullanmayIZ!!!! .

     "equals()" methodu ise iki string 'i karşılaştırırken sadece değerlerine bakar. Değerleri aynı ise
     bu iki string eşittir der , değerler farklı ise bu iki string farklıdır der ki bu bizim kod yazarken
     ihtiyaç duyduğumuz şeydir.


         */



    String s = "Tom";
    String t = "Terry";
    String r = new String ("Tom");

        System.out.println(s==t); // False çünkü adresleri ve değerler farklıdır

        System.out.println(s.equals(t));//False çünkü değerleri farklı.

        System.out.println(s==r);// false çünkü adresler farklı .

        System.out.println(s.equals(r));//True çünkü equals() sadece değerlere bakar .
        //"s" ve "r" değerleri aynı olduğundan  true verir.
//____________________________________________________________________________________________________
        //Örnek 3 Verilen iki String'in birbirinin aynısı olup olmadığını Büyük harf küçük harf dikkate almadan kontrol eden kodu yazınız.

        String v = "ali Can";
        String k = "Ali Can";
        boolean result1 = v.equalsIgnoreCase(k);
        //equalsIgnoreCase() methodu iki stringin birbirinin aynısı olup olmadığını büyük küçük harf
        //dikkate almadan kontrol eder .

        System.out.println(result1);



    }

}
