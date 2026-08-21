class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [] a = new int[n];
        a[0] = grid[0][0];
        for(int i=1 ; i<n ; i++){
            a[i] = grid[0][i] + a[i-1];
        }
        for(int i=1 ; i<m ; i++){
            a[0] += grid[i][0];
            for(int j=1 ; j<n ; j++){
                a[j] = grid[i][j] + Math.min(a[j-1], a[j]);
            }
        }
        return a[n-1];
    }
}