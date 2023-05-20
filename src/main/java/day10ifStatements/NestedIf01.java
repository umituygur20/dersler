package day10ifStatements;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        //Bir If var if'ten içeri

        //Example 1:Kullanıcıdan 3 tane sayi alınız.
        //Bu sayinin ucgen olusturma durumunu kontrol ediniz
        //Eger ucgen ise "eskenar ucgen" olma durumunu kontrol ediniz

        //INFO :
        //Ucgen olma sarti : herhangi iki kenar toplamı ücüncü kenardan büyük olmalı .
        //                   herhangi iki kenar farkı ücüncü kenardan kücük olmalı

        //    a+b>c> |a-b|
        //    a+c>b> |a-c|
        //    b+c>a> |b-c|

        // a=b=c ise eskenar ücgen


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 3 adet sayi giriniz.");
        double a = Math.abs(input.nextDouble());
        double b = Math.abs(input.nextDouble());
        double c = Math.abs(input.nextDouble());

        boolean ucgenmi = a + b > c && c > Math.abs(a - b) &&
                a + c > b && b > Math.abs(a - c) &&
                b + c > a && a > Math.abs(b - c);

        if (ucgenmi) {

            if (a == b && b == c) {
                System.out.println("Hem Üçgen Hemde EŞKENAR ÜÇGEN !");
            } else {
                System.out.println("ÜÇGEN ama EŞKENAR DEĞİL!!");
            }
        } else {
            System.out.println("Üçgen Değildir ! ! ");
        }

    }

}
