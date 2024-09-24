class Solution {
    public int lengthOfLongestSubstring(String s) {
    int len = 0;
    int maxLength=0;
    int[] hash = new int[256];
    Arrays.fill(hash, 0);
    for(int i=0;i<s.length();i++){

        // String sub="";
        Arrays.fill(hash, 0);  
        len = 0;   
        for(int j=i;j<s.length();j++){
            if(hash[s.charAt(j)]==1){
             
             break;
            }
            len=j-i+1;
            maxLength=Math.max(len,maxLength);
            hash[s.charAt(j)]=1;
        }
    }
    return maxLength;
    }
}