class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int n = nums[i];
                nums[i] = nums[index];
                nums[index] = n; index++;
            }
        }
        
    }
}