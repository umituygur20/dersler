package day25inheritance;

public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle 1");

        /**
         Child classtan bir object oluşturduğunuzda Consturctorlar en ustteki parent classtan baslatilarak alta dogru calisir.
         Peki bunun mantığı nedir== ?

         Vehicle motor methodu olsa , car class'in kendine has methodlari olsa . Eğer Honda Vehicle'daki methodlari kullanacksa
         içerisinde vehicle objesi olur .


        !!!.. Bir method static değilse Object'ler üzerinde kullanılabilir..!!!

         //Super Parent demek.
         //Parantez'de Constructor demek.
         Her Constructor' içinde görünmez bir Super var .

         */


        /**
         * 1) Child classtan bir adet object oluşturdugunuzda Constructorlar en üstteki parent classtan baslatilarak alta dogru calısır
         * 2)Child Clasastaki Constructordan Parent Class daki Constructor 'a gidebilmek için super() kullanılır
         * 3) Parent Classtan birden fazla Constructor varsa istnilenn Constructor istenilen constructor super () ifadesinin parantez
         * içine yazilan parametreler yardimi ile
         * 4) Ayni Class icindeki Constructor'lari secmek icin "this" keywordd kullanilir.
         * Ayni classta birden fazla constructor varsa istenilen constructor "this" icine yazılan parametreler yardimi ile secilebilir.
         * 5)super() ifadesini yazmak istege bagli
         */
    }
}
