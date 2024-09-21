class Solution {
    public int reverse(int x) {
        // int reverseNum=0;
        // int lastdigit=0;
        
        // while(x!=0){
        //     lastdigit=x%10;
            
        //     reverseNum=(reverseNum*10)+lastdigit;
        //     x/=10;
        // }
        // //Range of int
        // int mn = -2147483648, mx =  2147483647;
        
        // //Checking if is in range of int
        // if(reverseNum > mn && reverseNum < mx){
        //   return reverseNum;
        // }
      
        // return 0;
         int ans = 0;
        for (; x != 0; x /= 10) {
            if (ans < Integer.MIN_VALUE / 10 || ans > Integer.MAX_VALUE / 10) {
                return 0;
            }
            ans = ans * 10 + x % 10;
        }
        return ans;
    }
}