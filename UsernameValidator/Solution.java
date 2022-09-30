package UsernameValidator;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String regularExpression = "^[a-zA-Z][\\w]{7,29}$";

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        while (n-- > 0) {
            String userName = scan.nextLine();

            if (userName.matches(regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
