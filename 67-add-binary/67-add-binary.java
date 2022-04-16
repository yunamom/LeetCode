import java.math.*;

class Solution {
    public String addBinary(String a, String b) {
        int A_binary = a.length()-1;
        int B_binary = b.length()-1;
        
        int sum = 0;
        StringBuilder builder = new StringBuilder();
        
        while(sum > 0 || A_binary >= 0 || B_binary >= 0){
            if(A_binary >= 0){
                sum += a.charAt(A_binary) - '0'; A_binary--;
            }
            if(B_binary >= 0){
                sum += b.charAt(B_binary) - '0'; B_binary--;
            }
            builder.append(sum % 2);
            sum /= 2;
        }
        return builder.reverse().toString();
    }
}