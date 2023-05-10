package day03methodobjectcreationscanner;
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //1.Adım  = Scanner Class'tan Object oluştur .
        //Class ismi   +  Object ismi  +    Assignment Op.  +  "new" Keyword  + Constructor

        Scanner input =new Scanner(System.in);

        //2. Adım = Kullanıcıya ne istediğinize dair mesaj veriniz .
        System.out.println("Lütfen Yaşınızı giriniz");

        //3.Adım = Uygun method'u kullanarak kullanıcın verdiği datayı memory'ye yerleştiriniz
       byte age= input.nextByte();
        System.out.println("age = " + age);
    }


}
