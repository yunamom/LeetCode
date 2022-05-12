class Solution {
    public int singleNumber(int[] nums) {
        int N1 = 0, N2 = 0;
        
        for(int num : nums){
            N1 = ~N2 & (N1 ^ num);
            N2 = ~N1 & (N2 ^ num);
        }
        return N1;
    }
}