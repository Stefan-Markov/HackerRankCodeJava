package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1 / num2);

        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}