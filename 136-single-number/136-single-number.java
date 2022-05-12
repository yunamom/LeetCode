class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int cnt = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]) cnt++;
                
                if(cnt == 2) break;
            }
            if(cnt == 1) return num;
        }
        return nums[0];
    }
}