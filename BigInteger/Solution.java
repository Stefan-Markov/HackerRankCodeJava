package BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger c = sc.nextBigInteger();
        BigInteger d = sc.nextBigInteger();

        System.out.println(c.add(d));
        System.out.println(c.multiply(d));
    }
}
