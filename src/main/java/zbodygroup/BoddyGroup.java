package zbodygroup;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BoddyGroup {
    public static void main(String[] args) {
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

        getUsersName();
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        words.add("elma");
        words.add("armut");
        words.add("kiraz");
        words.add("karpuz");
        words.add("seftali");
        words.add("elma");


        int randomIndex = random.nextInt(words.size());

        String randomWord = words.get(randomIndex);

       System.out.println("Kelime oyununa hoşgeldin");

        int lenghtOfWord = randomWord.length();

        ArrayList<String> emptyArray = new ArrayList<>();

        for (int i = 0; i < lenghtOfWord; i++) {

            emptyArray.add("_");
        }

        System.out.println(emptyArray);


        int chance = 5;

        System.out.println("Lütfen bir harf giriniz...");

        for (int i = 0; i < randomWord.length(); i++) {

            String tahmin = input.next().substring(0, 1);

            if (randomWord.contains(tahmin)) {
                System.out.println("Doğru tahmin !!");
                int idx = randomWord.indexOf(tahmin);
                int idxL= randomWord.lastIndexOf(tahmin);
                emptyArray.set(idx, tahmin);
                emptyArray.set(idxL, tahmin);
                System.out.println(emptyArray);



            }else {
                System.out.println("Yanlıs tahmin " + (chance-1) + " hakkınız kaldı.");
                i--;
                chance--;
            }
        }
    }


    public static void getUsersName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ismin Nedir ?");
        String userName = scanner.next();
        System.out.println("Merhaba " +userName);
    }
}


