package Sort;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        List<Player> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String[] input = scan.nextLine().split("\\s+");

            Player player = new Player(Integer.parseInt(input[0]), input[1], Double.parseDouble(input[2]));

            list.add(player);
        }

        list.sort((s1, s2) -> {
            if (s1.number == s2.number) {
                if (s1.name.compareTo(s2.name) > 0) {
                    return 1;
                }
                return -1;
            }
            return s1.number > s2.number ? -1 : 1;
        });

        list.forEach(e -> System.out.print(e.name + "\n"));
    }

    static class Player {

        private int id;

        private String name;
        private double number;

        public Player(int id, String name, double number) {
            this.id = id;
            this.name = name;
            this.number = number;
        }
    }
}
