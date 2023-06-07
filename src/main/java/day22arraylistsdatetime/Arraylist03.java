package day22arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist03 {
    public static void main(String[] args) {
        /*
        Example 1 : kullanicinin girddigi harf list'de var ise harfi "Buldum" 'a cevirin , yok ise o harfi list'e ekleyin.
         */


        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");

        Scanner input = new Scanner(System.in);


        int counter = 0;
        int live = 3;
        do {
            if (counter == live) {
                break;
            }
            System.out.println("Lütfen bir harf  gir");

            String letter = input.next().substring(0, 1).toUpperCase();


            if (myList.contains(letter)) {                            //Kullanicinin girdigi harf list'te var ise . .
                myList.set(myList.indexOf(letter), "Buldum!");       //mylist.indexof letter index'ini bulmamiza yarar.
            } else {
                myList.add(letter);
            }
            System.out.println(myList);
            counter++;
        } while (true);
        System.out.println("Canın bitti :D");

    }
}
