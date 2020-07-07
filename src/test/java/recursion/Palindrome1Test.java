package recursion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Palindrome1Test {

    @Test
    public void test1(){
        Palindrome1 palindrome1 = new Palindrome1();
        assertEquals(palindrome1.printAllPalindromes("nitin"), Boolean.TRUE);
    }

    @Test
    public void test2(){
        Palindrome1 palindrome1 = new Palindrome1();
        assertEquals(palindrome1.printAllPalindromes("A man, a plan, a canal: Panama"), Boolean.TRUE);
    }
}
