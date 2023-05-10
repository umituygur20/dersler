package day05concatinationoperatortypecasting;

import java.sql.SQLOutput;

public class AsciiValues {
    public static void main(String[] args) {

        /*
        javada her karakterin sayisal bir değeri vardir.
        bu değerler ASCII değerler olarak adlandırılır.
        Bu değerlerin tamaminin bulunduğu tabloya ASCII table denir.
         */

        //NOTE : Herhangi bir karakterin ASCII Değerini bulmak için o karakteri "int " data type'ında
        //bir variable'in içine koyarız.
        char ch ='A';
        System.out.println(ch);
        int k = 'A';
        System.out.println(k);//A 'nin ASCII Değeri

        int unlem ='!';
        System.out.println(unlem); // ! işaretinin ASCII Değeri bu şekilde bulabiliriz.

        char c1 = 'a';
        char c2 = '?';
        System.out.println(c1+c2); // 160
        //Javada charlari matematiksel işlemlerde kullanırsanız , java o charların  ASCII değerlerini kullanır.


    }
}
