class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        
        // Iterate over the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            int currentNum = nums[i];
            
            // Store the previous maxProduct to compute the new minProduct
            int tempMax = maxProduct;
            
            // Calculate the new maxProduct and minProduct
            maxProduct = Math.max(currentNum, Math.max(currentNum * maxProduct, currentNum * minProduct));
            minProduct = Math.min(currentNum, Math.min(currentNum * tempMax, currentNum * minProduct));
            
            // Update the result if the current maxProduct is the largest we've seen
            result = Math.max(result, maxProduct);
        }
        return result;
    }
}