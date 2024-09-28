class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        HashMap<Character, Integer> freq1 = new HashMap<>();
        HashMap<Character, Integer> freq2 = new HashMap<>();
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (char c : word1.toCharArray()) {
            freq1.put(c, freq1.getOrDefault(c, 0) + 1);
            set1.add(c);
        }
        for (char c : word2.toCharArray()) {
            freq2.put(c, freq2.getOrDefault(c, 0) + 1);
            set2.add(c);
        }
        if (!set1.equals(set2)) {
            return false;
        }
        List<Integer> freqValues1 = new ArrayList<>(freq1.values());
        List<Integer> freqValues2 = new ArrayList<>(freq2.values());
        Collections.sort(freqValues1);
        Collections.sort(freqValues2);

        return freqValues1.equals(freqValues2);

    }
}