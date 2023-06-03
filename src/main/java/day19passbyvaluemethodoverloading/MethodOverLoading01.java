package day19passbyvaluemethodoverloading;

public class MethodOverLoading01 {
    public static void main(String[] args) {

        //Önemli bir konu interview'larda sorulur ....
        /* Overloading ne demek = Aşırı yükleme olarak çeviririz.Ayni isme birden fazla iş yüklersek
        aşırı yüklemiş oluyoruz.
        */
        // Overload asiri yukleme demek
        // ayni isimde farkli islmler yapan methodlar olusturmak demek
        // java da method isimleri yapilacak isle alakali olmalidir

        add(3, 5);


    }//main

    // simdi biz kendimiz overloading yaoicaz bi method olusturduk bunun icin ve sonnra overload yapicaz add methounu
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    /*
    add methodunda 5 secenek olusturduk burda kendimiz. add methodunu cagirdik peki java hangisini kullanacgina
    nasil karar veriyor? java biz parametre olaak ne girdiysek ona bakar. mesela biz yukarida 3  ve 5 yazdik,
    java bunu otomatik olarak int kabul etti. 5 alternatif icinden iki tane int olani gorur ve onu calistirir.
    bu sebeple iki int olan methodu calistirir.

    mesela add e 3 ve 5.5 girsek yukarida java int double kabul eder. biri tam sayi biri ondalikli cunku, java ondalikliyi
    double kabul eder.

    mesela 3, 5.5 ve 4 girdik. java burada hic birni secmez. ilk olarak bu uc parametreeli.
    5 alternatif icinde tek secenek var =>"public static void add(int a, int b, int c)" bu kisimda ucu de int
    fakat biz int double int girdik. burada expilicit narrowing yapamdagi icin java bunu otomatik olarak kabul etmez ve hata verir.


    "add(3,5);" girdimiz boyleyken "public static void add(int a, int b){"  bunu diyelim ki sildik;
    =>  1. public static void add(double a, double b)
        2. public static void add(double a, int b)
        3. public static void add(int a, double b)

    bu uc tanesini de secebilir aslinda java. ama az calisma prensibine bakar ve su sekilde karar verir:
   =>  1. kodda iki tane auto widining yapicam der gecer burayi
   =>  2. ve 3. kisimda bir kere auto widining yapacak yani esit durumda. bu durumda java esit iki ihtimalde bizim yerimize
    secim yapmaz ve hata verir. bizden tek ihtimal ister. bu durumda yapmamiz gerek ihtimalleri teke indirmemiz gerekir.
    2. veya 3. kodu yoruma alirsak sorun cozulur yani java icin tek ihtimal durumu dogar.

     */





    /*1 )  Method Overloading yaparken isim degistirilmez.
      2 )  Method Overloading yaparken parametreler degistirilir.
            a) Parametreleri degistirirken , parametlerin data type'ları degistirilebilir.
            b) Parametreler degistirilirken , parametrelerin sayisi degistirilebilir.
      3 ) Java için "ismi" ve "parametreleri" ayni olan iki method tamamen aynıdır .
            Bu yüzden ismi ve parametre " Method signature" olarak adlandırılır.

      4 ) Method Overloading olustururken return type'i degistirmenin hiçbir etkisi yoktur.
          Method Overloading olustururken access modifier'i degistirmenin hicbir etkisi yoktur.
          Method Overloading olustururken method'u static yada non-static yapmanın hicbir etkisi yoktur.
          Method Overloading olustururken body'i degistirmenin hicbir etkisi yoktur.
      5 ) "private" methodlar overload edilebilir. Cünkü method overloading sadece bir class icinde olur private olmak ise
            baska classlara gidildiğinde problem olur .

      6 ) static methodlar overload edilebilir .
      overloading yapmak icin (Method ismini degistirmeden ) method signature'i degistiririz
      dolayisiyla signature degistiginde yeni bir method olusturmus oluruz, bu nendele static olması birseyi degistirmez.






     */


}

