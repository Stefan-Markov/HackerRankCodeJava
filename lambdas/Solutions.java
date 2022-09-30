package lambdas;

import java.util.Scanner;

public class Solutions {

    private static Actions actions;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for (int i = 0; i < n; i++) {
            int key = scan.nextInt();
            int val = scan.nextInt();


            switch (key) {
                case 1:
                    if (actions.isOddValue.test(val)) {
                        System.out.println("EVEN");
                    } else {
                        System.out.println("ODD");
                    }
                    break;

                case 2:
                    if (actions.isComposite.test(val)) {
                        System.out.println("PRIME");
                    } else {
                        System.out.println("COMPOSITE");
                    }
                    break;

                case 3:
                    if (actions.isPalindrome.test(String.valueOf(val))) {
                        System.out.println("PALINDROME");
                    } else {
                        System.out.println("NOT PALINDROME");
                    }
                    break;
            }
        }
    }
}
