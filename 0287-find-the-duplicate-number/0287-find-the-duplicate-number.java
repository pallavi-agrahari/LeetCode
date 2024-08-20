class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int slow=nums[0];
        int fast=nums[0];
        do{
            fast=nums[nums[fast]];
            slow=nums[slow];
        }while(slow!=fast);
        fast=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}