package Mediana;
import java.util.Arrays;


public class Mediana {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = mergeSortedArrays(nums1, nums2);
        int n = mergedArray.length;
        if (n % 2 == 0) {
            return (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2.0;
        } else {
            return mergedArray[n / 2];
        }
    }

    private static int[] mergeSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            merged[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            merged[k++] = nums2[j++];
        }
        return merged;
    }

    static public void show(){
        int[] a1 = {13,34,99,46};
        int[] a2 = {21,85,23,37};
        System.out.println("Median of merged arrays: " + Mediana.findMedianSortedArrays(a1,a2));
    }


}
