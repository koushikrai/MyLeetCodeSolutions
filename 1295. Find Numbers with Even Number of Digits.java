class Solution {
    public int findNumbers(int[] nums) {
        int count = 0; 

        for (int i = 0; i < nums.length; i++) {
            String str = String.valueOf(nums[i]);  // Convert number to string
            int len = str.length();                // Get the length of the string

            if (len % 2 == 0) {
                count++;  // Increment count if length is even
            }
        }

        return count;  // Return the final count
    }
}
