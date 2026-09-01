class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        Arrays.sort(nums);
        int temp = 1;
        for(int i=1;i<n;i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i-1] != i){
                temp = i;
            }
        }
        if(max+1 == n && temp == 1 ){
            return true;
        }else {
            return false;
        }
    }
}