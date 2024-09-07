class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder answer = new StringBuilder();
        // Initialize carry to 0
        int carry = 0;

        // Process both strings from the end till both strings are processed or there is no carry left
        while(i >= 0 || j >= 0 || carry > 0) {
            // Get digit from string num1 if available, else use 0
            int digit1 = i < 0 ? 0 : num1.charAt(i) - '0';
            // Get digit from string num2 if available, else use 0
            int digit2 = j < 0 ? 0 : num2.charAt(j) - '0';
            // Calculate sum of digits and carry
            carry += digit1 + digit2;
            // Append the unit digit of sum to the answer
            answer.append(carry % 10);
            // Calculate new carry
            carry /= 10;
            // Move to the next digits in each string
            --i;
            --j;
        }

        // The answer is in reverse order, so reverse it to get the correct result
        answer.reverse();
        // Convert StringBuilder to String and return
        return answer.toString();
    }
}