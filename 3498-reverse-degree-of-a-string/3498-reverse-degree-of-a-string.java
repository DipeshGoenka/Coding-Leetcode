class Solution {
    public int reverseDegree(String s) {
        int deg = 0;
        int n = s.length();
        for(int i=0 ; i<n; i++){
            char c = s.charAt(i);
            int a = c - 'a';
            int idx = 26 - a;
          deg += idx * (i+1);

        }
        return deg;    }
}