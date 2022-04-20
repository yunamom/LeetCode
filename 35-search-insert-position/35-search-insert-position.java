import java.util.*;
class Solution {
    public int searchInsert(int[] nums, int target) {
        TreeMap<Integer,Integer>map = new TreeMap<>();
        map.put(target,target);
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],nums[i]);
        }
        
        int answer = 0;
        for(Integer key : map.keySet()){
            if(target == map.get(key)) return answer;
            answer ++;
        }
        return 0;
    }
}