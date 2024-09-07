class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;

        // Binary search to find the first position where the missing count >= k
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missingBeforeMid = arr[mid] - (mid + 1);
            
            if (missingBeforeMid < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // At this point, left is the first index where missing_before_mid >= k
        // The k-th missing number is left + k because we've missed (left) numbers up to arr[left - 1]
        return left + k;
    }
}