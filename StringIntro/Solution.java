package StringIntro;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();

        System.out.println(first.length() + second.length());

        if (first.compareTo(second) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        first = first.substring(0, 1).toUpperCase() + first.substring(1);
        second = second.substring(0, 1).toUpperCase() + second.substring(1);
        System.out.println(first + " " + second);

    }
}
