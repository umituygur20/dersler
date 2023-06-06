package day21arraylists;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {


        //Bir listin baska bir list ile ayni olup olmadigini nasil kontrol ederiz ?


        //İki listin esit olmasi icin ayni indexte ayni elemanlar olmadilir.
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s); // false.....


        //Ornek : Verilen iki integer listte tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz.

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(8);
        num1.add(10);
        num1.add(9);


        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(8);
        num2.add(9);
        num2.add(10);

        Collections.sort(num1);      //  sort methodu ile num1 ve num2 kücükten büyüge dogru dizildi
        Collections.sort(num2);      //     ""

        boolean esitMi = num1.equals(num2);
        System.out.println(esitMi);   //  true


        //Arraylistte bir elemanin ilk görünümü nasil silinir ?

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgart");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgart");

        System.out.println(cities); //[Miami, Istanbul, Yozgart, Barcelona, Miami, Istanbul, Istanbul, Yozgart]
//remove() methodu bir elemanin ilk görünümünü siler.
        cities.remove("Miami");      //  [Istanbul, Yozgart, Barcelona, Miami, Istanbul, Istanbul, Yozgart]
        System.out.println(cities);
        System.out.println(cities.remove("Miami")); // true - sildim -yaptım diyor.


        //Arraylistte bir eleman index kullanarak nasil silinir ?
        System.out.println(cities.remove(2)); // index to String methodu ---> 2.indexte Barcelona vardi onu sildim diyor ve String olarak döndürüyor .
        System.out.println(cities);


        //remove() methodu eleman ile kullanılırsa ilk görünümünü siler ve o elemani silip silmedigini ifade eden true yada false return eder.
        //-boolean ..

        //remove () methodu index ile kullanilirsa bu indexte silmis oldugu datayi return eder.- String ..


        //Ornek : Bir Integer list olusturun ve 12 elemanini siliniz .

        //Arraylist olustururken sag tarafa (Constructor) Arraylist yazmak zorundasiniz.
        //Ama sol tarafa ister ArrayList yazin isterseniz List yazin ikiside calisir ..
        //Detaylari "Collections" konusunda gorecegiz.
        List<Integer> sayi = new ArrayList<>();

        sayi.add(23);
        sayi.add(12);
        sayi.add(7);
        sayi.add(4);


//     sayi.remove(12);
//        System.out.println(sayi);      bu sekilde 12 yi silemedik ..


        //1 yol.
//        Integer nonPrimitive =12; // bir variable olusturduk Wrapper classtan ve remove ettik.
//        sayi.remove(nonPrimitive);
//        System.out.println(sayi);


        // 2.yol  Recommended.. tavsiye edilir ...
        sayi.remove((Integer) 12);
        System.out.println(sayi);     // -- Auto boxing yaptik..


//        //3.yol
//        sayi.remove(Integer.valueOf(12)); // sayiyi integer yaptık ve remove ettik.
//        System.out.println(sayi );


        //4. yol       indexOf ile sayinin index'ini alip onu remove ettik.
//        sayi.remove(sayi.indexOf(12));
//        System.out.println(sayi);









        //Bir Arraylistteki bir elemanin tum gorunumlerini nasil sileriz ?
        //bir listteki bir elemanin tüm görünümlerini removeAll() ile silebiliriz ama removeAll() methodu list ile kullanılır .
        List<String> citiesToRemove = new ArrayList<>() ;

        citiesToRemove.add("Istanbul");
        citiesToRemove.add("Yozgat");

        cities.removeAll(citiesToRemove);
        System.out.println(cities);


    }
}
