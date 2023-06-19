package day29collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {


        Queue<String> line = new PriorityQueue<>(); // Priority clas'ında Queue objesi ürettim .

        line.add("Milk");
        line.add("Bread");
        line.add("Apple");
        line.add("Milk");
        line.add("Orange");
        line.add("Egg");
        line.add("Meat");
        line.add("Tomatoes");

        System.out.println(line); //[Apple, Milk, Bread, Milk, Orange, Egg, Meat, Tomatoes]
/**
        "Queue" bir Interface'dir .Bu yüzden Constructor'i yoktur.
            Dolayısı ilze Object Oluştururken new keyword'ünden sonra "Queue" kullanılamaz.
            Data Type'ı "Queue" olan bir Object oluşturmak için new keyword'ünden sonra
            1) LinkedList veya  2) PriorityQueue Classları kullanılabilir.

    "Queue" oluştururken constructor olarak PriorityQueue kullanırsanız elemanları kendi belirleyeceğiniz
    Kurala göre sıralama hakkınız olur .

 */


    }
}
