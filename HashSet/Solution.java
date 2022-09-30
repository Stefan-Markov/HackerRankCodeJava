package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < num; i++) {
            set.add(scan.nextLine());
            System.out.println(set.size());
        }
    }
}
