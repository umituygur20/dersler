package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Örnek : Kullanıcının ilk ismini ve soyismini alıp ikisini aynı satirda ekrana yazdırınız .

        //1.adim: Scanner class'tan bir object oluştur.
        Scanner input = new Scanner(System.in);

        //2.adim : Kullanıcıya ne istidiğize dair mesaj veriniz.
        System.out.println("İlk İsminizi Giriniz . . ");

        //3.adim :Uygun method'u kullanarak kullanıcını verdiği data'yı memory'ye yerleştiriniz.
        // next() ; methodu kullanicidan tek kelimeli String almak için kullanılır .

       String firstName = input.next();
        System.out.println("Soyisminizi giriniz . .");
       String lastName= input.next();
        System.out.println(firstName+" " +lastName);


    }
}
