class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1;  // Start with 1, since 1 is a divisor of every number

        // Loop from 2 to the square root of n to find divisors
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;  // Add the divisor
                if (i != num / i) {
                    sum += num / i;  // Add the corresponding divisor
                }
            }
        }

        // Check if the sum of divisors equals n
        return sum == num;
    }
}