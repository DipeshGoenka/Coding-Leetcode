class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int c1 = 0 ;
        int c2 = 0;
        int s1 = 0 ;
        int s2 = 0;
        for(int i=0 ; i<n/2 ; i++){
            if(num.charAt(i) == '?'){
                c1++;
            }else{
                s1 += num.charAt(i) - '0';
            }
        }
        for(int i=n/2 ; i<n ;i++){
            if(num.charAt(i) == '?'){
                c2++;
            }else{
                s2 += num.charAt(i) - '0';
            }
        }
        return (c1+c2)%2 == 1 || 2*(s1-s2)!=9*(c2-c1);

    }
}