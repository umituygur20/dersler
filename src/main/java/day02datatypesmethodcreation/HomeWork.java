package day02datatypesmethodcreation;

public class HomeWork {
    public static void main(String[] args) {

       int  alanHesap=alan(5,10);
        System.out.println(alanHesap);
        int cevreHesap=cevre(5,10);
        System.out.println(cevreHesap);
    }

    public static int alan(int kisaKenar ,int uzunKenar){
        return kisaKenar*uzunKenar;
    }
    protected static int cevre(int kisaKenar,int uzunKenar){
        return 2*(kisaKenar + uzunKenar);
    }

}
