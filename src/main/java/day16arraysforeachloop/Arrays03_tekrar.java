package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03_tekrar {
    public static void main(String[] args) {

        //Örnek 1 : Integer bir array oluşturunuz, içine 6 tane eleman yerleştiriniz.Bu elemanların en küçüğü ile en büyüğünün toplamnını ekrana yazdiriniz.,

        int[] ages = new int[5];

        ages[0] = 20;
        ages[1] = 33;
        ages[2] = 4;
        ages[3] = 66;
        ages[4] = 31;

        //  1 . yol bu işlemi sort ile yapabilirim. sort() methodu arraydeki elemanları küçükten büyük olana doğru dizer.
        //  Arrays.sort(ages);
        //  System.out.println(Arrays.toString(ages));
        //  sıralama yaptıktan sonra en küçük index 0'inci index ve en sonra index lenght-1 bunları toplayarak yapabiliyorum.
        //  System.out.println(ages[0] + ages[ages.length - 1]);


        //2. yol
        //Math.min methodunu kullanarak her iterationda en küçüğünü bularak min sepetine koyacak.
        int minimum = ages[0];
        for (int w : ages) {
       minimum=  Math.min(minimum,w); // min methoduna ilk indexi verdik. ilk index'i alacak  w ile gezecek en küçüğü bulacak.

        }
        System.out.println(minimum);




        //Örnek :String bir array oluşturunuz 6 eleman ekleyiniz. yellowdan önceki elemanları yazdırınız.

        String [] color = new String[6];

        color[0] = "Red";
        color[1] = "Green";
        color[2] = "Blue";
        color[3] = "Black";
        color[4] = "Yellow";
        color[5] = "Purple";

        for (String w :
                color) {

            if (w.equals("Yellow")){ // ne zamanki "Yellow" görürsün, break, dur!, Atla!, oraya kadar olanı yazdırır.
                break;
            }
            System.out.println(w);
        }













    }
}
