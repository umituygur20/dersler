package day09ifstatements;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        //Örnek Sayi üç basamaklı ise ekrana "Sayi üç basamaklıdır!" yazıdırınız

        Scanner input =new Scanner(System.in);
        System.out.println("üç basamaklı bir sayı giriniz!");
        int number =input.nextInt();

        int num= Math.abs(number);
        if (num>99 && num<1000){
            System.out.println("Sayı üç basamaklıdır!");
        }
    }
}
