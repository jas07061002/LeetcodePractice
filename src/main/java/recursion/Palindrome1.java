package recursion;

public class Palindrome1 {

    public void main(String[] args) {
        System.out.println(printAllPalindromes("nitin"));

    }


    public boolean printAllPalindromes(String x){

        String tempX =  x.replaceAll("[\\W]|_", "");
        String[] temp = tempX.split("");
        String a = "";

        for(int i=temp.length-1;i>=0;i--){
            a+=temp[i];


        }
        System.out.println("Tempx is"+tempX);

        System.out.println("A is"+a);

        return a.compareToIgnoreCase(tempX) == 0;
    }

}

