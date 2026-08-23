class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        for(int i=0 ; i<jewels.length() ; i++){
            char ch = jewels.charAt(i);
            for(int j=0 ; j<stones.length() ; j++){
                if(ch == stones.charAt(j)){
                    c++;
                }
            }
        }
        return c;
    }
}