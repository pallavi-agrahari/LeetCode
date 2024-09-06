class Solution {
    public int sumofDigits(int num){
        int sum =0;
        while(num>0){
            int lastDigit=num%10;
            sum+=lastDigit;
            num/=10;
        }
        return sum;
    }
    public int addDigits(int num) {
        int sum=sumofDigits(num);
        // if(sum<=9){
        //     return sum;
        // }
        // else{
            while(sum>=10){
               sum=sumofDigits(sum);
            }
        // }
        return sum;
        
    }
}