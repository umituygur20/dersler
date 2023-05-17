package day11nestediIfTernaryincrementDecrement;

public class IncrementDecrement {
    public static void main(String[] args) {

        //Increment
        int a = 5 ;
        System.out.println(a); //5

        a =a+2 ;
        System.out.println(a); // 7

        a+=2;
        System.out.println(a); // 9

        //Ornek : Bir tane Integer variable olusuturn ve onu iki sekilde 5 artirin.

        int b =22;
        System.out.println(b);
        b=b+2; //24
        System.out.println(b);
        b+=13; //37
        System.out.println(b);

        //Decrement


        int c =8;
        System.out.println(c);
        c=c-3;
        System.out.println(c); //5

        c-=3;
        System.out.println(c); //2


        //Increment 2

        int d = 6;
        System.out.println(d);//6
        d=d*2;
        System.out.println(d);//12
        d*=2;
        System.out.println(d);//24





        //Decrement 2

        int e = 24;
        System.out.println(e);//24

        e = e / 2;
        System.out.println(e);//12

        e /= 2;
        System.out.println(e);//6

        //"1" ile increment

        int f = 12;
        //f=f+1;
        //f+=1;
        f++;

        //"1" ile decrement

        int h = 10;
        // h=h-1;
        //h-=1;
        h--;



    }
}
