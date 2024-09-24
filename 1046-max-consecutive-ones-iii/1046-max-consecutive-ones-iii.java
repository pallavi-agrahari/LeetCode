class Solution {
    public int longestOnes(int[] nums, int k) {
    //     int maxlen=0;
        
    //     for(int i=0;i<nums.length;i++){
    //         int zeros=0;
    //         for(int j=i;j<nums.length;j++){
               
    //             if(nums[j]==0){
    //                 zeros++;
    //             }
    //             if(zeros<=k){
    //                 int len=j-i+1;
    //                 maxlen=Math.max(len,maxlen);
    //             }
    //             else{
    //                 break;
    //             }
    //         }
           
    //     }
    //     return maxlen;

    //     }
    // }
        int l=0;
        int r=0;
        int zeros=0;
        int maxlen=0;
        while(r<nums.length){
            if(nums[r]==0){
                zeros++;
            }
            if(zeros>k){
                if(nums[l]==0) zeros--;
                l++;
            }
            
            if(zeros<=k){
                int len=r-l+1;
                maxlen=Math.max(len,maxlen);
            }
            r++;
        }
       return maxlen; 
    }
}

