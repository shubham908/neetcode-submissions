class Solution {

    public boolean hasDuplicate(int[] nums) {
        var set = new HashSet<Integer>(nums.length);
        for (int i: nums) {
            if (set.contains(Integer.valueOf(i))) {
                return true;
            }
            set.add(Integer.valueOf(i));
        }
        return false;    
    }
}