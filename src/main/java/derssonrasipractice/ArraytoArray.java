package derssonrasipractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraytoArray {
    public static void main(String[] args) {

        /*
         * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
         * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */
//        int numbers[] = {2, 6, 4, 5, 8, 9};
//
//        int numbers2[] = {numbers.length} ; // yeni bir numbers2 dizisi olusturduk ki aldigimiz kareleri koyacagiz
//
//        int idx = 0; //  index' icini gezmek icin bos bir idx sepeti olusturduk
//
//        for (int w : numbers) {
//
//            int kareleri = (int) Math.pow(w, 2);
//
//            numbers2[idx] = w;
//
//            System.out.print(kareleri +" "); //4 36 16 25 64 81
//        }

        //kullanicidan bir array dizini al ve bunlarin toplamini yazdir


        Scanner input = new Scanner(System.in);

        System.out.println("Lufen Array icin bir sayi giriniz..");


        int arr[] = {};
//        int sepet [] ={};
        int idx = 0;
        for (int w : arr) {

            if (w > arr.length) {
                int sepet[] ={input.nextInt()};

                arr[idx] = w;
                System.out.println(w);
            }


        }


    }
}
