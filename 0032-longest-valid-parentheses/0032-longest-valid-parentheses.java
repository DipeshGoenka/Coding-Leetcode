class Solution {
    public int longestValidParentheses(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int n = s.length();
        int[] st = new int[n+1];
        int top = -1;
        int max = 0;
        st[++top] = -1;
        for(int i=0 ; i<n ; i++){
            if(s.charAt(i) == '('){
                st[++top] = i;
            }else{
                top--;
                if(top == -1){
                    st[++top] = i;
                }else{
                    max = Math.max(max,i-st[top]);
                }
            }
        }
        return max;
    }
}