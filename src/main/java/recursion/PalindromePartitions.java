package recursion;

public class PalindromePartitions {

    public void main(String[] args) {
        printAllPalindromes("nitin");

    }

    public void printAllPalindromes(String x) {

        String tempX = x.replaceAll("[\\W]|_", "");
        String[] temp = tempX.split("");
        String a = "";
        for (String s : temp) {
            System.out.print(s + " ");
        }

        System.out.println();
        for (int i = 0; i < temp.length; i++) {
            a = temp[i];
            for (int j = i + 1; j < temp.length; j++) {
                a += temp[j];
                if (reverse(a).equals(a)) {
                    System.out.print(a);
                    System.out.println();
                }

            }
        }
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

