package questionbank;

import java.util.Arrays;
import java.util.Scanner;

/* TASK :
 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
 * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
 * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
 *
 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler) +

 * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar) +

 * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle. +

 * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın. +


 * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
 * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
 * 			 ortalama kazançtan aşağıysa o günleri return yap.
 * */

public class BakkalKazanc {
    static Scanner input = new Scanner(System.in);
    static String[] gunler = {"Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"};
    static double[] gunlukKazanclar = new double[gunler.length];
    static double ortalamaKazanc;

    static void getOrtalamaKazanc() {
        int i = 0;
        while (i < 7) {
            System.out.println(gunler[i] + " günün kazancını giriniz.");
            gunlukKazanclar[i] = input.nextDouble();
            i++;
//            System.out.println(Arrays.toString(gunlukKazanclar)); günlük kazanclari indexe atadım
        }

        double toplam = 0;
        for (double w : gunlukKazanclar) {
            toplam += w;
//            System.out.println(toplam); // toplam sepetine günlük kazancları koydum
            ortalamaKazanc = toplam / gunler.length;
//            System.out.println(ortalama); // ortalama sepetine haftalık kazancın ortalamasını koydum
        }


    }

    public static String ortalamaninUstundekiKazancGunleri() {
//        5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.   for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır  . ortalama kazançtan yüksekse o günleri return yap.
        String[] ortalamaUstuGun = new String[7];
        int index = 0;
        for (double w : gunlukKazanclar) {
            if (w > ortalamaKazanc) {
                ortalamaUstuGun[index] = gunler[index];
            }
            index++;

        }
        return Arrays.toString(ortalamaUstuGun);

    }

    public static String ortalamaninAltindaKazancGunleri() {
//        6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.  for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır. ortalama kazançtan aşağıysa o günleri return yap.

        String[] ortalamaAltiGun = new String[7];
        int index = 0;
        for (double w : gunlukKazanclar) {
            if (w < ortalamaKazanc) {

                ortalamaAltiGun[index] = gunler[index];
            }
            index++;

        }
        return Arrays.toString(ortalamaAltiGun);
    }

    public static void main(String[] args) {

        getOrtalamaKazanc();
        System.out.println(ortalamaKazanc);
        System.out.println("Ortalamanin üstündeki günler : " + ortalamaninUstundekiKazancGunleri());
        System.out.println("Ortalamanin altindaki günler : " + ortalamaninAltindaKazancGunleri());
    }


}
