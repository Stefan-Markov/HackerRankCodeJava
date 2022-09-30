package Java2DArray;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];

        readMatrix(scan, arr);

        sum(arr);
    }

    private static void readMatrix(Scanner scan, int[][] arr) {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                arr[row][col] = scan.nextInt();
            }
        }
    }

    private static void sum(int[][] arr) {

        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {

                int top = arr[row][col] + arr[row][col + 1] + arr[row][col + 2];
                int middle = arr[row + 1][col + 1];
                int bottom = arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
                int innerSum = top + middle + bottom;
                maxSum = Math.max(maxSum, innerSum);
            }
        }
        System.out.println(maxSum);
    }
}