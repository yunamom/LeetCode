class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
		
		for(int i=0; i<l; i++) {
			for(int j=i+1; j<l; j++) {
				if(nums[i] + nums[j] == target) {
					int answer[] = {i,j};
					return answer;
				}
			}
		}
		return null;	
    }
}