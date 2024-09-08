class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        
        // Process the string in chunks of 2k
        for (int start = 0; start < arr.length; start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, arr.length - 1); // Reverse the first k characters
            
            // Reverse the characters between i and j
            while (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        
        return new String(arr);
    }
}