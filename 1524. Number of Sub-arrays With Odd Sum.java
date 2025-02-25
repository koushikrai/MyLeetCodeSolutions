class Solution {
    public int numOfSubarrays(int[] arr) {
        long oddCount = 0, evenCount = 1, prefixSum = 0, result = 0;
        int MOD = 1_000_000_007;

        for (int a : arr) {
            prefixSum += a;
            if (prefixSum % 2 == 0) {
                result += oddCount;  // Even prefix means odd subarrays come from previous odd counts
                evenCount++;
            } else {
                result += evenCount; // Odd prefix means odd subarrays come from previous even counts
                oddCount++;
            }
            result %= MOD;
        }

        return (int) result;
    }
}
