package Trojki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Sortujemy tablicę
        Arrays.sort(nums);

        // Iterujemy przez tablicę
        for (int i = 0; i < nums.length - 2; i++) {
            // Pomijamy duplikaty
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    // Dodajemy znalezione trójki do wyniku
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Pomijamy duplikaty
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void Show() {
        ThreeSum solution = new ThreeSum();

        int[] nums1 = {-1, 0, 1, 2, -1, -4, 5};
        List<List<Integer>> result1 = solution.threeSum(nums1);
        System.out.println("Przykład 1:");
        System.out.println("Wejście: " + Arrays.toString(nums1));
        System.out.println("Wyjście: " + result1);

        int[] nums2 = {0, 1, 1};
        List<List<Integer>> result2 = solution.threeSum(nums2);
        System.out.println("\nPrzykład 2:");
        System.out.println("Wejście: " + Arrays.toString(nums2));
        System.out.println("Wyjście: " + result2);
    }
}