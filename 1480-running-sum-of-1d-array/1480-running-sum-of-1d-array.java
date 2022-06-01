class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums[0];
        for(int i=1; i<nums.length; i++){
            n += nums[i];
            nums[i] = n;
        }
        return nums;
    }
}