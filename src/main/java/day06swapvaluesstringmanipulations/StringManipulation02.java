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
        String sil = s.replace("e", "");
        System.out.println(sil); //Larn Java arn mony

        String t = "Ali 13 yasindadir";

        //Örnek 7 : "t" String'deki tüm rakamları "*" çeviriniz.
        //Note : Bir Grup datayı ifade etmek için "Regular Expressions" REGEX Kullanırız.
        //Note Bir Grup datayı değiştirmek için replaceAll() kullanılır .


        /*                  Meşhur Regex
        1) Tüm Rakamlar ==> [0-9]
        2) Tüm Küçük Harfler ==> [a-z]
        3) Tüm Büyük Harfler ==> [A-Z]
        4) Tüm Küçük ve Büyük Harfler ==> [a-zA-Z]
        5) Tüm Harfler ve Rakamlar ==> [a-zA-Z0-9]
        6) Tüm noktalama işaretleri ==> \\p{Punct}
        7) Tüm sesli Harfler ==> [aeiouAEIOU]
             x,q,w         ==> [xqw]
        8) Küçük Harflerden farkli Tüm karakterler ==> [^a-z]
        9) Tüm harflerden farkli tüm karakterler ==> [^a-zA-Z]


        -- Alternatif REGEX KODLARI
\\s     :space (boşluk)
\\S     :space dışındaki tüm karakterler (buyuk S harfi)
\\w     :harfler ve rakamlar (a-z,A-Z,0-9)
\\W     :harfler ve rakamlar dışındaki tüm karakterler (buyuk W harfi)
\\d     :digits (rakamlar 0-9)
\\D     :rakamlar dışındaki tüm karakterler




         */

        String degistir = t.replaceAll("[0-9]", "*");
        System.out.println(degistir); //Ali ** yasindadir

    }
}
