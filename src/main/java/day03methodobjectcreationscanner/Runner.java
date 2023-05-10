package day03methodobjectcreationscanner;

public class Runner {
    public static void main(String[] args) {

        //Object nasıl oluşturulur .
        //Burası Obje oluşturmanın Syntax',idir.

        // new keyword'ü sifirdan yeni bir obje oluşturmak için kullanılır .
        //Constructor java'da objeleri oluşturmak için kullanılan özel bir method'dur.
        //Clas ismi +   Object ismi   + Assingment Operator   + "new" Keyword   + Constructor
            Car             myCar               =                    new              Car();
        System.out.println("myCar fiyat = " + myCar.fiyat);
        System.out.println("myCar model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Student Alican =new Student();
        System.out.println("Alican.adress = " + Alican.adress);
        System.out.println("Alican.grade = " + Alican.grade);
        System.out.println("Alican.name = " + Alican.name);


         /*
     HOMEWORK 2

     isim yaş  = variable
     teach     =Method
    // icinde isim ve yas variablelari ile (teach methoduda) bulunan bir teacher
    // objesi olusturun ve ve obje uzerinde bu ozellikleri kullanin
      */


    }
}
