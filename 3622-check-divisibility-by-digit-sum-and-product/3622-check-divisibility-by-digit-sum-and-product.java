class Solution {
    public boolean checkDivisibility(int n) {
       int x = n;
       int s = 0;
       int p = 1;
       while(n > 0){
        s += n%10;
        p *= n%10;
        n = n/10;
       }
       return x % (s+p) == 0;
    }
}