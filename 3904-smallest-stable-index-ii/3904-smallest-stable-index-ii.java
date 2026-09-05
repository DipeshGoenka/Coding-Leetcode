class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int [] a = new int [n];
        a[n-1] = nums[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            a[i] = Math.min(nums[i],a[i+1]);
        }
        int b = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            b = Math.max(b,nums[i]);
            if(b-a[i] <= k){
                return i;
            }
        }
        return -1;
    }
}