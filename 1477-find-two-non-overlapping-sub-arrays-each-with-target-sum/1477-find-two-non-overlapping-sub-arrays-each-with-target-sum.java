class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int [] min = new int[n];
        int l = 0 , sum = 0;
        int ans = Integer.MAX_VALUE;
        int best = Integer.MAX_VALUE;
        
        for(int i =0 ; i <n ; i++){
            sum += arr[i];
            while(sum > target){
                sum -= arr[l++];
            }
            if(sum == target){
                int cur = i-l+1;

                if(l>0 && min[l-1] != Integer.MAX_VALUE){
                    ans = Math.min(ans,cur + min[l-1]);
                }
                best = Math.min(best , cur);
            }
            min[i] = best;
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}