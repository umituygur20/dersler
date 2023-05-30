package smallstudygroup;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BasitOyun {
    public static void main(String[] args) {
//        bir for loop oluşturmak için öncelikle for yazıp parantezi koyuyoruz.
//                ilk statement değişken ,
//        ikinci statement olarak bu loop'un hangi kosulda devam edeceğinin kriterini giriyoruz .
//                üçüncü olarak değişkenin nasıl değiştirileceğini giriyoruz.Increment * Decrement

//        for (int i = 0 ; i<5 ; i++){
//            System.out.println("Merhaba " + i);
//        }
//        System.out.println("---------------");
//
//        for ( int i = 5 ; i>0; i--){
//            System.out.println("Merhaba " + i);
//
//        }

        //While loop'u bir döngünün ne zaman biteceğini bilmediğimizde kullanıyoruz.

// while loop örneği
//main method //

        final String GAME_NUMBER = "Sayi tahmini";
        System.out.println(GAME_NUMBER + "oyuna hosgeldin! Oyunu baslatmak istiyor musun ? (Evet / Hayır)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.trim().equalsIgnoreCase("evet")) {

            startGame();
        } else {
            sayGoodbye();
        }
    }

    public static void startGame() {
        getUsersName();
        getGuesses();
        sayGoodbye();
    }


    public static void getUsersName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ismin Nedir ?");
        String userName = scanner.next();
        System.out.println("Merhaba " + firstLetterUpperCase(userName));
    }

    public static void getGuesses() {
        int secretNumber = 1 + (int) (Math.random() * 10);
        int[] guesses = new int[20]; // tahminler dizisi diyebiliriz

        System.out.println("Tahmininiz Nedir ? ");
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int guessCount = 0;
        while (guess != secretNumber) {

            guess = scanner.nextInt();
            printGuessResult(secretNumber, guess);

            guesses[guessCount] = guess;
            guessCount++;

        }


        System.out.println("Gizli Numara : " + secretNumber + "Tahminlerin: " + Arrays.toString(guesses));
    }

    public static void printGuessResult(int secretNumber, int guess) {

        if (secretNumber > guess) {
            System.out.println("Yukari");
        } else if (secretNumber < guess) {
            System.out.println("Asagi");
        } else {
            System.out.println("Bildin Tebrikler!");
        }
    }

    public static String firstLetterUpperCase(String value) {

        return value.substring(0, 1).toUpperCase() + value.substring(1, value.length());
    }

    public static void sayGoodbye() {
        System.out.println("Sonra gorusuruz ! ");
    }
}
