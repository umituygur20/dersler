package smallstudygroup;

import java.util.Scanner;

public class BasitOyun2 {
    public static void main(String[] args) {
        startGame();
        getGuesses();
        //ayni kodu tekrar etmek için loopları kullanıyoruz .

        //while loopları bir döngünün ne zaman biteceğini bilmediğmizde kullanırız .

        // 3 hak verdiğimiz durumda for loop kullanmak daha mantıklı

        // bizim istediğimiz ne zaman biteceği yada can vermek değil
        // loop condition koşulu tamamlandığında kırılsın istiyoruz.


    }//main Method

    public static void getGuesses() {


        Scanner input = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 5) + 1;                                              // int Auto Widening yaptık .        //        Math.random() yöntemi, 0 (dahil) ile 1 (hariç) arasında rasgele bir ondalık sayı üretir.
        System.out.println("1 ila 40 arasında bir sayı giriniz . Tahmininiz nedir ? ");

        int guess = 0;
        while (guess != randomNumber) {

            guess = input.nextInt();

            printGuessResult(guess, randomNumber);


        }

    }

    public static void printGuessResult(int guess, int randomNumber) {
        if (randomNumber > guess) {
            System.out.println(" YUKARI ");

        } else if (randomNumber < guess) {

            System.out.println("AŞAĞI");
        } else {
            System.out.println("****** TEBRİKLER BİLDİNİZ ******** \n" + "RANDOM NUMBER = " + randomNumber);
        }
    }


    public static void getUserName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz.");
        String userName = input.next();
        System.out.println("Merhaba " + firstLetterUpperCase(userName));

    }

    public static String firstLetterUpperCase(String userName) {

        return userName.substring(0, 1).toUpperCase() + userName.substring(1);

    }

    public static void startGame() {
        System.out.println("Sayi tahmini oyununa hoşgeldin ! Oyunu başlatalım mı ? \n (Evet / Hayır) ");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        if (answer.trim().equalsIgnoreCase("evet")) {
            getUserName();
        } else {
            sayGoodBye();


        }

    }

    public static void sayGoodBye() {
        System.out.println("Sonra görüşürüz.Çok oyun oynama boşver.");
    }

    public static void gameOver() {
        System.out.println("8 canın vardi hepsini kullandın ! ");

    }

}//main Class


//        int count =5;
//        for (int i = 0; i < count; i++) {
//            int randomNumber = (int) (Math.random()* 20) +1;  // 0 vermesin diye +1 yapıyoruz
//            System.out.println(randomNumber);
//        }

//        int count = 20;
//
//        for (int i = 0; i < count; i++) {
//            int randomNum = (int) (Math.random() * 100) + 1;
//            System.out.println(randomNum);
//        }
