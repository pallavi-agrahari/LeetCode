class Solution {
   private static final String[] ROMAN_SYMBOLS = {
        "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };
    private static final int[] VALUES = {
        1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };
    
    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < VALUES.length; i++) {
            while (num >= VALUES[i]) {
                result.append(ROMAN_SYMBOLS[i]); 
                num -= VALUES[i];  // Subtract the value from the number
            }
        }
        return result.toString();
}
}