package questionbank;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        /* TASK :
 Kullanicidan aldigimiz 8 elemanli arrayin icinde
3 e bölünebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 8 adet sayi giriniz");
//
        int[] arr = new int[8];
        int counter = 0;
        int index = 0;
        for (int w : arr) {
            System.out.println("Sayi giriniz");
            int sayi = scan.nextInt();
            arr[index] += sayi;
            index++;

        }

        for (int w : arr) {
            if (w % 3 == 0) {
                counter++;
            }
        }
        System.out.println("3 'e bölünebilen sayı adedi : " + counter);

//        int num[] = {3, 4, 5, 6, 7, 9};
//        int sum =1;
//        for (int w : num) {
//            sum  =w*w ;
//            System.out.print(sum +" ");
//        }
    }
}
