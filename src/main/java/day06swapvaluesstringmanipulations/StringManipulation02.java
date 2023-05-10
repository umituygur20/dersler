package day06swapvaluesstringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {
        //
        String s = "Learn Java earn money";
        //Örnek 1 : "s" String'de "money" ile bitip bitmediğini kontrol edin

        boolean isMoney = s.endsWith("money");
        System.out.println(isMoney);

        //Örnek 2 : "s" String'de "money" kelimesini "dollar" kelimesine çeviriniz.

        String s1 = s.replace("money", "dollar");//replace yerine koy demek .
        System.out.println(s1); //Learn Java earn dollar


        //Örnek 3 : "s" String'de "earn" kelimesini "win" kelimesine çeviriniz.

        String s2 = s.replace("earn", "win");
        System.out.println(s2); //Lwin Java win money

        //Örnek 4 "s" String'deki "a" karakterini "*" olarak değiştiriniz .

        String yildiz = s.replace('a', '*');
        System.out.println(yildiz);//Le*rn J*v* e*rn money

        ////////////// TEK TIRNAK DA ÇİFT TIRNAK DA KULLANILIR. İKİSİDE AYNI OLACAK AMMAAA!.
        String yildiz1 = s.replace("a", "*");
        System.out.println(yildiz1);//Le*rn J*v* e*rn money


        //Örnek 5 : "s" String'deki tüm "n" karakterlerini "xxx"  olarak değiştiriniz.

        //3 karakter olduğu için tek tırnak içine koyamayız !! DİKKAT !!

        String n = s.replace("n", "xxx");
        System.out.println(n);   //Learxxx Java earxxx moxxxey

        // Örnek :6 "s" String'deki "e" karakterlerini siliniz .
       String sil= s.replace("e","");
        System.out.println(sil);



    }
}
