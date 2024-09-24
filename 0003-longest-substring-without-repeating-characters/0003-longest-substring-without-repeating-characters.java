class Solution {
    public int lengthOfLongestSubstring(String s) {
    int maxLength=0;
    // int[] hash = new int[256];
    // Arrays.fill(hash, 0);
    // for(int i=0;i<s.length();i++){

    //     // String sub="";
    //     Arrays.fill(hash, 0);  
    //     len = 0;   
    //     for(int j=i;j<s.length();j++){
    //         if(hash[s.charAt(j)]==1){
    //         break;
    //         }
    //         len=j-i+1;
    //         maxLength=Math.max(len,maxLength);
    //         hash[s.charAt(j)]=1;
    //     }
    // }
    // return maxLength;
    int r=0;
    int l=0;
    int[] hash = new int[256];
    Arrays.fill(hash, -1);
    while(r<s.length()){
        
        if(hash[s.charAt(r)]!=-1){
            if(hash[s.charAt(r)]>=l){
                l=hash[s.charAt(r)]+1;
            }
        }
        int len=r-l+1;
        maxLength=Math.max(len,maxLength);
        hash[s.charAt(r)]=r;
        r++;
    }
    return maxLength;
    }
}