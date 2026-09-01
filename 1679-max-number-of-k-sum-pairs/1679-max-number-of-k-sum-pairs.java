class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
        int l=0 , r =nums.length-1;
        while(l<r){
            int sum = nums[l] + nums[r];
            if(sum == k){
                ans++;
                l++;
                r--;
            }else if(sum<k){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
}