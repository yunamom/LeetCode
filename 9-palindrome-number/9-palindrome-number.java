class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int palindrome = 0;
        while(num > 0){          
            palindrome=palindrome*10+num%10;
            num/=10;
        }
        if(x == palindrome) return true;
        
    return false;   

    }   
}