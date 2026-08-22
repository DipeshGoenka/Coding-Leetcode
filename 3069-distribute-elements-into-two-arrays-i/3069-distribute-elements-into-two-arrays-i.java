class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int [] a1= new int[n];
        int [] a2= new int[n];
        int s1 = 1;
        int s2 = 1;
      a1[0] = nums[0];
      a2[0] = nums[1];

      for(int i=2 ; i<n ; i++){
        if(a1[s1-1] > a2[s2-1]){
            a1[s1++] = nums[i];
        }else {
             a2[s2++] = nums[i];
        }
      }
      int [] res = new int[n];
      int idx = 0;
      for(int i=0 ; i<s1; i++){
        res[idx++] = a1[i];
      }
      for(int i=0 ; i<s2 ; i++){
        res[idx++] = a2[i];       
      }
      return res;
    } 
}