package smallstudygroup;


import java.util.Scanner;


public class BasitOyun {
    public static void main(String[] args) {


         final String GAME_NUMBER = "Sayi tahmini ";
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
        restartGame();
    }

    public static void getUsersName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ismin Nedir ?");
        String userName = scanner.next();
        System.out.println("Merhaba " + firstLetterUpperCase(userName));
    }

    public static void getGuesses() {
        int secretNumber = 1 + (int) (Math.random() * 20);


        System.out.println("Tahmininiz Nedir ? ");
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
//        StringBuilder tahmin = new StringBuilder();
//        int guessCount = 0;
//        int[] guesses = new int[guessCount]; // tahminler dizisi diyebiliriz
        while (guess != secretNumber) {

            guess = scanner.nextInt();

            printGuessResult(secretNumber, guess);
//            tahmin.append(guess);
//            guesses[guessCount] = guess;

//            guessCount++;

        }



//        System.out.println("Gizli Numara : " + secretNumber + "Tahminlerin: " + Arrays.toString(guesses));
    }

    public static void printGuessResult(int secretNumber, int guess) {

        if (secretNumber > guess) {
            System.out.println("Yukari");
        } else if (secretNumber < guess) {
            System.out.println("Asagi");
        } else {
            System.out.println("**********   Bildin Tebrikler   ********!");
        }
    }

    public static String firstLetterUpperCase(String value) {

        return value.substring(0, 1).toUpperCase() + value.substring(1);
    }

    public static void sayGoodbye() {

        System.out.println("Sonra gorusuruz ! ");


    }
//Her class'ın default constructor'ı vardir.

    public static void restartGame(){
        System.out.println("Tekrar oynamak ister misiniz ? ");
        startGame();
    }

}
