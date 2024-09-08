class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int sum = 0;
        
        // Step 2: Iterate through the sorted array and sum up every second element
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i]; // Sum up the minimum of each pair (which is the first element of the sorted pairs)
        }
        
        return sum;
        
    }
}