class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index1 = 0, index2 = 0;
        int answer1 = 0, answer2 = 0;
        
        for(int i=0;i<=(nums1.length+nums2.length)/2;i++){
            answer2 = answer1;
            
            if(index1==nums1.length){
                answer1 = nums2[index2];
                index2++;
            }else if(index2==nums2.length){
                answer1 = nums1[index1];
                index1++;
            }else if(nums1[index1]<nums2[index2]){
                answer1 = nums1[index1];
                index1++;
            }else{
                answer1 = nums2[index2];
                index2++;
            }
        }
        
        if((nums1.length+nums2.length)%2==0){
            return (double)(answer1+answer2)/2;
        }
        
        return answer1;
    }
}