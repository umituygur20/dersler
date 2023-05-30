package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {

        //Ornek 1: Kullanicidan coklu datayi bir Array'e yerlestirebilmesi , istedigi zaman durdurabilmesi icin gereken kodu yaziniz


        /* ne yapacagimizi siraya koyalim
        1 ) Kullanicidan data almak icin Scanner objesi olustur.
        2 ) Coklu datayi yerlestirmek icin bir Array olusturmaliyiz.
        3 ) Array olusturabilmek icin kullanicidan  Array'e kactane eleman koyacagini almayliyiz ..
        4 ) Loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyiz .
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz ogrenci sayisiniz giriniz");

        int numOfElements = input.nextInt();

        String stdNames[] = new String[numOfElements];

        System.out.println("islemi durdurmak icin 'q' ya basiniz");
        for (int i = 0; i < stdNames.length; i++) {

            System.out.println((i +1)+ " .Ogrencinin ismini giriniz ...");
            String name = input.next();

            if (name.equalsIgnoreCase("q")){
                break;
            }else {
                stdNames[i] =name;
            }
        }
        System.out.println(Arrays.toString(stdNames));


    }
}
