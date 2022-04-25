class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0,index = 0;   
        while(index<nums.length){
            if(nums[i] != nums[index]) nums[++i] = nums[index];
            index++;
        }
        return i+1;
    }
}