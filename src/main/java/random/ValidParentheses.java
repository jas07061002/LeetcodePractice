package random;

public class ValidParentheses {

    public static void main(String[] args) {

        System.out.println(isValid("()"));

    }

    public static boolean isValid(String s) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countE = 0;
        int countF = 0;

        String[] array = s.split("");

        for (String value : array) {
            if (value.equals("("))
                countA++;
            if (value.equals(")"))
                countB++;
            if (value.equals("["))
                countC++;
            if (value.equals("]"))
                countD++;
            if (value.equals("{"))
                countE++;
            if (value.equals("{"))
                countF++;
        }


        return countA == countB && countC == countD && countE == countF;

    }
}
