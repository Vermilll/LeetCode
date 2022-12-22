class Solution {
    public String longestPalindrome(String s) {
        String max="";
        int times=0;
        int length=s.length();
        
        for(int i=0;i<length;i++){
            if(length-1-i>i){
                times=i;
            }else{
                times=length-1-i;
            }
            
            String temp = String.valueOf(s.charAt(i));
            
            for(int j=1;j<times+1;j++){
                if(s.charAt(i-j)==s.charAt(i+j)){
                    temp = String.valueOf(s.charAt(i-j)) + temp + String.valueOf(s.charAt(i+j));
                }else{
                    break;
                }
            }
            
            if(temp.length()>max.length()){
                max=temp;
            }
        
            temp = "";
            
            for(int j=0;j<times+1;j++){
                if(length>i+j+1){
                    if(s.charAt(i-j)==s.charAt(i+j+1)){
                        temp = String.valueOf(s.charAt(i-j)) + temp + String.valueOf(s.charAt(i+j+1));
                    }else{
                      break;
                    }
                }
            }
            
            if(temp.length()>max.length()){
                max=temp;
            }
            
        }
        return max;
    }
}