public class Solution704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int middle;

        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] > target) {
                right = middle - 1;
                continue;
            } else if(nums[middle] < target) {
                left = middle + 1;
                continue;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
