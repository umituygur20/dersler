package day05concatinationoperatortypecasting;

public class Operators {

        /*
        1) +, - , * , / , işlemleri javada matematikte kullanıldığı gibi kullanılır
        Note 1 : int / int ==> int olur
        Note 2 : double + in  ==>
        Çünkü ; Java'da matematiksel işlemlerde farklı data type'ları kullanılırsa
         sonuc her zaman Büyük Data Type'ında olur

        2)Java'da "Logical Operator" lar vardir . And ve Or işlemleri "Logical Op." olarak adlandırılır .

        i ) AND (&&) isleminden true alabilmek için herşey True olmalıdır .
            AND işlemi "perfectionist"'tir.
            AND işleminde bir tane bile false olsa SONUCU False yapar .

        ii )OR (||) işleminde True alabilmek için sadece bir tane True olması yeterlidir .
           OR işleminde sonucun false olmasi için herşey false olmalıdır .
           OR işlemi "polyanna" gibidir .

          iii ) NOT operator (!) true olanı flase , false olanı true yapar .

          !true => false
          !false=> true
          !!true=> true

        3 )Comparison ( Karşılaştırma ) operators

        < , > , <= , >= , == , !=

        NOTE: Karsilastirma Operatorlarini kullandığınızda KESINLIKLE boolen(True veya False ) alirsiniz.
        NOTE: Biz AND işlemi için && kullanırız & kullanımında geçerlidir.
        Farkları nedir ?

        "&&" kullanım ilk ifade "false" olduğunda diğerlerini kontrol etmez, dolayısıyla hızlı calısır.
        çünkü and işleminde ilk ifade false ise diğerlerinin ne olduğunun bir önemi yoktur sonuç false olur .
        "&" kullanım ilk ifade ne olursa olsun diğerlerini kontrol eder dolayısı işe yavaş calısır.
        Bu sebepten hep "&&" kullanırız...

        */

    public static void main(String[] args) {

       boolean first= 3<5;
       boolean second =2+3!=5;
       boolean third =+3*5 >=19;
        System.out.println(first +" - "+ second);
        System.out.println(third);

        System.out.println(first && second);
        System.out.println(first || second);
    }
}
