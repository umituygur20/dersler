package day17arrays;

import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Arrays03_Tekrar {
    public static void main(String[] args) {
        //Specific bir elemanın Array'de olup olmadığını anlamak için gereken kodu yazınız.
        String[] names = {"K", "C", "R", "A", "S"};
        //LOGİC ŞU   ve 1.yol
        String el = "R";

        int counter = 0;

        for (String w : names) {
            if (w.equals(el)) {
                counter++;
                break;
            }
        }
        if (counter > 0) {
            System.out.println("Array has " + el);
        } else {
            System.out.println("Array does not have " + el);
        }

        //2.yol binarySearch() methodu

        Arrays.sort(names);
        System.out.println(Arrays.binarySearch(names, el));


    }
}
