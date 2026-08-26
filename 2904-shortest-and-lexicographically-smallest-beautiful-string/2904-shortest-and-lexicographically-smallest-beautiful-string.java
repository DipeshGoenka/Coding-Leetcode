class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int f = n;
        String ans = "";
        int idx = 0;
        int cnt = 0;

        for(int i=0; i<n ; i++){
            if(s.charAt(i) == '1')cnt++;
            if(cnt == k){
                while(s.charAt(idx) != '1'){
                    idx++;
                }
             if(f > (i-idx)+1 || ans.isEmpty()){
                f = (i-idx)+1;
                ans = s.substring(idx,i+1);
             }
             else if(f == (i-idx)+1){
                if(ans.compareTo(s.substring(idx,i+1))>0){
                    ans = s.substring(idx,i+1);
                }
             }
             idx++;
             cnt--;
            }    
        }
        return ans;
    }
}