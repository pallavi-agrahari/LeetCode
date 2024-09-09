class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;  // Overflow case
        }

        // Determine the sign of the quotient
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert both dividend and divisor to positive numbers
        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long) divisor);

        int quotient = 0;

        // Subtract divisor from dividend using bit shifting
        while (dividendL >= divisorL) {
            long tempDivisor = divisorL;
            int multiple = 1;

            // Find the largest multiple such that (divisorL * multiple) <= dividendL
            while (dividendL >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            // Subtract the largest multiple of divisor from dividend
            dividendL -= tempDivisor;
            quotient += multiple;
        }

        // Apply the sign to the result
        return negative ? -quotient : quotient;
    }
}