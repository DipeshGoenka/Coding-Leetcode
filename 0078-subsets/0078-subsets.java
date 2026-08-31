class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for(int n : nums){
            int a = res.size();
            for(int i=0 ;i<a ;i++){
                List<Integer> newset = new ArrayList<>(res.get(i));
                newset.add(n);
                res.add(newset);
            }
        }
        return res;
    }
}