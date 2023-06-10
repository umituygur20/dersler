package interview;

import java.util.Scanner;

public class MergeCertain {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         *
         *
         * Ornek:  input             output
         *         elma  2           eaea
         *         army  3           ayayay
         *
         */


        Scanner input = new Scanner(System.in);
        System.out.println("tekrar sayisi");
        int sayi = input.nextInt();
        System.out.println("Kelime nedir ?");
        String kelime = input.next();
        for (int i = 0; i < sayi; i++) {

            String ilkHarf = kelime.substring(0, 1);
            System.out.print        (ilkHarf);
            String sonHarf = kelime.substring(kelime.length()-1);
            System.out.print(sonHarf);

        }


    }
}
