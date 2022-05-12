class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=2; i<nums.length; i+=3){
            int answer = 0;
            
            answer ^= nums[i];
            answer ^= nums[i-1];
            answer ^= nums[i-2];
            
            if(answer != nums[i]) return answer;                   
        }
        return nums[nums.length-1];
    }
}