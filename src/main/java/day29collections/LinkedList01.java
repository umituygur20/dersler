package day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();
        s.add("Nuriye");
        s.add("Orhan");
        s.add("Bunyamin");
        s.add("Saadet");
        s.add("Niyazi");
        s.add("Bilal");
        s.add("Abdullah");
        s.add("Nuriye");

//        s.remove(2); // bu şekilde 2 yazarsam 2.index'teki elemanı siler.
//
//        s.remove("Bilal"); // "Bilal" 'i bulur ve siler

//        s.removeFirstOccurrence("Nuriye"); // Nuriyenin ilk görünümündeki index'i bulur ve Nuriyeyi siler..
//        System.out.println(s);    [Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]
//
//        s.removeLastOccurrence("Nuriye");
//        System.out.println(s);    [Nuriye, Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah,]

        // linked list'ler note yazmaa ve silme ekleme işlemlerinde çok başarılılar


//Retreives = Alır gelir demek .

        //Retrieves and removes the head (first element) of this list.
        //Returns:
        //the head of this list, or null if this list is empty
        //Note: Peek() ile element () ikiside ilk elemanı alır silmeden verir.
        //ama peek() list bos oldugunda size null verir , element () ise Expception hatası verir .
        String r1 = s.peek(); // İlk node'u silmeden size verir ( Copy paste )
        System.out.println(r1); //Nuriye
        System.out.println(s);


        String p1 = s.poll();    //ilk Node'u  alır ve siler ...( cut paste )
        System.out.println(p1);
        System.out.println(s); //[Orhan, Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]


        //Retrieves and removes the head (first element) of this list.
        //Returns:
        //the head of this list, or null if this list is empty
//        Throws: NoSuchElementException – if this list is empty
        String e1 = s.element();
        System.out.println(e1);
        System.out.println(s);


        //poll () ile pop() ikiside ilk elemanı siler ve size verir . (Cut Paste)
        //ama poll list boş olduğunda size null verir . pop() ise hata verir.
        String p2 = s.pop();
        System.out.println(p2); //Orhan
        System.out.println(s);  //[Bunyamin, Saadet, Niyazi, Bilal, Abdullah, Nuriye]

    }
}
