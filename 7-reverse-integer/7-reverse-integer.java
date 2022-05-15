class Solution {
    public int reverse(int x) {
        int rev = 0;
		
		while(x>9 || x<-9) {
			rev = rev*10 + x%10;
			x/=10;
		}          
		
		return (rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10)?0:rev*10+x;
    }
}