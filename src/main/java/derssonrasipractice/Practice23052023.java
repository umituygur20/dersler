package derssonrasipractice;

import java.util.Scanner;

public class Practice23052023 {
    public static void main(String[] args) {
        // Verilen bir string i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"
//1. yol
        String str = "Java";
        String empty = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            empty = empty + str.substring(i, i + 1);
        }
        System.out.println(empty);

        //2.yol
        String str1 = "Java";
        String bos = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            bos = bos + str.charAt(i);

        }
        System.out.println(bos);


        //ornek 2: size verilen bir string in "Polindrome" olup olmadigini kontrol eden kodu yaziniz
        //  nalan, ey edip adanada pide ye, 404

        //Logic : String i ters cevir sonrada duz hali ile ters halini karsilastir, ayni ise "Palindrome"

        String duz = "Nalan";
        String ters3 = "";

        for (int i = duz.length() - 1; i >= 0; i--) {
            ters3 = ters3 + duz.substring(i, i + 1);

        }

        if (duz.equalsIgnoreCase(ters3)) {

            System.out.println(duz + "Polindrome'dur");
        } else {
            System.out.println(duz + "Polindrome değildir.");
        }
//        String duz = "Nalan";
//        String ters3 = "";
//
//        for (int i = duz.length() - 1; i >= 0; i--) {
//            ters3= ters3+duz.substring(i,i+1);
//        }
//
//        if(duz.equalsIgnoreCase(ters3)){
//            System.out.println(duz+" : Palindrome dur");
//        }else{
//            System.out.println(duz+" : Palindrome degildir");
//        }

        //Ornek 1: 5 den 8 e kadar tamsayilarin toplamini veren kodu yaziniz
        //   5+6+7+8 ==> 26


        int sum = 0;

        for (int i = 5; i <= 8; i++) {
            sum = sum + i;
        }
        System.out.println(sum);


        //Ornek 2 : 7 den 9 a kadar tamsayilarin carpimini veren kodu yaziniz
        // 7*8*9 => 504

        int multiply = 1;
        for (int i = 7; i <= 9; i++) {
            multiply = multiply * i;
        }
        System.out.println(multiply);

        //Örnek 3 : Verilen bir tam sayinin rakamlarinin toplamini bulan kodu yaziniz.
        //578 ==5+7+8 =20

//        int toplam =578;
//        for (int i =toplam; i>0; i=i/10){
//
//            toplam= toplam+i%10;
////        }
//        System.out.println(toplam);
        int toplam = 0;
        int n = -578;
        n = Math.abs(n);
        for (int i = n; i > 0; i = i / 10) {
            toplam = toplam + i % 10;
        }
        System.out.println(toplam);

        /*Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
        9 - 14 ==> 10  12  14     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen başlangıç değerini giriniz");
        int start = scan.nextInt();

        System.out.println("Lütfen bitiş değerini giriniz");
        int end =scan.nextInt();

        if (start>end){
            System.out.println("baslangıc değeri bitis değerinden büyük olamaz.!");
        }else {
            for (int i =start; i<=end; i++){
                if (i%2==0){
                    System.out.println(i);
                }
            }
        }
        //Ornek 2 : Hic sayi kullanmadan 1 den 100 e kadar olan sayilari console a yazdiriniz

        for (int i='d'/'d';i<='d';i++){
            System.out.println(i);
        }

    }
}
