package CanYouAccess;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inner.Private innerPrivate = new Inner.Private();
        int number = scanner.nextInt();
        int result = innerPrivate.powerof2(number);
        if (result == -1) {
            System.out.println(number + " is not a power of 2");
        } else {
            System.out.println(number + " is power of 2");
        }

        Object o = new Inner.Private();

        System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
    }

    static class Inner {
        private static class Private {
            private int powerof2(int num) {
                int power = 0;

                if (num > 1) {
                    while (num % 2 == 0) {
                        num = num / 2;
                        power++;
                    }
                    if (num != 1) {
                        power = -1;
                    }
                }
                return power;
            }
        }
    }
}
