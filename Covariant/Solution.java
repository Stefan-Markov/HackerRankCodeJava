package Covariant;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Region r1 = null;
        String x = scan.next();
        switch (x) {
            case "AndhraPradesh" -> r1 = new AndhraPradesh();
            case "WestBengal" -> r1 = new WestBengal();
        }

        System.out.println(r1.yourNationalFlower());
    }

    static class Flower {
        String whatsYourName() {
            return "I have many names and types.";
        }
    }

    static class Jasmine extends Flower {
        @Override
        String whatsYourName() {
            return "Jasmine";
        }
    }

    static class Lily extends Flower {
        @Override
        String whatsYourName() {
            return "Lily";
        }
    }

    static class Region {
        Flower yourNationalFlower() {
            return new Flower();
        }
    }

    static class WestBengal extends Region {
        @Override
        Flower yourNationalFlower() {
            return new Jasmine();
        }
    }

    static class AndhraPradesh extends Region {
        @Override
        Flower yourNationalFlower() {
            return new Lily();
        }
    }
}
