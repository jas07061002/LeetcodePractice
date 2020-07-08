package random;

public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println(reverse(-1563847412));

    }

    public static int reverse(int x) {
        int temp = 0;
        String a ="";
        String b="";
        if (x < 0) {
            b="-";
            x = Math.abs(x);
        }

        if(x == 0){
            return x;
        }

        if(x<=Integer.MIN_VALUE){
            return 0;
        }

        if(x>=Integer.MAX_VALUE){
            return 0;
        }

        while(x!=0){
            temp = x%10;
            x = x/10;
            a+=temp;
        }

        b+=a;

        if(Long.parseLong(b)<=Integer.MIN_VALUE){
            return 0;
        }
        if(Long.parseLong(b)==Integer.MIN_VALUE){
            return Integer.MAX_VALUE-1;
        }

        if(Long.parseLong(b)>=Integer.MAX_VALUE){
            return 0;
        }

        return Integer.parseInt(b);

    }
}
