class Solution {
    public int romanToInt(String s) {
        int now = 0, bef = 1001, ans = 0;
        
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'I':
                    now = 1;
                    break;
                case 'V':
                    now = 5;
                    break;
                case 'X':
                    now = 10;
                    break;
                case 'L':
                    now = 50;
                    break;
                case 'C':
                    now = 100;
                    break;
                case 'D':
                    now = 500;
                    break;
                case 'M':
                    now = 1000;
                    break;
            }
            if(now>bef){
                ans += now-(2*bef);
                bef = now;
            }else{
                ans += now;
                bef = now;
            }
        }
        
        return ans;
    }
}