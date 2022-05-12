class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            if(hash.containsKey(target - nums[i])){
                res[0] = i;
                res[1] = hash.get(target - nums[i]);
                break;
            }else{
                hash.put(nums[i], i);
            }
        }
        return res;
    }
}