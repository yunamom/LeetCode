import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max = 0;
        int answer = 0;
        int i=0, j=0;
        int length = s.length();
        
        HashSet<Character> set = new HashSet<>();
        
        while(j < length){
            if(i > j) break;
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = j - i;
                answer = (max > answer)?max:answer;
                continue;
            }
            set.remove(s.charAt(i++));
        }
        return answer;
    }
}