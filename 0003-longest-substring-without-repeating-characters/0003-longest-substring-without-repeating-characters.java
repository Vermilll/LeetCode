public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int i=0, j=0;
        int length = s.length();
        HashSet<Character> stringSet = new HashSet<>();

        while (j < length) {
            if(i > j){
                break;
            }
            if (!stringSet.contains(s.charAt(j))){
                stringSet.add(s.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
                continue;
            }
            stringSet.remove(s.charAt(i++));

        }

        return maxLength;
    }

}