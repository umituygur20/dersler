package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {

//Note : Java "pass by value" sayesinde variable'ların orjinal değerini korur.
        int shirtPrice = 100;

        //Java methoda gönderirken orjinal değeri değil, kopyasını gönderir ve değisen deger kopya deger olur.
//        discount("student", shirtPrice);


        System.out.println(discount("student", shirtPrice));      /// 90 görürüz discount method sayesinde

        System.out.println(discount("veteran", shirtPrice));      //85

        System.out.println(discount("senior", shirtPrice));       // 95



   System.out.println(shirtPrice);      //100 değişmeyen değer passByValue edilmiş değer.
    }

    //Discount Methodunu olusturalım
    // 3'denfazla senaryo varsa Switch tercih etmeliyiz.
    public static int discount(String type, int price) {
        switch (type) {
            case "student":
                price = price - 10;
                break;
            case "veteran":
                price = price - 20;
                break;
            case "senior":
                price = price - 5;
                break;
            default:
                price = price;
        }
        return price;
    }
    /*
    Pass By Value:
    1) Java  "pass by value" kullanir
    2) Yani; java methodlarin orjinal degeri degistirmesine musaade etmez
    3) Java method lara deger yollarken orjinal degerin kopyasini olusturur. ve o kopyayi method a yollar
        Method kopya deger üzerinde degisiklik yapar, boylece orjinal deger korunmus olur
    4) java esnek bir dildir, istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz
    Bakiniz line 16



 */

}
