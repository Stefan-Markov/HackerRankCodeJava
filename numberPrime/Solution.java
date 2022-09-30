package numberPrime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;


class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());
        int n4 = Integer.parseInt(br.readLine());
        int n5 = Integer.parseInt(br.readLine());

        Prime ob = new Prime();
        ob.checkPrime(n1);
        ob.checkPrime(n1, n2);
        ob.checkPrime(n1, n2, n3);
        ob.checkPrime(n1, n2, n3, n4, n5);
    }

    static class Prime {
        boolean checkNumber(int n) {
            if (n < 2) {
                return false;
            }
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        void checkPrime(Integer... a) {
            boolean f = false;
            for (Integer integer : a) {
                if (checkNumber(integer)) {
                    if (f) System.out.print(" ");
                    f = true;
                    System.out.print(integer);
                }
            }
            System.out.println();
        }
    }

}