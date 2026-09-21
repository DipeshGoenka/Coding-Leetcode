class Solution {
    public long[] resultArray(int[] nums, int k) {
        long [] res = new long[k];
        long [] c = new long[k];
        for(int x : nums){
            int mod = x%k;
            long [] tmp = new long[k];
            for(int i=0 ; i<k ; i++){
                int newMod = (i * mod) %k;
                tmp[newMod] += c[i];
                res[newMod] += c[i];
            }
            res[mod]++;
            tmp[mod]++;
            c = tmp;
        }
        return res;
    }
}