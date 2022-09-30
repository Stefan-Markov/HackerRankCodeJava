package Anagrams;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = Arrays.stream(scan.nextLine()
                .split(""))
                .map(String::toLowerCase)
                .sorted()
                .reduce((a, b) -> a + b)
                .orElse("");

        String second = Arrays.stream(scan.nextLine()
                .split(""))
                .map(String::toLowerCase)
                .sorted()
                .reduce((a, b) -> a + b)
                .orElse("");

        System.out.println(first.equals(second) ? "Anagrams" : "Not Anagrams");

    }
}
