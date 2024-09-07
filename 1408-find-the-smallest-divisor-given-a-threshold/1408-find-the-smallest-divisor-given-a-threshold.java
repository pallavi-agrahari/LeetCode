class Solution {
    public int max(int[] arr){
        int m=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;
    }
    

    // Function to compute the sum of division results for a given divisor
    private int computeSum(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor;  // Equivalent to ceil(num / divisor)
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        // int n=max(nums);
        // for(int d=1;d<=n;d++){
        //     int sum=0;
        //     for(int i=0;i<nums.length;i++){
        //         sum+=(nums[i]+d-1)/d;
        //     }
        //     if(sum<=threshold){
        //         return d;
        //     }
        // }
        // return -1; 

        int left = 1;                     // Smallest possible divisor
        int right = max(nums);         // Largest possible divisor (max element in nums)

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (computeSum(nums, mid) > threshold) {
                left = mid + 1;           
            } else {
                right = mid;              
            }
        }

        return left; 
    }
}