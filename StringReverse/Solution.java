package StringReverse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scan.nextLine());
        String original = input.toString();
        String reversed = String.valueOf(input.reverse());
        System.out.println(original.equals(reversed) ? "Yes" : "No");

    }
}
