package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {

        //Örnek : Verilen karakter büyük harf ise ekrana"Büyük Harf" yazdıran,
        //küçük harf ise "Küçük Harf" yazdıran kodu oluşturunuz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir Karakter giriniz .. ");
        char ch= input.next().charAt(0);

        //1:YOL

        if (ch>= 'A'&& ch<='Z'){
            System.out.println("Büyük Harf");

        }
        if (ch>= 'a' && ch<= 'z'){
            System.out.println("Küçük Harf");
        }




    //ASCII TABLE
        //A =65  Z=90
        //a =97  z=122



        //2: YOL

        if (ch>= 'A'&& ch<='Z'){
            System.out.println("Büyük Harf");

        }
        else if (ch>= 'a' && ch<= 'z'){
            System.out.println("Küçük Harf");
        }
        else {
            System.out.println("Harf Değil");
        }



    }
}
