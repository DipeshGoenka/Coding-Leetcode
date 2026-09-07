class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '('){
                if(count != 0){
                    res.append(c);
                }
                count++;
            }else{
                if(count != 1){
                    res.append(c);
                }
                count--;
            }
        }
        return res.toString();
    }
}