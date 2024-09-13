class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        int maxlength=0;
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        for(int num:st){
            if(!st.contains(num-1)){
            int currNum=num;
            int currStreak=1;
            while(st.contains(currNum+1)){
                currNum++;
                currStreak++;
            }
            maxlength=Math.max(maxlength, currStreak);
            }
            
        }
        return maxlength;
    }
}