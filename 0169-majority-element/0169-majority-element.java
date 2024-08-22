class Solution {
    public int majorityElement(int[] nums) {
    // Integer ans = null;
    // int count = 0;

    // for (final int num : nums) {
    //   if (count == 0)
    //     ans = num;
    //   count += num == ans ? 1 : -1;
    // }

    // return ans;
    HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/2){
               return key;
            }

        }
        return 0;
        
    }
}