package day10ifStatements;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
       //Example: Verilen bir sayinin pozitif negatif veya nötr oldugunu kontrol eden kodu yazınız.

       Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz ...");
        int num = input.nextInt();

        if (num>0){
            System.out.println("Pozitiftir. .");

        }else if(num<0){
            System.out.println("Negatiftir");

        }else {
            System.out.println("Notr");
        }

    }
}
