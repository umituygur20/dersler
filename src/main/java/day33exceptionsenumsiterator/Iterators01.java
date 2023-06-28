package day33exceptionsenumsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {

        /**
         1) Iterator'lar looplarin yaptığı ayni işi yapar.
         2) Iterator'larda sonsuz loop olusma ihtimali yoktur.
         3) Iterator'lar ile looplar arasında performans farkı yoktur.
         4) Iteratorlar bir Collection'dan eleman silme ve bir Collection'daki elemanı
         değiştirme konusunda daha başarılıdır.
         5) İKİ TİP ITERATOR VAR ;
         a) Iterator : Bu sadece eleman silmede kullanılır.
         Eleman ekleme veya Elemanı değiştirmek mümkün değildir.
         b)ListIterator : Bu eleman silebilir , ekleyebilir ve değiştirebilir .

         NOTE: Iterator sadece soldan sağa (ilk elemandan son elemana çalışır.
         ListIterator ise iki yönlü soldan sağa / sağdan sola çalışabilir.
         */

        List<String> myList = new ArrayList<>();
        myList.add("Niyazi");
        myList.add("Saadet");
        myList.add("Fevzi");
        myList.add("Suat");
        myList.add("Mustafa");
        System.out.println(myList); //[Niyazi, Saadet, Fevzi, Suat, Mustafa]

        //normal iterator
        Iterator<String> myIterator = myList.iterator();//[Niyazi, Saadet, Fevzi, Suat, Mustafa]


        while (myIterator.hasNext()) { //hasNext--> pointer'a senden sonra eleman var mı ? diye sorar .
            //Eleman varsa true yoksa false return eder.

            // String el = myIterator.next();
            // if (el.equals("Niyazi")) {
            // iterator ile specific bir eleman nasıl silinir sorusunun cevabının içindesin .!

            // }
            myIterator.next(); // Increment etti .--> next methodu pointeri bir sonraki elemanın önüne taşır ve üstünden atladığı elemanı return eder.

            myIterator.remove(); //(return ettiği )-> en son üstünden atladığı elemanı siler.next methodunun return ettiği değeri siler.

            System.out.println(myList); //herşeyi sildi gitti.


        }

        List<String> yourList = new ArrayList<>();
        yourList.add("Niyazi");
        yourList.add("Saadet");
        yourList.add("Fevzi");
        System.out.println(yourList); // Niyazi , Saadet , Fevzi

        //listIterator
        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()) { //true false verir ona göre loopa girer.

            String el = yourListItr.next(); // yourList'e git . buradan aldığını el sepetine koy.

            yourListItr.set(el + "*"); // set ile update edebiliriz

        }
        System.out.println(yourList);//[Niyazi*, Saadet*, Fevzi*]


        //listIterator previous method kullanımı
        List<String> list3 = new ArrayList<>();
        list3.add("Niyazi");
        list3.add("Saadet");
        list3.add("Fevzi");
        System.out.println(list3); //Niyazi , Saadet , Fevzi

        ListIterator<String> listItr = list3.listIterator();//[Niyazi, Saadet, Fevzi]

        while (listItr.hasNext()) {

             listItr.next();//pointer'i sona aldık. gönder göndeeer.
        }

        while   (listItr.hasPrevious()){//pointer'a gelir senden önce eleman var mıdır ? der ..
            String el = listItr.previous();//next ne yapıyorsa tam tersini yapar. sağdan sola ... el sepetine koyduk
            System.out.println(el+"<==");


        }

    }
}
