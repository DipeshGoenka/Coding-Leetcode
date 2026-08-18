class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer>set = new HashSet<>();
        for(int i : arr){
            if(i==0 && set.contains(i))
                return true;
                set.add(i); 
        }
        for(int i : arr){
            if(set.contains(2*i) && i!=0)
                return true;
        }
        return false;
    }
}