package derssonrasipractice;


import java.util.Scanner;

public class SporKursu_MiniProject01 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Öğrenci sayisini giriniz");

        int ogrenciSayisi = scan.nextInt();
        for (int i = 1; i <= ogrenciSayisi; i++) {

            System.out.println("Sıradaki öğrenci bilgilerini girin");
            scan.nextLine();
            System.out.println("Öğrenci ismini giriniz");
            String ogrenciIsmi = scan.nextLine();

            System.out.println("Öğrenci cinsiyetini kadın yada erkek olarak giriniz");
            String ogrenciCinsiyeti = scan.next();

            System.out.println("Öğrenci kilosunu giriniz");
            double ogrenciKilosu = scan.nextDouble();

            System.out.println("Öğrenci boyunu giriniz");
            double ogrenciBoyu = scan.nextDouble();

            if (ogrenciCinsiyeti.equalsIgnoreCase("erkek")) {
                if (ogrenciBoyu >= 1.60 && ogrenciKilosu >= 70 && ogrenciKilosu <= 90) {
                    System.out.println("Tebrikler " + ogrenciIsmi + " kursa katılabilirsiniz");
                } else {
                    System.out.println("üzgünüm şartlar sağlanamadı bizde torpil yok.");
                }


                if (ogrenciCinsiyeti.equalsIgnoreCase("kadin")) {
                    if (ogrenciBoyu >= 1.50 && ogrenciKilosu >= 50 && ogrenciKilosu <= 70) {
                        System.out.println("Tebrikler " + ogrenciIsmi + " kursa katılım sağlayabilirsiniz.");
                    } else {
                        System.out.println("üzgünüm başka sefere");
                    }
                }
            }

        }

    }
}

