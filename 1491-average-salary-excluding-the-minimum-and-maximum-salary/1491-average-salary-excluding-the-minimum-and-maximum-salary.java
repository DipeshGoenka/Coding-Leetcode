class Solution {
    public double average(int[] salary) {
     double min = Integer.MAX_VALUE;
     double max = Integer.MIN_VALUE;
     double sum = 0;
     for(int s : salary){
        if(max < s){
            max = s;
        }
        if(min > s){
            min = s;
        }
        sum += s;
     }
     double avg = (sum-min-max)/(salary.length-2);
     return avg;
    }
}