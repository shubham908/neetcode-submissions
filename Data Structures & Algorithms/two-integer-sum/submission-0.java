class Solution {
    public int[] twoSum(int[] nums, int target) {
        var ptr1 = 0;
        var ptr2 = 1;

        var endLoop = false;

        while (ptr1 < nums.length) {
            while (ptr2 < nums.length) {
                if (nums[ptr1] + nums[ptr2] == target) {
                    endLoop = true;
                    break;
                }
                ptr2 = ptr2 + 1;
            }
            if (endLoop) {
                break;
            }
            ptr1 = ptr1 + 1;
            ptr2 = ptr1 + 1;
        }

        return new int[] {ptr1, ptr2};
    }
}
