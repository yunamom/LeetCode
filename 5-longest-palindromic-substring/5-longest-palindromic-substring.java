class Solution {
    int start, maxLen;
	
	public String longestPalindrome(String s) {
        int len = s.length();
        if(len < 2) return s;
        
        for(int i=0; i<len-1; i++) {
        	extendPalindrome(s, i, i);
        	extendPalindrome(s, i, i+1);
        }
        return s.substring(start, start+maxLen);
		
    }
	public void extendPalindrome(String s, int L, int R) {
		while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--; R++;
		}
		if(maxLen < R - L - 1) {
			start = L + 1;
			maxLen = R - start;
		}
	}
}