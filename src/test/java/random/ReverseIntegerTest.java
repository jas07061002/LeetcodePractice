package random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseIntegerTest {

    @Test
    public void testA() {
        assertEquals(ReverseInteger.reverse(0),0);
    }

    @Test
    public void testB() {
        assertEquals(ReverseInteger.reverse(120),21);
    }

    @Test
    public void testB1() {
        assertEquals(ReverseInteger.reverse(-436746),-647634);
    }


    @Test
    public void testC() {
        assertEquals(ReverseInteger.reverse(Integer.MAX_VALUE),0);
    }

    @Test
    public void testD() {
        assertEquals(ReverseInteger.reverse(Integer.MIN_VALUE),0);
    }
}
