package random;

import java.util.Arrays;

public class MergeSortedArray {

    public void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        mergeSort(nums1, nums2, m, n);

    }

    public int[] mergeSort(int[] a, int[] b, int m, int n) {

        while (m > 0 && n > 0) {
            if (a[m - 1] > b[n - 1]) {
                a[m + n - 1] = a[m - 1];
                m--;
            } else {
                a[m + n - 1] = b[n - 1];
                n--;
            }
        }

        return a;
    }
}
