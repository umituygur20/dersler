package day09ifstatements;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
       // Örnek Sayi üç basamaklı ise ekrana "Sayi üç basamaklıdır!" yazıdırınız

        Scanner input =new Scanner(System.in);
        System.out.println("üç basamaklı bir sayı giriniz!");
        int number =input.nextInt();

        int num= Math.abs(number);
        if (num>99 && num<1000){
            System.out.println("Sayı üç basamaklıdır!");
        }

        //Örnek 2: Bir stringdeki tekrarsız karakterleri ekrana yazdırınız.
        //abbccdc  ==> ad


//        Scanner scn = new Scanner(System.in);
//        System.out.println("Tekrarlanıp tekrarlanmadığına bakacağınız karakterleri yazınız!");
//
//        String str = scn.nextLine();

        String str ="aac";

        char ch1 = str.charAt(0);

        if(str.indexOf(ch1)==str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }
        char ch2 = str.charAt(1);
        if (str.indexOf(ch2)==str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }
        char ch3 = str.charAt(2);
        if (str.indexOf(ch3)==str.lastIndexOf(ch3)){
            System.out.println(ch3);
        }


    }
}
