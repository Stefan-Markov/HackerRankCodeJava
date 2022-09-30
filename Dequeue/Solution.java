package Dequeue;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int size = in.nextInt();
        int countLength = in.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {

            int input = in.nextInt();

            deque.add(input);
            set.add(input);

            if (deque.size() == countLength) {
                if (set.size() > max) {
                    max = set.size();
                }
                int first = deque.remove();
                if (!deque.contains(first))
                    set.remove(first);
            }
        }
        System.out.println(max);
    }
}
