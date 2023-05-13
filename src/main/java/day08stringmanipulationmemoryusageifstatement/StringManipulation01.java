package day08stringmanipulationmemoryusageifstatement;

import org.w3c.dom.ls.LSOutput;

public class StringManipulation01 {
    public static void main(String[] args) {
        //Örnek 1: Bir String'in hiç karakter içermediğini (Boş String olduğunu) kontrol eden kodu yazınız.
        //1.yol lenght() methodu ile çözümü

        String str = "umit emine";

        boolean result = str.length() == 0;
        System.out.println("String boş mu ? " + result);

        //2.yol
        //Java eğer bir konuda method oluşturmuşsa  o methodu kullanmak en iyisidir.
        boolean result1 = str.isEmpty();
        System.out.println("is Empty ?  " + result1);

        //Örnek 2:Bir String'in space hariç hiç bir karakter içermediğini kontrol eden kodu yazınız.
        //1.yol
        boolean result3 = str.replace(" ", "").length() == 0;
        System.out.println(result3);

        //2.yol
        //isEmpty() methodu sadece hiçbirşey için true verir . Lenght anlamında kontrol yapar .
        boolean result4 = str.replace(" ", "").isEmpty();
        System.out.println(result3);

        //3.yol
        //isBlank() methodu sadece space iceren String ler icin true verir, space disinda bir character var ise false verir
        //isBlank() methodu bos stringler icin de true verir
        //isBlank() methodu space + hic birsey icin true verir
        //isEmpty() methodu sadece hic birsey icin true verir.


        boolean result5 = str.replace(" ", "").isBlank();
        System.out.println(result5);

        //Örnek 3: Bir String'de a, i , e karakterlerinin ilk görünümlerinin indexleri toplamını ekrana yazdırınız.
        // 012345678910... İndex
        //"Java is easy to learn" ==>  1 + 5 + 8 = 14
        String ornek3 = "Java is easy to learn";

        int idxA = ornek3.indexOf('a');
        System.out.println(idxA);//1

        int idxI = ornek3.indexOf('i');
        System.out.println(idxI);//5

        int idxE = ornek3.indexOf('e');
        System.out.println(idxE);//8

        System.out.println("a e i Index Toplam = " + (idxI + idxA + idxE)); //14

        //Örnek 4 : Bir String'deki "Java" kelimesinin ilk olark kaçıncı index'te kullanıldığını gösteren kodu yazınız.
        //"Ah Java vah Java sensiz olmuyor Java."

        //indexOf("Java") kullanımında siz "Java" kelimesinin ilk görünümündeki ilk harfin(yani J'nin)index'ini almış olursunuz.
        String ahJava="Ah Java vah Java sensiz olmuyor Java.";
        int idxJ= ahJava.indexOf("Java");
        System.out.println(idxJ); // 3. index J yi veriyor.

        //indexOf() methodu olmayan karakterler için kullanılırsa her zaman -1 return eder.
        int idxjava=ahJava.indexOf("java");
        System.out.println(idxjava);

        //Örnek 5 : Bir String'de a, i , e karakterlerinin Son görünümlerinin indexleri toplamını ekrana yazdırınız.

        String ornek5 = "Java is easy to learn";
        int lastIndexA =  ornek5.lastIndexOf('a');
        System.out.println(lastIndexA);

        int lastIndexI = ornek5.lastIndexOf('i');
        System.out.println(lastIndexI);

        int lastIndexE =ornek5.lastIndexOf('e');
        System.out.println(lastIndexE);

        System.out.println("Bu indexlerin toplamı = " + (lastIndexA+lastIndexE+lastIndexI));

        //lastIndexOf() methodu'da olmayan karakterler için kullanılırsa her zaman -1 verir .

    }


}
