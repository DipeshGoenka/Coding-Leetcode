class Solution {
    public long countCommas(long n) {
        long a = 0;
        for(long x=1000; x<=n ; x *= 1000){
            a += n-x+1;
        }
        return a;
    }
}