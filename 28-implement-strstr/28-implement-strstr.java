class Solution {
    public int strStr(String haystack, String needle) {        
        if(haystack.equals(needle)) return 0;        
 
        return haystack.indexOf(needle);
    }
}