package day03methodobjectcreationscanner;

public class Student {


    //Object nasıl oluşturulur .
    //Burası Obje oluşturmanın Syntax',idir.

    // new keyword'ü sifirdan yeni bir obje oluşturmak için kullanılır .
    //Constructor java'da objeleri oluşturmak için kullanılan özel bir method'dur.
    //Clas ismi +   Object ismi   + Assingment Operator   + "new" Keyword   + Constructor


    // Variable (==>Pasif özellikler)
    public String name = "Ali Can";
    public byte grade =8;
    public String adress ="Ankara";

    //method (==> Aktif özellikler)

    public void study (){
        System.out.println("günlük tekrarlarını asla ihmal etmez");

    }
   public void feed (){
       System.out.println("Saglikli beslenir");
   }
}