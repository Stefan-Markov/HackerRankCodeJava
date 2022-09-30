package EndOfFile;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        while (scanner.hasNext())
            System.out.println(++x + " " + scanner.nextLine());
        scanner.close();
    }
}
