package day25inheritance;

import day24stringbuilder.Student;

public class Animal extends Student {


    //Inheritance ==> Miras alma

    /**
      Özellikleri bir classtan diger classlara alan bir kavramdir.Bunun javadaki karşılığı şudur :
      <p>
      Siz bir class oluşturacaksınız ama daha önce oluşturulmuş bir class sizin istediğiniz özelliklerin bir çoğunu kapsıyor
      o zaman direkt yeni oluşturduğunuz class'i özelliklerini kullanmak istediğiniz class'a "child" yaparız .
      <p>

       --------- Inheritance faydaları --------
      1)Code tekrarından kurtuluruz.
      2)Code tamiri (maintenance) kolay olur.
      3)Child classlari daha atomic yapmis oluruz.
      <p>
      =>Bir Claass'i baska bir classin child class'i yapmak icin "extends" keyword kullanılır .
      ilk yazilan class "child" class  , ikinci yazilan class "parent veya super" olur.
      <p>
      <p>
      => Child class objeleri Parent class'dan method ve variablellari kullanabilirler.
      => Parent class  objeleri Child classtan method ve variable'lari kullanamazlar.....
      <p>
      => Javada bir class'in sadece 1 tane parenti olabilir.Çoklu parent'a "Multiple Inheritance" derler.
      tekli Parent' a "Single Inheritance" denilir.Java Multiple Inheritance'ı desteklemez.
      Java "Single Inheritance" kullanır.

     => Apartman şeklindeki inheritance yapisina "Multilevel Inheritance" denir.Java "Multilevel Inheritance"i destekler..

     => Object class her class'in parent'idir. Javada Object class her class'in parent'i vardir.
     Javada parent'i olmayan tek class Object classdir.

     => Java parenttan child'a olan ilişkilere "HAS-A Relationship" denir.
        Javada child'tan parent'a olan ilişkilere "IS -A Relationship" denir.


     */



    public void eat() {
        System.out.println("Animals eat....");

    }

    public void drink() {
        System.out.println("Animals drink....");

    }


}
