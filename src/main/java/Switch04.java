import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir Ülke ismi giriniz.");
        String ulke = scan.nextLine().toLowerCase();


        switch (ulke) {
            case "amerika":
                System.out.println("USA");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default: {
                System.out.println("Lütfen gecerli bir Ulke adi giriniz");

            }
        }
    }
}
