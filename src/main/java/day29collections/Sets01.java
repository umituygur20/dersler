package day29collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {

/**
 *  +++set'ler tekrarsız elemanları depolamayı sağlar .ID e-mail depolayacaksanız set tabağına koymanız lazım.
 *
 *  +++  ArrayList kullanırsak bozulur mu hocam =? bozulmaz kocaman tencereye 2 tane meyve koymuş olursunuz.:D

 Nasil ki çay karıştırmak için çay kaşığı yemek yemek için yemek kaşığı ayni mantık ..

 ne zamanki tekrarsız uniq datalarla çalışacaksaanız  set sepetine koyacaksınız .

 -------------------
 3 TANE SET VARDIR .
 Hashset  Class : ---> setlerin en hızlısı (speedyGonzales) ...
 a) HashSet Class:
 "Hash" benzersiz bir id olusturma teknigidir. Bu teknige "Hashing Technique" denir
 "HashSet" elemanlari rastgele siralar
 "HashSet" elemanlari siralamadigindan cok hizli calisirlar
 "HashSet"ler "null" i eleman olarak kabul ederler
 "HashSet"ler tekrarsiz eleman depolamak icindir

 LinkedHashSet  ----> insertion (Ekleme sırasına göre diziyor . çaba var . sıraya koyacak o yüzden yavaş.
 "LinkedHasSet" ler elemanlari sizin verdiginiz siraya gore dizdiklerinden (insertion order) "HashSet"lere gore yavastirlar
 "LinkedHasSet"ler tekrarsiz eleman depolamak icindir


 TreeSet        ---->Natural Order'a göre diziyor .Alphabetik ve Numeric . işte bu yüzden çok yavaş.
 TreeSet ler elemanlari natural order (kucukten buyuge yada alfabetik sira) a gore dizerler
 TreeSet ler elemanlari natural order a gore dizdiklerinden cok yavastirlar.
 En yavas set "TreeSet" tir

 3)TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisir
 */


        HashSet<String> hs = new HashSet<>();
        hs.add("Gulce");
        hs.add("Seda");
        hs.add("Omer");
        hs.add("Hasan");
        hs.add("Benna");
        System.out.println(hs); //[Hasan, Seda, Omer, Gulce, Benna]

        hs.add("Seda");          //      Tekrarli eleman eklediğinizde hata vernez ama tekrarli elemanı sadece bir kere ekler. .
        hs.add(null);            //      Tekrarlı null kabul etmez sadece 1 tanesini alır .
        hs.add(null);            //       [null, Hasan, Seda, Omer, Gulce, Benna]
        System.out.println(hs); //[Hasan, Seda, Omer, Gulce, Benna]

        System.out.println(hs.hashCode()); //207764255

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(19);
        lhs.add(13);
        lhs.add(-33);
        lhs.add(312);
        System.out.println(lhs);    //[19, 13, -33, 312] girilen sıraya göre ekledi .
        lhs.add(null);
        lhs.add(null);   // Boşta olsa eleman elemandır diyip koymadı . Çünkü sadece tekrarsızları depolar.
        System.out.println(lhs);  //[19, 13, -33, 312, null] null kabul etti ve ekledğimiz yere koydu .


        LinkedHashSet<Integer> ls = new LinkedHashSet<>();  // ikinci linkedhashset .
        ls.add(19);
        ls.add(13);
        ls.add(313);
        ls.add(45);


        lhs.retainAll(ls);  //retainAll bize kesişimi verdi .lhs returnALl ls dediğimiz zaman ortak elemanlarını lhs sepetinin içinde verdi.
        // ls ye dokunmadı DİKKAT!!.  lhs'yi siler yerine kesişimindekileri koyar . .
        System.out.println(lhs); //[19, 13]  / kesişim elemanlarını döndürdü .
        System.out.println(ls);  //[19, 13, 313, 45]


        TreeSet<Character> ts = new TreeSet<>();  //elemanları natural order'a göre ve tekrarsız olarak oluşacak bir kap oluşturduk .

        ts.add('E');
        ts.add('G');
        ts.add('B');
        ts.add('A');
        ts.add('L');
        ts.add('Y');
        ts.add('E');
        //ts.add(null) ==> TreeSetlerde null eklenemez
        System.out.println(ts);  //[A, B, E, G, L, Y]  alfabetik sıraya göre dizdi ve 2. elemanı almaz çünkü UNIQ!

        System.out.println(ts.first()); //A
        System.out.println(ts.last()); //Y

        System.out.println(ts.lower('E')); //B ==> Verilen eleman olan 'E' den bir önceki elemanı verir.
        System.out.println(ts.lower('F')); //E ==> Verilen eleman olan 'F' olmadığı için olsaydi nerede olurduyu bulup ondan bir öncekini verdi.
        System.out.println(ts.lower('A')); // null verir

        System.out.println(ts.higher('B')); //E ==>Verilen eleman olan 'B' den sonraki elemanı verir.
        System.out.println(ts.higher('F')); //G ==>Verilen eleman olan 'F' den sonraki elemanı verir.


        System.out.println(ts.headSet('E')); //[A, B]   // 'E' girilen karaktere kadar olanki elemanları verir.
        System.out.println(ts.headSet('E', true)); // [A, B, E]     //  'E' edahil verilen elemanı true dedik orayıda verdi.

        System.out.println(ts.tailSet('E')); //[E, G, L, Y]   'E' dahil olmak üzere kalan kuyruk kısmını verdi. .
        System.out.println(ts.tailSet('E',false)); //[E, G, L, Y]   'E' yi istemiyorsak hariç yapmak için false diyoruz . //inclusive dahil demek.

    //ceiling tavan demek --- floor zemin demek
        System.out.println(ts.ceiling('G')); //G => Eğer eleman set'in içinde varsa elemanın kendinisi verir.
        System.out.println(ts.ceiling('F')); //G verdi olsaydı nerede olurduyu buluyor ?  => Eğer eleman set'in içinde yoksa bir sonraki elemanı return eder.

        System.out.println(ts.floor('B')); //B ==> Eleman set içinde varsa elemanın kendisini verir.
        System.out.println(ts.floor('C')); //B ==> Eleman set içinde yoksa önceki elemani return eder .

        System.out.println(ts.subSet('E', 'L'));  // [E, G]  // 0'index dahil 1 hariç substring mantığı
        System.out.println(ts.subSet('E', false,'L',true));  //[G, L]









     /*
    Set :1) unique(benzersiz tek) elemanlardan olusur, Set'lerin icinde bir eleman sadece bir kere kullanilabilir. mükerrer(duplicate) eleman olmaz.
         2) sadece bir null değeri alabilir.(treeSet hariç).Java elementleri unique yapmak icin HASH ALGORITMASI kullanir.
              Java her data icin hashing teknigini kullanarak bir code uretir.Bu code'u almak icin HashCode() methodu kullanilir.
              Hashing, farklı büyüklükteki girdilerden sabit büyüklükte bir çıktı oluşturma sürecine verilen isimdir.
              Universitelerdeki ogrenci numaralari gibi bir ogrenci ismi soruldugunda numarasini bulursaniz onunla ilgili tum datalara ulasilabilir.


  Set --> HashSet      : 1) HashSet, duplication’a(tekrarlı eleman) izin vermez.
                           Eger bir elemani tekrar HashSet’e eklemek isterseniz eski olan silinip, yeni olan uzerine yazilir.
                         2) Haset'ler Set'ler arasinda en hizli olanıdir. bir algoritmaya göre kayit eder.
                          değerlerin giriş sırasına dikkat edilmez. (LinkedHashSet hariç)
                         3) HashSet "null" object'ini eleman olarak kullanabilir.
                         Ancak birden fazla null degerini bir HashSet’e eklemek isterseniz sadece bir tane null degeri
          LinkedHashset: 1) Tekrarli eleman kabul etmezler. Elemanlari ekleme sirasina(insertion order) gore dizerler.
                         2) LinkedHashSet, HashSet'den daha yavas calisir.
                         3) LinkedHashSet "null" object'ini eleman olarak kullanabilir.
                         4) Ekleme ve remove islemlerinde hizlid
          TreeSet      : 1) TreeSet tekrarli eleman kabul etmez, cunku Set'dir.
                         2) Elemanlari natural Order'a(String ise alfabetik, sayi ise kucukten buyuge) gore dizer.
                          3) TreeSet, setlerin en yavasidir. Bu yuzden TreeSet kullanirken dikkatli olunmalı...
                          4)AHAN DA TRİCK :TreeSet "null" object'ini eleman olarak kullanamaz . eklenemez.
        Set Methods :
           .add(eleman);-->Set’e eleman ekler
           .addAll(collection);-->istenen collection’in tum elemanlarini ekler
           .contains(eleman);-->istenen eleman set’te varsa true, yoksa false return eder.
           .containsAll(collection);-->istenen collection’in tumu aranan sette var ise true, yoksa false return eder.
           .remove(eleman);-->istenen eleman bulursa siler ve true dondurur, bulamazsa false return eder.
           .removeAll(collection);-->istenen collection’in tum elemanlarini bulursa siler ve true dondurur, bulamazsa false return eder.
           .equals(set2);-->istenen set2’le tum elemanlar ayni ise true, yoksa false return eder.
           .retainAll(collection1);-->collection1’nin elemanlarinin disindaki tum elemanlari siler, silme islemi yapti ise true, yoksa false return eder.
             (kesişen ortak elemanları döndürür.)
           .clear();-->sett'teki Tum elemanlari siler
           .isEmpty();-->Sette hic eleman yoksa true, varsa false return eder
           .size();-->set’in eleman sayisini verir

    */

    }
}
