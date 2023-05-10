package day03methodobjectcreationscanner;

public class MethodCreation01 {
    public static void main(String[] args) {

        System.out.println(getCube(3));
        double kup = getCube(5);
        System.out.println("kup = " + kup);

        print("Java is easy");
    // Method oluşturmak için 2. yol
        // 2. yol ->>    //Örnek 2 : Girilen bir kelimeyi ekrana yazdıran bir method oluşturup kullanınız
        String str ="2'nci örnek";
        printConsole(str);
        int a=3;
        int b=5;
        carpmaYap(a,b);

        //Örnek 4 verilen bir tam sayının karesini hesaplayıp console'a yazdıran method oluşturup kullanınız.

        int c=6;
        karesiHesapla(c);

    }

    public static void karesiHesapla(int c) {
        System.out.println(c*c);
    }
    public static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    public static void printConsole(String str) {
        System.out.println(str);

    }

    //Örnek 1 : Verilen bir ondalık sayının küpünü hesaplayan bir method oluşturup kullanınız.
    static double getCube(double a){

        return a*a*a;
    }
//Note : Eğerki Access modifier'ı default yapmak isterseniz Access modifier yazmayınız.

    //Örnek 2 : Girilen bir kelimeyi ekrana yazdıran bir method oluşturup kullanınız.


    public static void print (String str){

        System.out.println(str);

    }

    //Eğer bir method yeni bir data üretmiyor ise return type'i void olur.
    //methodun return type'i void ise method body içinde return keyword'u yazilmaz.



}
