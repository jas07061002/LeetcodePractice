package random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortedArrayTest {

    MergeSortedArray mergeSortedArray;

    @BeforeEach
    public void setUpOnce() {
        // One time initialization.
        mergeSortedArray = new MergeSortedArray();

    }

    @Test
    public void testA() {
        int[] a = {1, 4, 7, 0};
        int[] b = {5};
        int m = 3;
        int n = 1;
        assertEquals(Arrays.toString(new int[]{1, 4, 5, 7}), Arrays.toString(mergeSortedArray.mergeSort(a, b, m, n)));
    }

    @Test
    public void testB() {
        int[] a = {0};
        int[] b = {};
        int m = 1;
        int n = 0;
        assertEquals(Arrays.toString(new int[]{0}), Arrays.toString(mergeSortedArray.mergeSort(a, b, m, n)));
    }

    @Test
    public void testC() {
        int[] a = {};
        int[] b = {};
        int m = 0;
        int n = 0;
        assertEquals(Arrays.toString(new int[]{}), Arrays.toString(mergeSortedArray.mergeSort(a, b, m, n)));
    }

    @Test
    public void testD() {
        int[] a = {1, 4, 7, 322, 678, 878, 0, 0, 0, 0, 0, 0, 0};
        int[] b = {34, 74, 87, 90, 98, 232, 373};
        int m = 6;
        int n = b.length;
        assertEquals(Arrays.toString(new int[]{1, 4, 7, 34, 74, 87, 90, 98, 232, 322, 373, 678, 878}), Arrays.toString(mergeSortedArray.mergeSort(a, b, m, n)));
    }

}
