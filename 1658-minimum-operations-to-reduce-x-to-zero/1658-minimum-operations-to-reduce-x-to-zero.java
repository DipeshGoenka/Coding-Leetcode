class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum = 0;
        for(int i=0 ; i<n ; ++i){
            sum += nums[i];
        }
        int target = sum - x;
        int l=0;
        int s=0;
        int size = -1;
        for(int r=0; r<n ; ++r){
            s += nums[r];
            while(l<=r && s>target){
                s -= nums[l++];
            }
            if(s == target){
                size = Math.max(size, r-l+1);
            }
        }
      return size != -1 ? n-size : -1;
    }
}