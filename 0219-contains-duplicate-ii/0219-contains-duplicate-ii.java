class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j] && (j-i)<=k)
        //         return true;
        //     }
        // }
        // return false;
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) return true;
            map.put(nums[i], i);
        }
        return false;
        
    }
}