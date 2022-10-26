import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower", "fly", "flight"};
        System.out.println(longestCommonPrefix(arr));



    }

    public static String longestCommonPrefix(String[] strs) {
        int minLength  = strs[0].length();
        for (String s:strs) {
            if (s.length() < minLength){
                minLength = s.length();
            }
        }
        int i = 0;
        l1:
        for(i = 0; i < minLength; i++){
            for (String s:strs) {
                if (s.charAt(i) != strs[0].charAt(i)){
                    break l1;
                }
            }
        }
        return strs[0].substring(0, i);

    }
}
