class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int ans[] = new int[2];
        ans[0] = 1;
        for(char c : s.toCharArray()){
            int temp = widths[c - 'a'];
            if(ans[1] + temp > 100){
                ans[1] = temp;
                ans[0]++;
            }else{
                ans[1] += temp;
            }
        }
        return ans;
    }
}