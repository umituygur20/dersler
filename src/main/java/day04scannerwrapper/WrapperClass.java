package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {

        //primitive : char - boolean - byte - short - int -long - float -double
        //Wrapper Class :Character - Booelan - Byte - Short - Integer - Long - Float -Double

        //Wrapper Class'lar non-Primitive'dir o yüzden memory'de çok yer kaplar .
        // o yüzden şart değilse Wrapper Class kullanmayı Tercih etmeyiz . . . .



        //n yazıp . (nokta ) koyarsanız method göremezsiniz
        int n = 12 ;

        //m yazip . (nokta) koyarsanız birçok method görürsünüz çünkü Wrapper classlar method içerir.
        Integer m=12;

    //Örnek1  : short data type'ının minimum ve maximum değerlerini kod yazarak bulunuz.



        short minShort =Short.MIN_VALUE;
        short maxShort= Short.MAX_VALUE;

        System.out.println("minShort = " + minShort);
        System.out.println("maxShort = " + maxShort);

        //örnek 2  : int data type'ının minumum değeri ile maximum değerini gösteriniz.

        int intMin = Integer.MIN_VALUE;
        int byteMax =Byte.MAX_VALUE;
        System.out.println("Değer = "+(intMin+byteMax)); // -2147483648127

        //Örnek 3 : Primitive int 'i Wrapper Integer'a çeviriniz .  (AutoBoxing)

        int num = 19;
        Integer wrapperNum =num;



        //Örnek 4  : Wrapper Byte'ı  primitive byte'a çeviriniz .   (Unboxing)

        Byte k =19;
        byte primitiveK = k;


        //Örnek 5 Primitive char 'ı Wrapper Character' e çeviriniz.(AutoBoxing )

        char c= 'c';
        Character ch=c;

        //Örnek 6 Wrapper Boolen'i primitive boolen'a çeviriniz . (Unboxing )

        Boolean yasliMi=true;
        boolean isOld=yasliMi;


    }

}
