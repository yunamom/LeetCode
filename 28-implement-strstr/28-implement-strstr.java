class Solution {
    public int strStr(String haystack, String needle) {
        String check = haystack.replace(needle,",");
        if(haystack.equals(needle)) return 0;
        
        for(int i=0; i<check.length(); i++){
            char c = check.charAt(i);
            if(c == ',') return i;
        }
        return -1;
    }
}