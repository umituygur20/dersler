package day03methodobjectcreationscanner;

public class HomeWork3 {
    public static void main(String[] args) {

        HomeWork2 teacher =new HomeWork2();
        System.out.println("teacher.id = " + teacher.id);
        System.out.println("Age  = " + teacher.age);
        System.out.println("Gender = " + teacher.gender);
        System.out.println("Name  = " + teacher.name);
        System.out.println("Surname = " + teacher.surname);

        teacher.teach();
        teacher.relationship();

    }
}
