class Solution {
    public int strStr(String haystack, String needle) {
      int h = haystack.length();
      int n = needle.length();
      for(int i=0 ; i<=h-n ; i++){
        boolean isPresent = true;
        for(int j = i,k=0 ; k<n ; j++,k++){
            if(haystack.charAt(j) != needle.charAt(k)){
                isPresent = false;
                break;
            }
        }
        if(isPresent)
        return i;
      }
      return -1;
    }
}