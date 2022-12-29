class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length+nums2.length;
        int[] arr = new int[length];
        
        double a=0;
        
        if(length==0){
            return a;
        }
        
        for(int i=0;i<nums1.length;i++){
            arr[i] = nums1[i];
        }
        for(int i=nums1.length;i<length;i++){
            arr[i] = nums2[i-nums1.length];
        }
        
        Arrays.sort(arr);
        
        if(length%2==1){
            a = arr[length/2];
        }else{
            a = (arr[length/2]+arr[length/2-1]);
            a /= 2;
        }
        
        return a;
    }
}