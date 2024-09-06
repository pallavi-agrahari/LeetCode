class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=1;j<nums.length;j++){
        //         if(nums[i]==nums[j] && (Math.abs(i-j))<=k){
        //             return true;
        //         }
        //     }
        //     return false;
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