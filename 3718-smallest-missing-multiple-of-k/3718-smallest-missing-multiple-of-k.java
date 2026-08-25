class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean [] pres = new boolean[101];
        for(int n : nums){
            if(n%k == 0){
                pres[n] = true;
            }
        }
        int x = k;
        while(x<=100){
            if(!pres[x]){
                return x;
            }
            x += k;
        }
        return x;
    }
}