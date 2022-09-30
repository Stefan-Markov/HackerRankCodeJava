package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lines = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            list.add(scan.nextInt());
        }

        int numOfCommands = scan.nextInt();

        for (int i = 0; i < numOfCommands; i++) {
            String command = scan.next();
            switch (command) {
                case "Insert" -> {
                    int index = scan.nextInt();
                    int value = scan.nextInt();
                    list.add(index, value);
                }
                case "Delete" -> {
                    int ind = scan.nextInt();
                    list.remove(ind);
                }
            }
        }
        list.forEach(e -> System.out.print(e + " "));

    }
}
