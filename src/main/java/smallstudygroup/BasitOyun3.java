package smallstudygroup;

import java.util.Scanner;

public class BasitOyun3 {
    public static void main(String[] args) {
        //ayni kodu tekrar etmek için loopları kullanıyoruz .

        // 3 hak verdiğimiz durumda for loop kullanmak daha mantıklı
//        for (int i = 0; i <=3; i++) {
//            System.out.println("Merhabaa dünyalı");
//        }

        //while loopları bir döngünün ne zaman biteceğini bilmediğmizde kullanırız .

        // loop condition sağlandığında loop'  bitsin istiyorsam while kullanırım .
        System.out.println("Sayi tahmini oyununa hoşgeldin.");

        getUserName();

        getGuesses();

        sayGoodBye();


    }//main



    public static void getGuesses() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1 ila 20 arasında tahmin etmek istediğiniz sayıyı giriniz.");
        int randomNumber = (int) (Math.random() * 20) + 1;

        int guess = 0;

        while (guess != randomNumber) {

            guess = input.nextInt();

            printGuessResult(guess, randomNumber);

        }

    }

    public static void printGuessResult(int guess, int randomNumber) {
        if (randomNumber > guess) {
            System.out.println("Yukarı");
        } else if (randomNumber < guess) {
            System.out.println("Asagi");
        } else {
            System.out.println("*******  Tebrikler bildiniz  ******");
        }

    }

    public static void getUserName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz.");
        String userName = input.next();
        System.out.println("Merhaba " + firstLetterUpperCase(userName));

    }

    public static String firstLetterUpperCase(String value) {
        return value.substring(0, 1).toUpperCase() + value.substring(1);

    }

    public static void sayGoodBye() {
        System.out.println("Sonra görüşürüz.");
    }



//    public static void guessNumbers(int... guesses) {
//
//        for (int guess : guesses) {
//            // Tahmin edilen sayıyı burada işleyebilirsin
//            System.out.println("Tahmin edilen sayı: " + guess);
//        }





}
