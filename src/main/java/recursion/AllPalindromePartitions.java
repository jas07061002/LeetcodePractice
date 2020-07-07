package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPalindromePartitions {

    public static void main(String[] args) {

        printAllPalindromes("bcc");
    }

    public static void printAllPalindromes(String x) {

        String tempX = x.replaceAll("[\\W]|_", "");
        String[] temp = tempX.split("");
        String a = "";
        List<String> ab = new ArrayList<>();
        for (String s : temp) {
            ab.add(s + "");
        }

        for (int i = 0; i < temp.length; i++) {
            a = temp[i];
            for (int j = i + 1; j < temp.length; j++) {
                a += temp[j];
                if (reverse(a).equals(a)) {
                    ab.add(a);
                }

            }
        }
        System.out.println(Arrays.toString(ab.toArray()));
    }

    public static String reverse(String a) {
        String[] temp = a.split("");
        String rev = "";
        for (int i = temp.length - 1; i >= 0; i--) {
            rev += temp[i];
        }
        return rev.length() > 0 ? rev : a;
    }
}
