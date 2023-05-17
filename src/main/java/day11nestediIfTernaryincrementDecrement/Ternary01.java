package day11nestediIfTernaryincrementDecrement;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

       //Ternary Statement
       //Ornek 1: Sayi 10 dan kucuk ise console'a "kucuk" yazidirin degil ise "kucuk degil" yazidirin.
       //----------------- if else cozumu --------------------

       int num = 11;
//       if (num<10){
//           System.out.println("kucuk");
//       }else {
//           System.out.println("kucuk degil");
//       }






       //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Ternary Cozumu<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //Condition  ?  Condition true ise calisir     :   Condition false ise calisir;
//          String sonuc =   num<10  ?          "Kucuk"                :       "Buyuk";
//        System.out.println(sonuc);
//
//1. Cozum
       int k = -13;
       if (k%2==0){
           System.out.println("Cift");
       }else {
           System.out.println("Tek");
       }
       //Ternary Cozumu
      String result = k%2==0 ? "Cift":"Tek";


      String pN = k >=0 ? "Pozitif" : "Pozitif degil";
        System.out.println(pN);

        //Ornek 4 : Kullanıcıdan iki sayi alınız , "buyuk olmayan" ( Kucuk veya esit olan ) sayiyi yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("İki Sayi Giriniz..");
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        //1 yol
        if (a<b){
            System.out.println(a);
        }else {
            System.out.println(b);

        }

        //2 yol

        double result2 = a<b ? a:b;
        System.out.println(result2);


    }
}
