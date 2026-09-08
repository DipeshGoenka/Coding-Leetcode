class Solution {
    public int strStr(String haystack, String needle) {
        StringBuilder s = new StringBuilder(haystack);
        return s.indexOf(needle);
    }
}