class Solution {
    public static int[] reverse(int [] arr, int i, int j){
        int n=arr.length;
        // int i=0;
        // int j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    public void nextPermutation(int[] nums) {
        int ind=-1;
        int n = nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
         reverse(nums, 0, n-1);
         return;
        }

        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        // for(int i=ind+1;i<n;i++){
            reverse(nums, ind+1, n-1);
        // }
        return;
    }
}