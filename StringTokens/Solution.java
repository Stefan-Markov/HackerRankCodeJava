package StringTokens;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Arrays.stream(scan.nextLine()
                        .split("[ !,?._'@]"))
                .filter(w -> w.matches("\\w+"))
                .forEach(System.out::println);
    }
}
