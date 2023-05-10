package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız 5 basamakli bir sayıyın ilk iki ve son iki
        //basamağındaki rakamların toplamını yazdıran kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println(" 5 Basamakli bir sayi giriniz");
        int number = input.nextInt();
        //Bir tamsayıyı tam sayıya bölerseniz java sonucu kesinlikle tamsayı yapar.
        //java yuvarlama yapmaz , ondalıklı kısmı iptal eder
        // % == > modulus operator solunda bulunan sayının sağinda bulunan sayıya bölümünden kalanı verir

        // son rakami al (Birler basamağını al)
         int lastDigit=number%10;
        System.out.println(lastDigit);
         //sayıyı küçült
         number =number/10;

         //onlar basamağını al
        int onlarBasamagi = number%10;
        System.out.println(onlarBasamagi);
        number=number/10; //

        //yüzler basamağını al
        int yuzlerBasamak =number %10;
        System.out.println(yuzlerBasamak);
        number= number/10;

        int binlerBasamak = number %10;
        System.out.println(binlerBasamak);
        number= number/10;
//
        int onBinlerBasamak = number %10;
        System.out.println(onBinlerBasamak);
        System.out.println("Bu sayıların toplamı ="+(lastDigit+onlarBasamagi+yuzlerBasamak+binlerBasamak+onBinlerBasamak));



    }

    //HomeWork Kullanıcıdan aldığınız ortalamasını bulan kodu yazınız .
    //Örneğin => 3,5,7 için ortalama ( 3+5+7 ) / 3 =5

    //2) Kullanıcıdan aldığınız 3 basamaklı bir sayının rakamları toplamını bulunuz
    //Örneğin  312 için 3+2+1 =6

}
