package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        //Example 1  : Ay numarasını söyleyince , numarasi verilen ay'dan başlayıp 12. aya kadar tüm ayların
        //isimlerini yazdıran kodu yaziniz.
        //8 ==> August - September - October - November - December


        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic ayinin kacinci ay oldugunu giriniz");
        int numOfMonth = input.nextInt();

        switch (numOfMonth) {
            case 1:
                System.out.println("January");

            case 2:
                System.out.println("February");

            case 3:
                System.out.println("March");

            case 4:
                System.out.println("April");

            case 5:
                System.out.println("May");

            case 6:
                System.out.println("June");

            case 7:
                System.out.println("July");

            case 8:
                System.out.println("August");

            case 9:
                System.out.println("September");

            case 10:
                System.out.println("October");

            case 11:
                System.out.println("November");

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Lütfen Gecerli bir sayi giriniz!");
        }

        /*Note:
        * "switch" Condition parantezi içinde String , int , byte , short ,char , kullanılabilir.
        *
        * long , float , double , boolean                 Kullanamayız Switch Condition parantezi içinde
        * */

    }
}
