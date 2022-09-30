package md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        System.out.println(doHashing(password));
    }

    public static String doHashing(String password) {
        try {
            MessageDigest message = MessageDigest.getInstance("MD5");
            message.update(password.getBytes());
            byte[] result = message.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : result) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}