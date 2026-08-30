class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = 0 , max = 0;
        for(int i=0 ;i<n ;i++){
            if(nums[i] < nums[min]){
                min = i;
            }
            if(nums[i] > nums[max]){
                max = i;
            }
        }
        int l = Math.min(min,max);
        int r = Math.max(min,max);
        int a = l + 1 + (n-r);
        return Math.min(r+1,Math.min(n-l,a));
    }
}