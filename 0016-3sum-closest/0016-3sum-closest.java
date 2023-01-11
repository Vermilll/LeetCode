class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0]+nums[1]+nums[2], sum, dif1, dif2;
        
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            
            while(j<k){
                sum = nums[i] + nums[j] + nums[k];
                
                dif1 = target - ans;
                if(dif1 < 0) dif1 = -dif1;
                
                dif2 = target - sum;
                if(dif2 < 0) dif2 = -dif2;
                
                if(dif1>=dif2) ans = sum;
                
                if(target-sum >= 0) j++;
                if(target-sum <= 0) k--;
                
                if(ans == target) break;
            }
        }
        return ans;
    }
}