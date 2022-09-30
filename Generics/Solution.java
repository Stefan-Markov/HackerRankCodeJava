package Generics;


public class Solution {
    public static void main(String[] args) {
        Object[] arr = {1, 2, 3, "Hello", "World",2L};

        print(arr);
    }

    public static <T> void print(T[] data) {
        for (T element : data) {
            System.out.println(element);
        }

    }
}
