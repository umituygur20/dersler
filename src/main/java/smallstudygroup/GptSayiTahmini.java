

package smallstudygroup;

import java.util.Scanner;

public class GptSayiTahmini {
    public static void main(String[] args) {

        int rastgeleSayi = (int) (Math.random() * 100) + 1;
        int tahmin;
        int tahminSayisi = 0;
        boolean dogruTahmin = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 ile 100 arasında bir sayı tahmin edin.");

        while (!dogruTahmin) {
            tahmin = scanner.nextInt();
            tahminSayisi++;

            if (tahmin == rastgeleSayi) {
                dogruTahmin = true;
                System.out.println("Tebrikler! " + tahmin + " sayısını " + tahminSayisi + " tahminde buldunuz.");
            } else if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else {
                System.out.println("Daha küçük bir sayı girin.");
            }
        }
    }
}

