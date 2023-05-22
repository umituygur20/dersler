package day13loops;

public class Loops3 {
    public static void main(String[] args) {

        //Örnek 1 : Verilen bir String'dde kucuk harfleri console'a YAZMAYINIZ.
        // "Pwd12?Ab  ==> P12?A


        String s = "Pwd12?Ab";
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                continue;
            }
            System.out.print(ch);


        }


    }
}
