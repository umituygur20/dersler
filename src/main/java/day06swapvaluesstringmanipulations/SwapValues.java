package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {

        //Swap : Yer değiştirmek demektir. 1.kap Patates 2.kap Domates ==>swap==>1.Kap Domates 2.kap Domates
        //

        int a = 12;
        int b=5; // Swap 'den sonra ==> a=5 , b =12 ;
        int c =0;

       // ------------------------------1. yol
       //1 adim
        c=a;
        //2.adim
        a=b;
        //3.adim
        b=c;

        /////////////2. yol //////////

        int elma =12;
        int armut=5;

        elma = elma +armut; //12+5 =17
        armut=elma -armut;   // armut =17-5 =12 elma sayısını bulduk hadi bakam
        elma =elma -armut;  //elma =17-armut (12) =5




    }
}
