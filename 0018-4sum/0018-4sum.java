class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) return result;

        // Sort the array
        Arrays.sort(nums);

        // Traverse the array, fixing the first two elements
        for (int i = 0; i < nums.length - 3; i++) {
            // Avoid duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                // Avoid duplicates for the second element
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // Use two pointers to find the remaining two elements
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    // Calculate sum using long to avoid overflow
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        // Found a quadruplet
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Avoid duplicates for the third element
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        // Avoid duplicates for the fourth element
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        // Move the pointers
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++; // Move the left pointer to increase the sum
                    } else {
                        right--; // Move the right pointer to decrease the sum
                    }
                }
            }
        }

        return result;
    }
}