import java.math.*;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger A_binary = new BigInteger(a, 2);
        BigInteger B_binary = new BigInteger(b, 2);
        
        BigInteger sum = A_binary.add(B_binary);
        
        return sum.toString(2);
    }
}