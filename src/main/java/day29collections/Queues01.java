package day29collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static <Queues> void main(String[] args) {

        Queue<String> depo = new LinkedList<>();
        depo.add("Milk");
        depo.add("Meat");
        depo.add("Egg");
        depo.add("Cheese");

        System.out.println(depo); // [Milk, Meat, Egg, Cheese]

        depo.remove();  // ilk elemanı siler .

        System.out.println(depo); /// [Meat, Egg, Cheese]

        System.out.println(depo.peek()); // ilk elemanı kopyalar silmeden  getirir    //Meat

        System.out.println(depo.element());  //Meat  // depo boş olursa hata verir element()  //

        System.out.println(depo.poll()); //cut paste yapar 1. elemanı alır sıradan siler. // Meat
        System.out.println(depo);  // [Egg, Cheese]

        depo.clear(); // depo tertemiz .
        System.out.println(depo.poll()); // null gelir . poll boş collection için bize null verir.


//        System.out.println(depo.remove());  //Exception
//        System.out.println(depo.element());  //Exception
//        System.out.println(depo.peek()); // null
    }
}
