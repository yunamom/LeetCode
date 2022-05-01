class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];       
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int key:nums){
            map.put(key,map.getOrDefault(key, 0)+1);            
        }
        for(Integer i : map.keySet()){
            if(map.get(i) == 1) return i;
        }
        return 0;
    }
}