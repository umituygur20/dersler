package questionbank;

import java.util.Scanner;

public class BakkalAmca2 {
    static String[] days = {"pazartesi", "sali", "carsamba", "persembe", "cuma", "cumartesi", "pazar"};
    static double[] gunlukKazanc = new double[days.length];
    static Scanner input = new Scanner(System.in);
    static double ortalama = 0;

    public static void main(String[] args) {
        ortalamaKazanc(days, gunlukKazanc, input);
        ortalamaninUstundeKazancGunleri(days, gunlukKazanc);
        ortalamaAltiKazancGunleri(days, gunlukKazanc);

    }

    public static void ortalamaKazanc(String[] days, double[] gunlukKazanc, Scanner input) {
        int i = 0;
        while (i < 7) {
            System.out.println(days[i] + " gununun karini giriniz");
            double kazanclar = input.nextDouble();
            for (double w : gunlukKazanc) {

                gunlukKazanc[i] = kazanclar;
            }
            i++;
        }// System.out.println(Arrays.toString(gunlukKazanc)); // gunluk kazanci alip GunlukKazanclar' Array'ine koydum

        for (double w : gunlukKazanc) {
            ortalama += w;
        }
        ortalama /= days.length; // gunluk kazanc array'ini tektek gezdim '/ hepsini ortalama sepetine koydum / daha sonra toplam kazanci gunler sayisina boldum
        System.out.println(" ORTALAMA =  " + ortalama); //


    }

    public static void ortalamaninUstundeKazancGunleri(String[] days, double[] gunlukKazanc) {
        int index = 0;
        for (double w : gunlukKazanc) {
            if (w > ortalama) {
                System.out.println("Ortalamanin ustundeki kazanc gunleri " + days[index].toUpperCase() + " ");
            }
            index++;
        }
        System.out.println("*******************************************************************");
        System.out.println("*******************************************************************");

    }

    public static void ortalamaAltiKazancGunleri(String[] days, double[] gunlukKazanc) {
        int index = 0;
        for (double w : gunlukKazanc) {
            if (w < ortalama) {
                System.out.println("Ortalamanin altindaki kazanc gunleri " + days[index].toUpperCase());
            }
            index++;
        }
    }
}

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

//        5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.   for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır  . ortalama kazançtan yüksekse o günleri return yap.

         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */