package BitSet;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet[] bits = {new BitSet(n), new BitSet(n)};

        for (int i = 0; i < m; i++) {
            String operation = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();

            switch (operation) {
                case "AND" -> bits[x - 1].and(bits[y - 1]);
                case "OR" -> bits[x - 1].or(bits[y - 1]);
                case "XOR" -> bits[x - 1].xor(bits[y - 1]);
                case "FLIP" -> bits[x - 1].flip(y);
                case "SET" -> bits[x - 1].set(y);
                default -> {
                }
            }
            System.out.println(bits[0].cardinality() + " " + bits[1].cardinality());
        }
    }
}
