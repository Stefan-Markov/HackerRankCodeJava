package Regex;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
        String pattern = num + "." + num + "." + num + "." + num;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(pattern));
        }
    }
}
