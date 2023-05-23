package day14loops;

import java.util.Scanner;

public class NestedLoops02 {
    public static void main(String[] args) {


        /*Asagida gordugunuz sekli console'a yazdıran kodu oluşturunuz

                X X X X X
                X X X X X
                X X X X X

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Satir(row) sayisini giriniz");
        int row = input.nextInt();

        System.out.println("Sutun (Column) sayisini giriniz..");
        int column = input.nextInt();

        for (int i = 1; i <= row; i++) {// distaki loop satirlar için satir sayisi kadar calisir


            for (int k = 1; k <= column; k++) {// icteki loop yan yana yazdiğindan sütünlar için  sutun sayisi kadar calisir
                System.out.print("x ");
            }
            System.out.println();//Satir yanyana yazdirildiktan sonra pointeri bir sonraki satira almak için
        }


    }
}
