package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Örnek  :  Kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alınız
        // a ) alanını hesaplayınız ==> kisa kenar * uzun kenar
        // b ) çevresini hesaplayınız ==> 2*kisa kenar +2*uzun kenar

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin kisa kenar uzunluğunu giriniz");
        double shortSide = input.nextDouble();
        System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz");
        double longSide =input.nextDouble();

        System.out.println("Alan hesap =" +shortSide*longSide);
        System.out.println("Çevre hesap =" +(2*shortSide+ 2*longSide));




    }
}
