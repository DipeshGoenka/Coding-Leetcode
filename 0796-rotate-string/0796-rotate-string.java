class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        if(s.equals(goal)) return true;

        for(int i=0 ; i<goal.length()-1 ; i++){
            goal = goal.charAt(goal.length()-1) + goal.substring(0,goal.length()-1);
               if(s.equals(goal)) return true;
        }
        return false;
    }
}