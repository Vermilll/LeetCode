class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, max = 0, temp = 0;
        
        while(left<right){
            temp = Math.min(height[right],height[left])*(right-left);
            max = Math.max(temp,max);
            if(height[left]<height[right]){
                left++;
            }else if(height[left]>height[right]){
                right--;
            }else{
                left++;
                right--;
            }
        }
        
        return max;
    }
}