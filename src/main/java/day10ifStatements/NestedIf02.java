package day10ifStatements;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Üçgenin kenarları için  3 tane uzunluk giriniz.");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean ucgenmi = a + b > c && c > Math.abs(a - b) &&
                a + c > b && b > Math.abs(a - c) &&
                b + c > a && a > Math.abs(b - c);

         if (a<=0 || b<=0 || c<=0){
             System.out.println("Geçerli Kenar uzunlugu giriniz");

         }else if (ucgenmi){

            if (a==b & b==c && a == c){
                System.out.println("Eskenar Üçgen");
            }else if (a==b || b==c || a==c){
                System.out.println("İkizKenar Üçgen");
            }else {
                System.out.println("Çeşitkenar Üçgen");
        }

        }else {
            System.out.println("Üçgen Değil");
        }
    }
}
