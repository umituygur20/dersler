package interview;

import java.util.Scanner;

public class Class01 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


/*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */


//        Scanner scan = new Scanner(System.in);
//        String string = scan.next();
////                      sepet
//        for (int i = 0; i < string.length(); i++) {
//
//            String sepet = string.substring(i, i + 1);
//
//            int counter = 1;
//            for (int j = i + 1; j < string.length(); j++) {
//
//                String sepet2 = string.substring(j, j + 1);
//
//                if (sepet2.equals(sepet)) {
//                    counter++;
//                    System.out.println(sepet + " "+ counter);
//                }
//            }
//        }







         /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */


//        System.out.println("pozitif bir sayi girin");
//
//        int sayi = input.nextInt();
//        boolean asalMi = true;
//
//        if (sayi >= 2) {
//            for (int i = 2; i < sayi; i++) {
//                if (sayi % i == 0) {
//                    asalMi = false;
//                    break;
//                }
//
//            }if (asalMi) {
//                System.out.println("Sayi asaldir.");
//            } else System.out.println("Sayi asal degildir");
//
//        } else {
//            System.out.println("istediğimiz sayi bu değil! 0 mı girdin -1 mi ?  adam gibi bişey yaz.");
//
//        }


        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız. //


//        System.out.println("pin numarasini girin");
//        String pinNum = "umit.0123";
//        int hak = 4;
//
//        while (true) {
//            if (pinNum.equals(input.next())) {
//
//                System.out.println("Tebrikler basarili giriş yaptınız.");
//
//            } else {
//                hak--;
//                System.out.println("yanliş giriş " + "Kalan hak : " + hak);
//            }if (hak == 0) {
//                System.out.println("Güle güle");
//                break;
//            }
//        }







        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */


        System.out.println("Bir cümle gir");
        String cumle = input.nextLine();
        System.out.println("bir harf gir");
        String harf = input.next().substring(0, 1);
        int counter = 0;
//Java öğrenmek güzeldir.


        for (int i = 0; i < cumle.length(); i++) {
            String harfKontrol = cumle.substring(i ,(i+1));
            System.out.print(harfKontrol);

            if (harfKontrol.contains(harf)) {
                counter++;
            }
        }

        System.out.println("Girdiginiz cumlede " + harf + " harfi " + counter + " kere kullanilmis.");

    }
}

