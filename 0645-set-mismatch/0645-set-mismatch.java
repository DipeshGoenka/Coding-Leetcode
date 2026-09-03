class Solution {
    public int[] findErrorNums(int[] nums) {
        int  n = nums.length;
        int [] res = new int[2];
        boolean [] b = new boolean[10001];
        int sum = 0;
        for(int a : nums){
            if(b[a]){
                res[0] = a;
            }
            b[a] = true;
            sum += a;
        }
        res[1] = (n*(n+1)/2)- sum + res[0];
        return res;
    }
}