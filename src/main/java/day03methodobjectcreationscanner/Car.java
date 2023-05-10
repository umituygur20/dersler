package day03methodobjectcreationscanner;

//HOW CAN BE CREATE AN OBJECT ?
public class Car {

    //Pasif özellikler  ==>>>  Variable'lar oluşturalım
    public String model="Tesla";
    public int fiyat =20000;

    //Aktif özellikler ===>>  Methodları oluşturalım.,
    //NOT "return type" void OLDUĞUNDA METHOD İÇİNDE    "return" keyword'ü Kullanılmaz . . . . . . .
    public void hareket(){
        System.out.println("Tesla çok hızlı hareket eder..");
    }
    public void dur(){
        System.out.println("Tesla çok güvenli bir şekilde durur..");
    }


}
