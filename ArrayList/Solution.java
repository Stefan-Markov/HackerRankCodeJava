package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<List<Integer>> lines = new ArrayList<>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            List<Integer> line = new ArrayList<>();
            int num = scan.nextInt();
            for (int j = 0; j < num; j++) {
                line.add(scan.nextInt());
            }
            lines.add(line);
        }

        int line = scan.nextInt();
        for (int i = 0; i < line; i++) {
            int firstIndex = scan.nextInt();
            int secondIndex = scan.nextInt();
            if (secondIndex > lines.get(firstIndex - 1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(lines.get(firstIndex - 1).get(secondIndex - 1));
            }
        }
        scan.close();
    }
}