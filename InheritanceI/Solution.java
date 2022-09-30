package InheritanceI;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }

    static abstract class Animal {
        abstract void walk();

        abstract void sing();


    }

    static class Bird extends Animal {
        void fly() {
            System.out.println("I am flying");
        }

        @Override
        void walk() {

            System.out.println("I am walking");

        }

        @Override
        void sing() {
            System.out.println("I am singing");

        }
    }
}
