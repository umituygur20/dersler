package day04scannerwrapper;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
//        //HomeWork Kullanıcıdan aldığınız ortalamasını bulan kodu yazınız .
//        //Örneğin => 3,5,7 için ortalama ( 3+5+7 ) / 3 =5
           //Scanner sayiGir = new Scanner(System.in);
//        System.out.println("lütfen birinci sayıyı giriniz");
//        int sayi1 =sayiGir.nextInt();
//        System.out.println("lütfen ikinci sayıyı giriniz");
//        int sayi2=sayiGir.nextInt();
//        System.out.println("lütfen üçüncü giriniz");
//        int sayi3 =sayiGir.nextInt();
//        System.out.println("Girdiğiniz sayıların ortalaması = "+(sayi1+sayi2+sayi3)/3);

        //2) Kullanıcıdan aldığınız 3 basamaklı bir sayının rakamları toplamını bulunuz
        //Örneğin  312 için 3+2+1 =6
        Scanner sayiGir = new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz ..");
        int ucBasamakli= sayiGir.nextInt();
        int birlerBasamak = ucBasamakli%10;
        ucBasamakli =ucBasamakli/10;
        int onlarBasamak = ucBasamakli%10;
        ucBasamakli=ucBasamakli/10;
       int yuzlerBasamak= ucBasamakli;
        System.out.println(birlerBasamak);
        System.out.println(onlarBasamak);
        System.out.println(ucBasamakli);
        System.out.println("sayıların toplamı = "+ (birlerBasamak+onlarBasamak+yuzlerBasamak));



    }
}
