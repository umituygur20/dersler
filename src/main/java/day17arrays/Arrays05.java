package day17arrays;

import javax.sound.midi.MidiSystem;
import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]
//
//        int[] a = {0, 2, 3, 0, 12, 0};
//        int[] b = new int[a.length]; // lenght diyerek diger indexin eleman sayısı kadar bir array oluşturduk .
//
//        int idx = 0;
//
//
//        for (int w : a) {
//            if (w != 0) {
//                b[idx] = w;
//                idx++;
//
//            }
//        }
//        System.out.println(Arrays.toString(b));// [2, 3, 12, 0, 0, 0]

//        Logic sudur


        int[] c = {7, 2, 3, 7, 12, 7,};
        int[] d = new int[c.length];

        int ixd = 0;
        int ixdSon = c.length-1;

        for (int w : c) {
            if (w!=7){
                d[ixd] =w;
                ixd++;
            }if (w==7){
                d[ixdSon] =w;
                ixdSon--;

            }


        }
        System.out.println(Arrays.toString(d));

    }
}
