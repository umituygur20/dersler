package day25inheritance;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.meow();
        c1.drink();   //Animal class'tan extend ettik.
        c1.eat();     //Animal class'tan extend ettik.

        Dog d1 = new Dog();
        d1.bark();
        d1.drink();
        d1.eat();

        Bird b1 = new Bird();
        b1.tweet();
        b1.drink();
        b1.eat();
    }
}
