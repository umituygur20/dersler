package day03methodobjectcreationscanner;

public class HomeWork {
    public static void main(String[] args) {
        //HomeWork
        //1 ) Yarı çapı verilen Çemberin çevresini hesaplayan methodu oluşturuz ve kullanınız.

        //2 ) Dairenin alanini hesaplayan methodu oluşturunuz ve kullanınız.

        double yaricap=5;
        cevrecember(yaricap);
        alandaire(yaricap);
    }
    public static void  cevrecember(double yaricap){
        double pi =Math.PI;
        System.out.println("Cevre = "+ 2*pi*yaricap);

    }
    public static void alandaire(double yaricap){
        double pi = Math.PI;
        System.out.println("Cevre = " + pi*yaricap*yaricap);

    }
}
