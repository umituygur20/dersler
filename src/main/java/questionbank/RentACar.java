package questionbank;

import java.util.Scanner;

public class RentACar {
    public static void main(String[] args) {
        /*
        Üç farklı method oluşturun.
          - İlk method, bir aracın günlük kira bedelini parametre olarak alacak ve toplam
          kira bedelini hesaplayıp döndürecek.

          - İkinci method, bir aracın günlük kira bedeli ve kiralama süresi parametrelerini alacak
          ve toplam kira bedelini hesaplayıp döndürecek.

          - Üçüncü method ise bir aracın günlük kira bedeli, kiralama süresi ve indirim oranı
          parametrelerini alacak ve
            indirimli toplam kira bedelini hesaplayıp döndürecek.

            Bu methodları kullanarak farklı araçların kira bedellerini hesaplayın.
        */

        System.out.println(rentACar(400, 5));

    }


    public static double rentACar(double rentprice, int days) {
        System.out.println("Lütfen kaç gün kiralamak istediğinizi belirtin.");

        Scanner scan = new Scanner(System.in);

        return rentprice * scan.nextInt();

    }

}
