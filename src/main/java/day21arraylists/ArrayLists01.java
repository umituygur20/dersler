package day21arraylists;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {
//Ayni data type'indaki coklu dataları depolamak için Array kullanırız..
//  ----- Array^lerin negatif bir yönü var, icine koyacağınız eleman sayisini en basta belirlemek zorundaydık.
//  Array'ler eleman sayisinda esnek değildirler . Bu yüzden java "ArrayList" adli yeni bir yapı olusturdu.
//bu yapi eleman sayisinda esnek(flexibel)'dir.Hic eleman koymazsaniz eleman sayisini 0 olarak ayarlar.
        // 1000 eleman koyarsaniz eleman sayisini 1000 olarak ayarlar. koyacağımız kalıba göre şekil alıyor

//Array Lists' ler non primitive olan çoklu dataları kullanmak için kullanırız.
//Array List yerine sadece List 'de diyebiliriz.
        //Array'ler superfast'dir. ve memory'de çok az yer kaplıyorlar.
        //Java Array'listleri olusturduktan sonra Array'leri iptal etmedi Cünkü ;
        // a) Array'ler super fast (super hızlıdır.),
        // b) Array'ler memory'de cok az yer kaplar
        // c) Bu nedenle eleman sayisi belli olan dataları depolamak icin Array'ler tercih edilir.


        //Array'ler primitive data typelari ve "referance"lari depolayabilir.
        //Ama ArrayListler non-primitive data type'lari depolar, bu nedenle ArrayListler  memory' de Arraylerden daha fazla yer kaplarlar


//        --------------------------------------------------------------------------------------------------------------
        /*
1) Ayni data type indaki coklu datalari depolamak icin Array kullaniriz.
2) Arraylerin negatif bir yonu var, icine koyacaginiz eleman sayisini belirlemek zorundasiniz.
3) Arrayler eleman sayisinda esnek degildirler, bu yuzden java ArrayList adli yeni bir yapi olusturdu.
Bu yapi eleman sayisinda esnektir. Hic eleman koymazsaniz eleman sayisini 0 olarak ayarlar,
1000 eleman koyarsaniz eleman sayisini 1000 olarak ayarlar
4) Arraylist yerine sadece List de diyebilirsiniz
5) Java ArrayListleri olusturduktan sonra Array leri iptal etmedi cunku;
    a) Array ler super fast tir.
    b) Array ler memory de cok az yer kaplar.
    c) Bu nedenle eleman sayisi belli olan datalari depolamak icin Array ler tercih edilir.
6) Array ler primitive data type lari ve "reference" lari depolayabilir.
   Ama ArrayList ler non-primitive data type lari depolar, bu nedenle ArrayListler Arraylerden daha fazla yer kaplarlar.

*/


        ArrayList<Integer> ages = new ArrayList<>();

        //ArrayList console'a nasil yazdirlir?

        System.out.println(ages);

        //ArrayList'lere nasil eleman eklenir ?

        //obje.add demek objeye monteli demek ..  Kafa insana monteli ..

        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1, 656);

        // overload edilmis add() methodu ile istedigimiz index'e istedigimiz sayiyi yazabiliyoruz

        ages.add(3, 777);

        ages.add(888); // e zaten en sona ekler .

        System.out.println(ages); //[9, 656, 12, 777, 10, 888]
        // ArrayListslere eleman eklemek icin add() Methodunu kullanarak ekleriz.
        //Elemanlari sizin verdiğiniz sırada ekler List'e ( Insertion Order );
        /// List sizin ona verdiğiniz


        //List'e coklu eleman nasil eklenir ?  veya List'e baska bir List nasil eklenir ?
        // Bir List'e coklu eleman eklemek icin o elemanlari öncelikle bir listin icine koymalisin.

        ArrayList<Integer> newAges = new ArrayList<>();

        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);//[8, 9, 10]

        //List bir collection'dir.

        ages.addAll(2, newAges);//  [9, 656,    8, 9, 10,     12, 777, 10, 888]      2. index'^ten sonrasına koymak icin

        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

//Array'lerin Lenght'i olur ArrayList'lerin Size'i olur .... ... .... ..


        int numOfElement = ages.size();// size methodu bir list^deki eleman sayisini verir. index gibi 0 ' dan baslamaz .       lenght() gibi düşün.

        System.out.println(numOfElement);// yada System.out.println(ages.size());  ------->>> şekilde yapabilirsin.

//Array List^de specific bir eleman nasil alinir ?
        // get()  methodu index kullanarak istedigimiz elemani almaya yarar .

        int eleman3 = ages.get(1);
        System.out.println(eleman3); //656

        //ArrayList'de specific bir elemani nasil degistirilebilir ?
        //set() methodu
        ages.set(6, 155);
        System.out.println(ages);

        ages.set(4, 313); //set() methodu belirtilen index'tekinin yerine ne koyacagımızı koymak icin kullanılır .
        System.out.println(ages);


        //Bir listte tum elemanlari nasil silebiliriz ?
//        ages.clear();
//        System.out.println(ages); // ages list'indeki tum ogeleri temizledik .. []


        //Arraylist'de specific bir elemanin var olup olmadigini nasil anlariz ?
        //String manipulation'daki contains methodu .

        boolean r = ages.contains(313);
        System.out.println(r);      // false görürüz cünkü bir üst methodda clear ile herseyi temizledik .

        //Bir Arraylist'in bos olup olmadigini kontrol edin
        boolean tf = ages.isEmpty(); // boolean return ediyor ..
        System.out.println(tf);  //clear() methodunu comment yaptım. ona göre .. false  verir cünkü ici dolu. bos mu diye soruyoruz ? ?

        //Ornek 1 : Size verilen bir listin bos olup olmadigini kontrol eden kodu yazanız.

        ArrayList<String> names  =new ArrayList<>();
        names.add("Gulce");
        names.add("Seda");
        names.add("Benna");
        names.add("Rıdvan");
        names.add("Enes");

        //1. yol

        // fazladan kontrol yapıyor == diyerek.
        if (names.size() ==0){
            System.out.println("list is empty");
        }else {
            System.out.println("List has at least 1 element.");
        }




        names.clear();
        //2. yol cözelim farki görelim.
//2. yol daha kullanmak daha iyidir.
//        java bir amaca yönelik belli bir method  yaptıysa onu kullanmak her zaman daha iyidir.
        //2. yol recommended.
        if (names.isEmpty()){
            System.out.println("List is empty.");
        }else {
            System.out.println("List has at least 1 element.");
        }



        /*
        Bir methodu ogrenirken asagidaki 3 seyi ogrenin
        1-  Method ne is yapar.
        2-  Method nasil kullanilir.
        3-  Methodun return type
        */
    }
}
