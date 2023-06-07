package questionbank;

import java.util.Random;
import java.util.Scanner;

public class AdvancedJavaPracticeHw {


//2. ÖDEV

    /*
    Kelime Tahmin Oyunu
    Kullanıcının bir kelimeyi harf harf tahmin ederek doğru kelimeyi bulmasını sağlayan bir oyun geliştirin.
    Oyun şu adımları içermelidir:

    - Bir kelime listesi tanımlayın. Bu listede en az 5 farklı kelime bulunsun.
    - Oyuncu, listeden rastgele seçilen bir kelimeyi tahmin etmeye çalışmalıdır.
    - Oyuncuya, seçilen kelimenin uzunluğu kadar alt tire "_" işaretinden  oluşan bir dizi gösterilmelidir.
      Örneğin, seçilen kelime "elma" ise "____" şeklinde bir gösterim yapılmalıdır.
    - Oyuncu, her tahmininde bir harf girmelidir.
        - Girdiği harf, seçilen kelimede bulunuyorsa, doğru tahmin olduğu belirtilmeli ve
          ilgili harf yerine konulmalıdır.
        - Oyuncu, yanlış tahminlerde bulunduğunda, kalan hakkı azalmalıdır.
          Başlangıçta oyuncunun 5 hakka sahip olduğu varsayılmalıdır.
    - Oyuncunun doğru kelimeyi bulması durumunda, tebrik mesajı gösterilmeli ve oyun sonlandırılmalıdır.
    - Oyuncunun kalan hakları sıfır olduğunda, olumsuz bir mesaj ve doğru kelime gösterilmelidir.
 */
    public static void main(String[] args) {
            /*
        Amaç:
        Oyuncudan 1 ile 100 arasında bir sayı tahmini alarak rastgele bir sayıyı bulmaya çalışması istenir.
        Oyuncuya her tahminde doğru sayıya yaklaşıp yaklaşmadığına dair ipuçları verilir ve oyuncuya 10 tahmin hakkı tanınır.

        Yönergeler:
        - Oyuncuya "1-100 arası bir sayı tahmini giriniz" mesajı gösterilir.
        - Oyuncu bir sayı girişi yapar.
        - Oyuncunun tahmini, rastgele seçilen sayıya göre kontrol edilir:
            - Tahmin doğru ise, "Tebrikler, X. tahminde sayıyı buldunuz!" mesajı gösterilir.
              Ardından oyuncunun puanı hesaplanır ve "Puanınız: X" mesajı gösterilir ve
              "Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın." mesajı gösterilir.
            - Tahmin, sayıdan küçük ise, "Bilemediniz, tahmin için X hakkınız kaldı! Daha büyük bir sayı giriniz:" mesajı gösterilir.
            - Tahmin, sayıdan büyük ise, "Bilemediniz, tahmin için X hakkınız kaldı! Daha küçük bir sayı giriniz:" mesajı gösterilir.
            - Oyuncuya 10 tahmin hakkı verilir. Oyuncu 10 tahmin hakkını da kullanırsa,
              "Hakkınız bitti, oyunu kaybettiniz. Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın."
              mesajı gösterilir.
            - Oyuncu 1'e basarsa, oyun yeniden başlatılır ve yeni bir rastgele sayı seçilir.
            - Oyuncu herhangi bir sayıya basarsa, oyun sona erer ve program sonlanır.
     */
        Scanner scan = new Scanner(System.in);

        System.out.println("1 ile 100 arasinda bir sayi giriniz.");
        Random rnd = new Random();

        int secretNumber [] = new int[100];

        int guesses [] = new int [10];

        int guess = scan.nextInt();


    }
}
