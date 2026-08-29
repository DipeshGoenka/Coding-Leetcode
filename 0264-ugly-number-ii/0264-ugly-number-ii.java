class Solution {
    public int nthUglyNumber(int n) {
        int [] a = new int[n+1];
        a[1] = 1;
        int p2=1 , p3=1 , p5=1;
        for(int i=2 ;i<=n ;i++){
            int f1 = 2*a[p2];
            int f2 = 3*a[p3];
            int f3 = 5*a[p5];
            int min = Math.min(f1,Math.min(f2,f3));
            a[i] = min;

         if(min == f1){
            p2++;
         }
         if(min == f2){
            p3++;
         }
         if(min == f3){
            p5++;
         }
        }
        return a[n];
    }
}