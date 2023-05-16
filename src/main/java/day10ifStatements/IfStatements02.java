package day10ifStatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Example 1: Gün sayisini verdiğinizde gün ismini yazan kodu yazınız.
        //1 ==> Pazar2 , 2 ==> Pazartesi ...

        Scanner data = new Scanner(System.in);
        System.out.println("Lutfen kacıncı gün oldugunu giriniz ... ");
        byte num = data.nextByte();

        if (num == 1 ){
            System.out.println("Sunday");
        }else if (num == 2){
            System.out.println("Monday");
        }else if (num == 3 ){
            System.out.println("Tuesday");
        }else if (num == 4){
            System.out.println("Wednesday");
        }else if (num == 5 ){
            System.out.println("Thursday");
        }else if (num == 6){
            System.out.println("Friday");
        }else if (num == 7 ){
            System.out.println("Saturday");
        }else {
            System.out.println("1 ve 7 aralıgında bir sayı giriniz .");
        }


    }
}
