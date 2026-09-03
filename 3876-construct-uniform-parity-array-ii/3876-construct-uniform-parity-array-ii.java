class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean b = false;
        int even = Integer.MAX_VALUE;
        int odd = Integer.MAX_VALUE;
        for(int i=0;i<nums1.length ;i++){
            if(nums1[i]%2 != 0){
                b = true;
                odd = Math.min(odd,nums1[i]);
            }else{
                even = Math.min(even , nums1[i]);
            }
        } 
        if(b == false){
            return true;
        }
        if(even > odd){
            return true;
        }
        return false;
    }
}