class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n / 2;
        }
        if (n < 0){ 
            double y=myPow(x, -n);
            return 1 / y;
        }
        if (n % 2 == 1) return x * myPow(x, n - 1);
        return myPow(x * x, n / 2);
    }
}