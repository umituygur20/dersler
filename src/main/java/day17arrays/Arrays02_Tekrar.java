package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02_Tekrar {
    public static void main(String[] args) {

        //Örnek Kullanıcının çoklu datayı bir array'e yerleştirebilmesi , istediği zaman durdurabilmesi için gereken kodu yazınız.

        /**
         * Kullanıcıdan data almak için Scanner objesi oluştur
         * Çoklu datayi yerleştirmek için bir Array oluşturmalıyız.
         * Array oluşturabilmek için kullanıcıdan kaçtane eleman koyacağını almalıyız.
         * Loop oluşturup eleman ekleme işlemini tekrar tekrar yapabilmeliyiz.
         *
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet öğrenci notu gireceksin ?");
        //bu soruya göre öğrenci notlarını tutan bir array oluşturdum.

        int index = input.nextInt();
        int[] notlar = new int[index];


        System.out.println("Not girin");
        System.out.println("İşlemi durdurmak için 'q' ya basınız.!");

        for (int i = 0; i < index; i++) {
            System.out.println((i + 1) + " ' öğrencinin notunu giriniz.");

            String name = input.next();
            if (name.equalsIgnoreCase("q")) {
                break;

            } else {
                notlar[i] = input.nextInt();
            }

        }
        System.out.println(Arrays.toString(notlar));


    }


}
