class Solution {
    public boolean isUgly(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                continue;
            }
            if (n % 3 == 0) {
                n = n / 3;
                continue;
            }
            if (n % 5 == 0) {
                n = n / 5;
                continue;
            }
            return false;
        }
        return true;
        // if (n == 0)
        // return false;
        // int[] x={2,3 ,5};
        
        // for (int prime : x){
        //     while (n % prime == 0){
        //         n /= prime;
        //     }
        // }

        // return n == 1;
    }
}