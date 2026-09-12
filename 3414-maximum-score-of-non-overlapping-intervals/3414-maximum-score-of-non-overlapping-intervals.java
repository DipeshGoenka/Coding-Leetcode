class Solution {
    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();
        int [][] a = new int[n][4];
        for(int i=0 ; i<n ; i++){
            a[i][0] = intervals.get(i).get(0);
            a[i][1] = intervals.get(i).get(1);
            a[i][2] = intervals.get(i).get(2);
            a[i][3] = i;
        }
        Arrays.sort(a,(x,y) -> x[1]!= y[1] ? x[1]-y[1] : x[0]-y[0]);
        long[][] dp = new long[n+1][5];
        List<Integer>[][] ans = new ArrayList[n+1][5];

        for(int i=0 ; i<=n ; i++)
            for(int k=0 ; k<=4 ; k++)
             ans[i][k] = new ArrayList<>();

        for(int i=1 ; i<=n ; i++){
            for(int k=0 ; k<=4 ; k++){
                dp[i][k] = dp[i-1][k];
                ans[i][k] = new ArrayList<>(ans[i-1][k]);
            }
            int p = find(a,i-1);
            for(int k =1 ; k<=4 ; k++){
                long score = dp[p][k-1] + a[i-1][2];
                List<Integer> list = new ArrayList<>(ans[p][k-1]);
                list.add(a[i-1][3]);
                Collections.sort(list);

                if(score > dp[i][k] || score == dp[i][k] && smaller(list,ans[i][k])){
                    dp[i][k] = score;
                    ans[i][k] = list;
                }
            }
        }   
         List<Integer> res = ans[n][0];
         for(int k=1 ; k<=4 ; k++)
           if(dp[n][k] > dp[n][0] || dp[n][k] == dp[n][0] && smaller(ans[n][k],res))
           res = ans[n][k];

           return res.stream().mapToInt(x->x).toArray();
    }
    int find(int[][] a ,int i){
        int l = 0 , r=i;
        while(l<r){
            int m = (l+r)/2;
            if(a[m][1] < a[i][0])
            l = m+1;
            else
            r=m;
        }
        return l;
    }
    boolean smaller(List<Integer> a , List<Integer> b){
        for(int i=0 ; i<a.size() ; i++){
            if(!a.get(i).equals(b.get(i)))
            return a.get(i) < b.get(i);
        }
        return false;
}
}