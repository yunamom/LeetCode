class Solution {
    public int romanToInt(String s) {
       
        int num = roman(s.charAt(s.length()-1));
        for(int i=s.length()-2; i>=0; i--){
           
            if( roman(s.charAt(i)) < roman(s.charAt(i+1))){    
                num -= roman(s.charAt(i));
            }else{
                num += roman(s.charAt(i));
            }
        }
        return num;
    }
    public int roman(char c) {
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return 0;
    }
}