class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        // Initialize the write pointer to the 2nd index since we allow at most 2 occurrences
        int write = 2;

        // Start reading from the 3rd element
        for (int read = 2; read < nums.length; read++) {
            // If the current number is not the same as the one at write - 2 position
            if (nums[read] != nums[write - 2]) {
                // Write the current number to the write position
                nums[write] = nums[read];
                // Move the write pointer forward
                write++;
            }
        }

        return write;
    }
}