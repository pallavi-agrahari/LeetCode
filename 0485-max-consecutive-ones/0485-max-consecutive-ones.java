class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int r=0;
    int len=0;
    int maxlen=0;
    while(r<nums.length){
       
        if(nums[r]==1){
            len++;
            maxlen=Math.max(len,maxlen);
        }
        else{
            len=0;
        }
        r++;
    }     
    return maxlen;
    }
}