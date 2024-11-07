class Solution {
    // This method finds the largest combination of numbers from the candidates array
    // that have at least one common set bit (1) in their binary representation
    public int largestCombination(int[] candidates) {
        // Create array to store count of 1's at each bit position (32 bits for integers)
        int[] ans = new int[32];   
        // Iterate through each number in candidates array
        for(int x : candidates) {
            find(x, ans);            // Count the number of 1's at each bit position for current number
        }   
        int res = 0;        // Find the maximum count of 1's across all bit positions
        for(int i = 0; i < 32; i++) {
            res = Math.max(res, ans[i]);
        }  
        return res;         // Return the largest possible combination
    } 
    // Helper method to count number of 1's at each bit position
    public void find(int n, int[] ans) {
        int j = 31;                // Start from rightmost bit (31st position)
        while(n > 0) {        // Continue until all bits are processed
            int a = (n & 1);                        // Get the rightmost bit using bitwise AND with 1
            ans[j] += a;                        // Add the bit count to corresponding position in ans array
            n >>= 1;               // Right shift n by 1 to process next bit
            j--;             // Move to next bit position from right to left
        }
    }
}
