class Solution {
    public int characterReplacement(String s, int k) {
    //    int maxlen=0;
    //    for(int i=0;i<s.length();i++){
    //     int hash[]=new int[26];
    //     Arrays.fill(hash,0);
    //     int maxf=0;
    //     for(int j=i;j<s.length();j++){
    //         hash[s.charAt(j)-'A']++;
    //         maxf=Math.max(maxf,hash[s.charAt(j)-'A']);
    //         int changes=(j-i+1)-maxf;
    //         if(changes<=k){
    //             int len=j-i+1;
    //             maxlen=Math.max(len,maxlen);
    //         }
    //         else{
    //             break;
    //         }
    //     }
    //    }
    //    return maxlen;

        int l=0;
        int r=0;
        int maxlen=0;
        int maxf=0;
        int hash[]=new int[26];
        Arrays.fill(hash, 0);
        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,hash[s.charAt(r)-'A']);
            while(((r-l+1)-maxf)>k){
                hash[s.charAt(l)-'A']--;
                // maxf=0;
                // for(int i=0;i<26;i++){
                //     maxf=Math.max(maxf,hash[s.charAt(r)-'A']);
                //     l=l+1;
                // }
                l++;
            }
            if((r-l+1)-maxf<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;
    }
}