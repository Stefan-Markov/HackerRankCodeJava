package Regex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) throws IOException {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int numSentences = Integer.parseInt(scan.readLine());

        while (numSentences-- > 0) {
            String input = scan.readLine().trim();

            Matcher m = pattern.matcher(input);

            while (m.find()) {
                input = input.replaceAll(m.group(0), m.group(1));
            }
            System.out.println(input);
        }
        scan.close();
    }
}
