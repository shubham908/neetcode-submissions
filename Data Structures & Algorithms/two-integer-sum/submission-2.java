class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        var ptr1 = 0;
        var ptr2 = 1;
        for (int i = 0; i < nums.length; i++) {
            var diff = target - nums[i];
            if (map.containsKey(diff)) {
                ptr1 = i;
                ptr2 = map.get(diff);
            } else {
                map.put(nums[i], i);
            }
        }

        if (ptr1 > ptr2) {
            return new int[] {ptr2, ptr1};
        } else {
            return new int[] {ptr1, ptr2};
        }
    }
}
