class Solution {
    public int distinctSubseqII(String s) {
        long mod = 1000000007L;
        long a = 1;
        long [] l = new long[26];
        for(int i=0 ; i<s.length() ; i++){
            int c = s.charAt(i) - 'a';
            long b = (2*a - l[c]) % mod;
            if(b<0){
                b += mod;
            }
            l[c] = a;
            a = b;
        }
     return (int) ((a-1+mod) % mod);
    }
}