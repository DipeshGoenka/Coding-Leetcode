class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int t=0;
        int n = gas.length;
        for(int i=0; i<n; i++){
            t += gas[i] - cost[i];
        }
        if(t<0){
            return -1;
        }
        int start = 0;
        int a = 0;
        for(int i=0; i<n ; i++){
            int gain = gas[i] - cost[i];
            if(a+gain < 0){
                start = i+1;
                a = 0;
            }else{
                a += gain;
            }
        }
        return start;
    }
}