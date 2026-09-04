class Solution {
    public boolean isPerfectSquare(int num) {
        int s = 1;
        int e = num;
        while(s <= e){
            int m = s + (e-s)/2;
            long sq = (long)m*m;
            if(sq == num){
                return true;
            }
            else if(sq > num){
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return false;
    }
}