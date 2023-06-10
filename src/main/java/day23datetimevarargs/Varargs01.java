package day23datetimevarargs;

public class Varargs01 {
    public static void main(String[] args) {


        //Toplama işlemi yapan bir method olusturun

        System.out.println(add());
    }

    // Note :1) Bir method parantezine birden fazla Varargs kullanilamaz.
     //Note :2) Eger bir method parantezinde birden fazla parametre kullanılacaksa
                                                                        /** Varargs Sonda */ // olmalıdır.

    /**
     * Asagidaki gibi farkli methodlar olusturarak iş yapamayız!
     * Çünkü kullanıcı farklı sayıdaki sayilari toplamak isteyebilir.
     * Her ihtimal için bir method olusturmak mümkün degildir.
     * Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu
     * Bu yapiya Varargs denir .  // Varargs ==>> Değişen uzunluktaki Argümanlar
     * Varargs arka planda Array' yapisini kullanır.
     */

    public static int add(int... a) {
        int sum = 0;
        for (int w : a) {
            sum += w;
        }
        return sum;
    }



//    public static int add(int a, int b) {
//        return a + b;
//
//    }
//
//    public static int add(int a, int b, int c) {
//        return a + b + c;
//
//    }
//
//    public static int add(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }


}
