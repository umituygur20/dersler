package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
    // Örnek : kullanıcıdan adresini alınız ve ekrana yazdırınız .

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Adresinizi Giriniz . .");

        //nextLine(); methodu kullanıcıdan çoklu kelimeli String almak için kullanılır.
        String adress = input.nextLine();
        System.out.println("Adresiniz " + adress);

    }
}
