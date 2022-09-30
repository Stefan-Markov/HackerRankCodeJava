package sha256;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        MessageDigest md = MessageDigest.getInstance("SHA-256");


        String str = bufferedReader.readLine();

//        if (str.matches("[a-zA-z0-9]+")) {
        md.update(str.getBytes());
        byte[] digest = md.digest();

        for (byte b : digest) {
            System.out.format("%02x", b);
        }
//        }

    }
}
