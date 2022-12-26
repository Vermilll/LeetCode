class Solution {
    public String convert(String s, int numRows) {
        if(numRows==s.length()||numRows==1){
            return s;
        }
        int check=2*numRows-2;
        String answer = "";
        
        String[] str = new String[numRows];
        
        for(int i=0;i<numRows;i++){
            str[i]="";
        }
        for(int i=0;i<s.length();i++){
            String a = String.valueOf(s.charAt(i));
            int at = i%check    ;
            if(at>=numRows){
                at = check-at;
            }
            str[at] += a;
        }
        
        for(int i=0;i<numRows;i++){
            answer += str[i];
        }
        
        return answer;
    }
}