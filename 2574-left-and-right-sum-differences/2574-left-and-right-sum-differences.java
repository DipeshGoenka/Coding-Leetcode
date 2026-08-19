class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        int [] left = new int[n];
        int [] right = new int[n];
        int ls = 0;
        int rs = 0;

        for(int i=0 , j=n-1 ; i<n ; i++,j--){
            left[i] = ls;
            right[j] = rs;
            ls += nums[i];
            rs += nums[j];
        }
        for(int i = 0 ; i<n ; i++){
            res[i] = Math.abs(left[i] - right[i]);
        }
        return res;
    }
}