class Solution {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        
        int n_2 = 1; 
        int n_1 = 2; 
        int num = 0;   
        for (int i = 3; i <= n; i++) {
            num = n_2 + n_1; 
            n_2 = n_1;
            n_1 = num;
        }
        return num;
    }
}