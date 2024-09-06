class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0; // Initialize result to 0
      
    // Iterate over each character in the columnTitle string
        for (char ch : columnTitle.toCharArray()) {
    // Convert character to corresponding number ('A' -> 1, 'B' -> 2, ..., 'Z' -> 26)
            int numericValue = ch - 'A' + 1;
          
    // Update the result by shifting it 26 places (base 26 number system) and adding   the numeric value of the current character
            result = result * 26 + numericValue;
        }
      
    // Return the computed numeric value of the column title
        return result;
    }
}