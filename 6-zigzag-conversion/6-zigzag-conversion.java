class Solution {
    public String convert(String s, int numRows) {
        if(s.length() <= 1 || numRows <= 1) return s;
        
        StringBuffer sb = new StringBuffer();
        int len = s.length();
        int rows = (numRows*2)-2;
        int count = (len % rows == 0)?len/rows:(len/rows)+1;
  
        char[] chars = s.toCharArray();
        
        for(int i=0; i<numRows; i++){
           
            for(int j=0; j<count; j++){
                int index = i+(j*rows);
                if(index < len) sb.append(chars[index]);
                
                if(i != 0 && i != numRows-1){
                    index = (rows - i) + j*rows;
                    if(index < len) sb.append(chars[index]);
                }
            }
        }     
        return sb.toString();
    }
}