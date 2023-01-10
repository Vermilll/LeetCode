class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            if(i != 0 && nums[i]==nums[i-1]){
                continue;
            }
            
            int j = i+1;
            int k = nums.length-1;
            
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                }
                if(sum <= 0){
                    while(nums[j++] == nums[j] && j<k){}
                }
                if(sum >= 0){
                    while(nums[k--] == nums[k] && j<k){}
                }
            }
        }
        return ans;
    }
}