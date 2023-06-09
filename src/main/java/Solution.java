import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] parts = s.split("\\s|!|,|\\?|\\.|_|'|@");
        int i = 0;
        for (String part : parts) {
            if (!part.trim().isEmpty()) {
                i++;
            }
        }
        String[] newArr = new String[i];
        i = 0;
        for (String part : parts) {
            if (!part.trim().isEmpty()) {
                newArr[i] = part;
                i++;
            }
        }
        System.out.println(newArr.length);
        for (i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);

        }
        scan.close();
    }
}
