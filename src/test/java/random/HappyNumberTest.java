package random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HappyNumberTest {

    @Test
    public void testA() {
        HappyNumber happyNumber = new HappyNumber();
        assertTrue(happyNumber.isHappy(19));
    }

    @Test
    public void testB() {
        HappyNumber happyNumber = new HappyNumber();
        assertTrue(happyNumber.isHappy(250));
    }

    @Test
    public void testB1() {
        HappyNumber happyNumber = new HappyNumber();
        assertFalse(happyNumber.isHappy(2));
    }


    @Test
    public void testC() {
        HappyNumber happyNumber = new HappyNumber();
        assertTrue(happyNumber.isHappy(7));
    }
}
