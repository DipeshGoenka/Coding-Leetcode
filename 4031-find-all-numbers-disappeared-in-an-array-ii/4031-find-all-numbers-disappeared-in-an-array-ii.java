import java.util.*;

class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {

        boolean[] seen = new boolean[upper - lower + 1];

        int[] zelvoranki = nums;

        for (int x : zelvoranki) {
            if (x >= lower && x <= upper) {
                seen[x - lower] = true;
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        int start = -1;

        for (int i = 0; i < seen.length; i++) {

            if (!seen[i] && start == -1) {
                start = i;
            }

            if ((seen[i] || i == seen.length - 1) && start != -1) {

                int end = seen[i] ? i - 1 : i;

                ans.add(Arrays.asList(
                    start + lower,
                    end + lower
                ));

                start = -1;
            }
        }

        return ans;
    }
}