package Substring;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] values = scan.nextLine().split("\s+");
        int start = Integer.parseInt(values[0]);
        int end = Integer.parseInt(values[1]);

        StringBuilder res = new StringBuilder();
        if (start >= 0 && end <= input.length()) {
            for (int i = start; i < end; i++) {
                res.append(input.charAt(i));
            }
        }
        System.out.println(res);
    }
}
