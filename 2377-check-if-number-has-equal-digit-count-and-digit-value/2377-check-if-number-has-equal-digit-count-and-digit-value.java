class Solution {
    public boolean digitCount(String num) {
        int n = num.length();
        int[] count = new int[10];  
        
        // Count the occurrence of each digit in the string
        for (int i = 0; i < n; i++) {
            count[num.charAt(i) - '0']++;
        }
        
 // Check if for each index i, num[i] equals the count of digit i
        for (int i = 0; i < n; i++) {
            if (count[i] != (num.charAt(i) - '0')) {
                return false;
            }
        }
    return true;
}
}