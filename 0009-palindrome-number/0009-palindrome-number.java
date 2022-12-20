class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
    
        List<Integer> set = new ArrayList<>();
        int temp;

        while(x!=0){
            set.add(x%10);
            x/=10;
        }
        for(int i=0;i<set.size()+1/2;i++){
            if(set.get(i)!=set.get(set.size()-i-1)){
                return false;
            }
        }
        return true;
    }
}