package OOPS;

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bark Bark");
        }
    }
    public static class Cat {
        void speak() {
            System.out.println("Meow Meow");
        }
    }
    public static class Pikachu {
        void speak() {
            System.out.println("Pika Pika");
        }
    }
    public static class Human {
        void speak() {
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        Dog Coco = new Dog();
        Cat c = new Cat();
        Pikachu p = new Pikachu();
        Human Ishu = new Human();

        Coco.speak();
        c.speak();
        p.speak();
        Ishu.speak();
    }
}
