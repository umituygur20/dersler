package smallstudygroup;

import java.util.Scanner;

public class TahminEtmeOyunu {
   static Scanner scan= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Lütfen tahmin etmek istediğiniz sayıyı giriniz");
        tahminler();
    }
    public static void tahminler(){
        int gizliNumara  = (int) (1+ (Math.random()*10));
        int[] tahminlerDizisi = new int[20];

        System.out.println(gizliNumara);
        int tahminler =0;
        int index =0;
        while(gizliNumara!=tahminler){

                  tahminler= scan.nextInt();
            tahmineBak(gizliNumara,tahminler);
                tahminlerDizisi[index] =tahminler;
            index++;

        }

    }
    public static void tahmineBak(int gizliNumara ,int tahminler){
        if (gizliNumara>tahminler){
            System.out.println("Yukarı");
        }else if (gizliNumara<tahminler){
            System.out.println("Asagi");
        }else {
            System.out.println("Bildiniz!!");
        }
    }

}
