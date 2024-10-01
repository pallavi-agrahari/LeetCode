class Solution {
    private String buildString(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c); 
            } else if (!stack.isEmpty()) {
                stack.pop();  
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();

    }
    public boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }
}