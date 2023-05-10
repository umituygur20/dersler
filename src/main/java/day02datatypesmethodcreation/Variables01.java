package day02datatypesmethodcreation;

public class Variables01 {
    public static void main(String[] args) {

        //Variable Resort area'dır
        //Variable bir konteynır'dır.
        //Variable bir kutudur.
        //Variable değişkendir  sabit değildir istersek değiştiririz.
        //Ornek 1: Sehir ismi icin bir variable olusturun ve once "Ankara" sonrada "Izmir" degeri atayip ekrana yazdirin
        String cityName = "Ankara";
        System.out.println(cityName);

        cityName = "Izmir";
        System.out.println(cityName);

        //Ornek 2: Sehir plaka kodu icin bir variable olusturun ve once "06" sonrada "35" degeri atayip ekrana yazdirin
        byte plakaKodu = 06;
        System.out.println(plakaKodu);

        plakaKodu = 35;
        System.out.println(plakaKodu);

        //Ornek 3: Basarili mi? sorusu icin bir variable olusturun ve once "false" sonrada "true" degeri atayip ekrana yazdirin.
        boolean isSuccessful = false;
        System.out.println(isSuccessful);

        isSuccessful = true;
        System.out.println(isSuccessful);


    }
}
