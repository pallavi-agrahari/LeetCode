class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> charIndex_s = new HashMap<>();
        Map<Character, Integer> charIndex_t = new HashMap<>();

    for (Integer i = 0; i < s.length(); ++i){
      if (charIndex_s.put(s.charAt(i), i) != charIndex_t.put(t.charAt(i), i))
        return false;
    }
    return true;
    }
}