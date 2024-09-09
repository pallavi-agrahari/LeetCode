class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        
        int n1 = num1.length();
        int n2 = num2.length();
        int[] result = new int[n1 + n2];
        
        // Reverse loop through both numbers
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');  // Multiply digits
                int sum = mul + result[i + j + 1];  // Add to the corresponding position
                
                result[i + j + 1] = sum % 10;  // Store the unit place digit
                result[i + j] += sum / 10;  // Carry over the tens place digit
            }
        }
        
        // Convert result array to a string, skipping leading zeros
        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            if (!(sb.length() == 0 && r == 0)) {  // Skip leading zeros
                sb.append(r);
            }
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
        
    }
}