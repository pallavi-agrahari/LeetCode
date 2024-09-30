class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int start = 0;
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
               for (int j = i - 1; j >= start; j--) {
                    result.append(s.charAt(j));
                }
               
                if (i != s.length()) {
                    result.append(' ');
                }
                start = i + 1;
            }
        }
        
        return result.toString();
    }
}