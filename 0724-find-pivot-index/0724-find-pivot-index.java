class Solution {
    public int pivotIndex(int[] nums) {
        int l=0 , s=0;
        for(int num : nums){
            s += num;
        }
        for(int i=0 ; i<nums.length ; i++){
            int num = nums[i];
            int r = s - num - l;
            if(l == r){
                return i;
            }
            l += num;
        }
        return -1;
    }
}