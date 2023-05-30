package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

//Örnek 1 : Integer Array olusturun icine 6 tane eleman yerlestiriniz.
//   Bu elemanların en kücügü  ile en büyüğünün toplamini ekrana yazdiriniz.


        int[] ages = new int[6];

        ages[0] =20;
        ages[1] =37;
        ages[2] =16;
        ages[3] =44;
        ages[4] =13;
        ages[5] =9;

        System.out.println(Arrays.toString(ages));

        //1. Yol
//        sort () methodu Array'deki elemanlari kücükten büyüğe dizer .
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));//[20, 37, 16, 44, 13, 9]
                                                  //[9, 13, 16, 20, 37, 44] sort () yapilmis hali ..

        System.out.println(ages[0] + ages[ages.length-1]); //  9+44= 53 sonucu elde ediyoruz










//        2. Yol

       // Her defasında vermiş olduğum iki sayıdan minimum olanı verecek..  Math.min()

        int minimum= ages[0];
        int maximum = ages[0];
        for (int w:ages){
            minimum = Math.min(minimum,w);  //[20, 37, 16, 44, 13, 9]      --> Min =  9
            maximum = Math.max(maximum,w);  //[20, 37, 16, 44, 13, 9]      --> Max = 44
        }
        System.out.println(maximum+minimum);       // 53

        //Ayni sekilde Math.max() methoduda aynı mantik ile calisip max değeri verecek


//        Örnek 2 :String bir Array olusturunuz ve 6 eleman ekleyiniz , yellow'dan onceki elemanlari yazdiriniz

        String colors [] =new String[6];

        colors[0] ="Red";
        colors[1] ="Orange";
        colors[2] ="Blue";
        colors[3] ="Yellow";
        colors[4] ="Green";
        colors[5] ="Brown";

        System.out.println(Arrays.toString(colors));



        for (String w:colors){
            if (w.equals("Yellow")){    // ne zaman Yellow' a gelirsen break;
                break;
            }
            System.out.println(w);//Red , Orange , Blue




        }
    }
}