package day33exceptionsenumsiterator;

public class EnumRunner {
    public static void main(String[] args) {

        Cities ankara = Cities.ANKARA;
        System.out.println(ankara);//ANKARA

        String adana = Cities.ADANA.getCityName();
        System.out.println(adana);//Adana

       int denizliPLaka= Cities.DENİZLİ.getPlateCode();
        System.out.println(denizliPLaka); //20
    }
}
