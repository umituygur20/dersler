package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //Note 1 : Önce canlı oturum sırasında çözülen örnekleri yapınız.
        //Note 2 : Tüm sorular dinamik kodlar ile çözülmelidir.
        //Note 3 : Birbirinizin çözümlerini inceleyerek tavsiyede bulunabilir yada yardım isteyebilirsiniz.

        //1 Bir String variable oluşturunuz ve bu String'deki rakam olmayan tüm karakterlerin sayisini Console'a yazdırınız.
        String hW1 = "15 Mayista Hersey Guzel Olacak";
        int rakamOlmayanCh = hW1.replaceAll("[0-9]", "").length();
        System.out.println("Rakam olmayan tüm karakterlerin sayısı = " + rakamOlmayanCh);


        //2 Bir String variable oluşturunuz ve ilk karakter ile son karakter dışındaki tüm karakterleri Console'a büyük harflerle yazdırınız
        String hW2 = "duzelicez insallah be ya";
        String answ1 = hW2.substring(1, hW2.length() - 1).toUpperCase();
        System.out.println(answ1);


        //3 Bir String variable oluşturunuz ve bu String'deki ilk ve son karakterlerin ASCII değeleri toplamını Console'a yazdrıınız.
        String hW3 = "Zeynep'i uyutmak çok zor";
        char charFirst = hW3.charAt(0);  //ASCII Z = 90
        char charLast = hW3.charAt(hW3.length() - 1); //ASCII r =114
        System.out.println(charFirst + charLast);


        //4 Tek kelimeli bir şehir ismi için String variable oluşturun ve şehir isminin ilk harfini büyük harf ile diğer harflerini küçük harflerle Console'a yazdırın
        String hW4 = "denizli";
        String ilkHarfBuyuk = hW4.toUpperCase().charAt(0) + hW4.toLowerCase().substring(1);
        System.out.println(ilkHarfBuyuk);

        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        //5 Aşağıdaki kurallara göre kullanıcının girdiği password'u kontrol ediniz
        // a) en az 6 karakter olsun
        // b) En az bir tane Büyük harf olsun
        // c) En az bir tane küçük harf olsun
        // d) En az bir tane rakam olsun


       

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String parola = input.next();
        boolean enAzalti = parola.length() > 5;
        System.out.println("En az altı karakter içeriyor mu ? " +enAzalti);
        boolean buyukHarf = parola.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("En az bir büyük harf içeriyor mu ?" +buyukHarf);
        boolean kucukHarf = parola.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("En az bir küçük harf içeriyor mu ?" +kucukHarf);
        boolean enaz1Rakam = parola.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("En az bir rakam içeriyor mu ?" +enaz1Rakam);

        System.out.println("------>> Şifre geçerli mi ? \n  ------>" + (enAzalti && buyukHarf && kucukHarf && enaz1Rakam));

    }
}
