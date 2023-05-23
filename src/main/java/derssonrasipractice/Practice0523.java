package derssonrasipractice;

import java.util.Scanner;

public class Practice0523 {
    public static void main(String[] args) {
//
//        for (int i =1; i<=3;i++){
//            System.out.println("Hafta :" + i);
//            for (int j =1; j<=7;j++){
//                System.out.println("    Gün : "+j);
//            }
//        }


         /*Asagida gordugunuz sekli console'a yazdıran kodu oluşturunuz

                X X X X X
                X X X X X
                X X X X X

         */

        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();

        int column = scan.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int k = 1 ;k<=column;k++ ){
                System.out.print("X ");
            }
            System.out.println();
            System.out.println();
        }


    }
}
