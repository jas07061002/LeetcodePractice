package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    ValidParenthesesOrder validParentheses;

    @Test
    public void testA(){
        assertTrue(validParentheses.isValid("()"));
    }

    @Test
    public void testB(){
        assertTrue(validParentheses.isValid("()[]{}"));
    }

    @Test
    public void testC(){
        assertFalse(validParentheses.isValid("(]"));
    }

    @Test
    public void testD(){
        assertFalse(validParentheses.isValid("([)]"));
    }

    @Test
    public void testE(){
        assertTrue(validParentheses.isValid("{[]}"));
    }

}
