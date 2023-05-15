package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Kullanıcıdan alınan bir sayinin tek mi çift mi olduğunu konsola yazdırınız .

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        //if - if şeklinde yazdığımızda iki koşul çalıştırır buda istemediğmiz bir şey.
        //verimli kod olmaz.
        if (num%2 ==0){
            System.out.println("Sayı çifttir.");
        }
        if (num % 2 !=0){
            System.out.println("Sayı tektir.");

        }






// Eğer senaryo el veriyorsa yani iki koşula bakılacaksa if Else şeklinde kullanmalıdır .
        //Çünkü 1 kez Condition yapar .



       // 2. yol

        if (num%2 ==0){
            System.out.println("ÇİFT SAYI");

        }else {
            System.out.println("TEK SAYI");

        }


    }
}
