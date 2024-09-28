class Solution {
    private boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
               c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
         while (start < end) {
             if (isVowel(chars[start])) {
                 if (isVowel(chars[end])) {
                    char temp = chars[start];
                    chars[start] = chars[end];
                    chars[end] = temp;
                    start++;
                    end--;
                } else {
                    end--;
                }
            } else {
                start++;
            }
        }
        return new String(chars);
    }
}
