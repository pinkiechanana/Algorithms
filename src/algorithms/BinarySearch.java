package algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 7, 8, 9, 11, 13, 15, 16};
        int target = 4;

        Solution solution = new Solution();
        int result = solution.search(array, target);

        if (result == -1) {
            System.out.println("Nope, not there!");
        } else System.out.println("It's here alright!");
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else return target;
        }
        return -1;
    }
}

