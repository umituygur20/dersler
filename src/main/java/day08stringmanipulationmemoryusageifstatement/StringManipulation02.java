package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {
    public static void main(String[] args) {

        //Örnek 1: Bir String'in belirli bir karakterinden başlayarak belirli bir karaktere kadar dynamic olarak alınız.
        // abc@gmail.com  ==> gmail

        String a = "abc@hotmail.com";

        int startingIndex = a.indexOf('@') + 1;

        //başlangıç index +1 yapıyoruz ki dynamic olsun yahoo 'da olur hotmailde sorun olur diğer türlü.

        int endingIndex = a.indexOf('.');

        String companyName = a.substring(startingIndex, endingIndex);

        System.out.println(companyName);


        /////// HARD CODING
        //ÖRNEK  : : : : : : :  : :  hotma ' olarak yazdırır.
        System.out.println("hard coding ==> "+ a.substring(4,9));

        //ÖRNEK: 2 : Verilen iki string'in birbirnin aynı olup olmadığını kontrol ediniz.

        String h = "ali Can";
        String i = "Ali Can";
        // Java Case sensitive olduğu için küçük büyük harf bakar ve false verir .
       boolean result= h.equals(i);// equals methodu eşit mi diye bakar string sepetine bakıp.
        System.out.println(result);

    }

}
