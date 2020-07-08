package random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HappyNumberTest {

    @Test
    public void testA() {
        assertTrue(HappyNumber.isHappy(19));
    }

    @Test
    public void testB() {
        assertFalse(HappyNumber.isHappy(250));
    }

    @Test
    public void testB1() {
        assertFalse(HappyNumber.isHappy(2));
    }


    @Test
    public void testC() {
        assertTrue(HappyNumber.isHappy(7));
    }
}
