/* Given an alphanumeric string, s, denoting a password, compute and print its MD5 encryption value.
 */

import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(s.getBytes());
            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}

