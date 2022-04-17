class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        String answer = "";
        if(x == 0) return true;
        if(num%10 == 0) return false;      
        
        while(num > 0){
            answer += num%10;
            num/=10;
        }
        
        return answer.equals(x+"");
    }   
}