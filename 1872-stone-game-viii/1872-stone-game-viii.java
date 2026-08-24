class Solution {
    public int solve(int [] pre , int i){
        if(i == pre.length-1){
            return pre[i];
        } 
        int next = solve(pre,i+1);
        int t = pre[i] - next;
        int skip = next;
        return Math.max(t,skip);
    }

    public int stoneGameVIII(int[] stones) {
        int n = stones.length;
        int [] pre = new int[n];
        pre[0] = stones[0];
        for(int i=1 ; i<n ; i++){
            pre[i] = pre[i-1] + stones[i];
        }
        return solve(pre,1);
    }
}