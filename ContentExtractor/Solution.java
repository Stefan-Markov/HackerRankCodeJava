package ContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases-- > 0) {
            String line = in.nextLine();
            boolean flag = false;
            String str = "<([^<>]+)>([^<>]+)</\\1>";

            Pattern pattern = Pattern.compile(str);
            Matcher myMatch = pattern.matcher(line);

            while (myMatch.find()) {
                System.out.println(myMatch.group(2));
                flag = true;
            }
            if (!flag) {
                System.out.println("None");
            }

        }
    }
}
