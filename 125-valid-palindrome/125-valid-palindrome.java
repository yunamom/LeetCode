class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().trim().toCharArray();
        List<Character>list = new ArrayList<Character>();
        
        for(char ch:chars){
            if(ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') list.add(ch);
        }
        return pallindrome(list);
    }
    public boolean pallindrome(List<Character>list){
        int i=0,j=list.size()-1;
        
        while(i<=j){
            if(list.get(i) != list.get(j)) return false;
            i++; j--;
        }
        return true;
    }
}