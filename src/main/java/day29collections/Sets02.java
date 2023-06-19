package day29collections;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
        //Örnek : Öğrenci email adreslerini natural ordera'a göre siralanmış olarak depolayınız .



        TreeSet<String> emails = new TreeSet<>();

        emails.add("z@gmail.com");
        emails.add("b@gmail.com");
        emails.add("k@gmail.com");
        emails.add("v@gmail.com");
        emails.add("h@gmail.com");
        emails.add("e@gmail.com");
        emails.add("a@gmail.com");
        emails.add("m2@gmail.com");
        long t1 = System.nanoTime();
        System.out.println(emails); //[a@gmail.com, b@gmail.com, e@gmail.com, h@gmail.com, k@gmail.com, m2@gmail.com, v@gmail.com, z@gmail.com]


//        2. yol

        HashSet<String> emailsHashSet = new HashSet<>();
        emailsHashSet.add("z@gmail.com");
        emailsHashSet.add("b@gmail.com");
        emailsHashSet.add("k@gmail.com");
        emailsHashSet.add("v@gmail.com");
        emailsHashSet.add("h@gmail.com");
        emailsHashSet.add("e@gmail.com");
        emailsHashSet.add("a@gmail.com");
        emailsHashSet.add("m2@gmail.com");
        long t2 = System.nanoTime();
        System.out.println(emailsHashSet); //[b@gmail.com, k@gmail.com, m2@gmail.com, v@gmail.com, h@gmail.com, e@gmail.com, z@gmail.com, a@gmail.com]



        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHashSet);
        System.out.println(emailsHsTs); //[a@gmail.com, b@gmail.com, e@gmail.com, h@gmail.com, k@gmail.com, m2@gmail.com, v@gmail.com, z@gmail.com]
        long t3 = System.nanoTime();

        System.out.println(t2-t1); //treeSet calısma hızı
        System.out.println(t3-t2); //HashSet calısma hızı
    }
}

