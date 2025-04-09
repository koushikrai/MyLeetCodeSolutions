import java.util.HashSet;

class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> unique = new HashSet<>();

        for (int num : nums) {
            if (num > k) {
                unique.add(num);
            }
            if (num<k){
                return -1;
            }
        }
        
        return unique.size();  // number of distinct values greater than k
    }
}
