class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int a = 0;
        int xor = 0;
        for(int i : nums){
            xor ^= i;
            if(i != 0){
                a++;
            }
        }
            if(xor != 0){
                return n;
            }
            if(a == 0){
                return 0;
            }
        return n-1;
    }
}