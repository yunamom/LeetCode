class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1,index = 0;   
        while(index<nums.length){
            if(nums[i-1] != nums[index]) nums[i++] = nums[index];
            index ++;
        }
        return i;
    }
}