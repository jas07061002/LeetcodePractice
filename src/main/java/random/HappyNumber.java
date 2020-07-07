package random;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {

        int slow = n;
        int fast = sumSquares(n);
        while (fast != 1 && fast != slow) {
            slow = sumSquares(slow);
            fast = sumSquares(sumSquares(fast));

        }

        return fast == 1;
    }


    public static int sumSquares(int n) {
        int temp = 0;
        int sum = 0;
        while (n != 0) {
            temp = n % 10;
            sum = sum + (temp * temp);
            n = n / 10;
        }
        return sum;


    }
}
