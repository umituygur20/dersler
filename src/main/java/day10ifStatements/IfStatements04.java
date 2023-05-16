package day10ifStatements;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
        //Example
        // Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.

        //0 - 4 ==>> bebek
        //5 - 12 ==>> cocuk
        //13- 20 ==>> genc
        //21 -30 ==>> yetiskin
        //30 ustu ==>> Tanimlamamis
        //Hata mesaji olarak "Gecerli bir yas giriniz" yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your age!");
        byte age = input.nextByte();

        if (age<0){
            System.out.println("Please enter a valid age..");
        }else if(age<5){
            System.out.println("Bebek");
        }else if (age<13){
            System.out.println("Cocuk");
        }else if (age<21){
            System.out.println("Genc");
        }else if (age<31){
            System.out.println("Yetiskin");
        }else {
            System.out.println("Tanimlanmamis");
        }

    }
}
