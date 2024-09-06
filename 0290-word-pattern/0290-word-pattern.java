class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character, Integer> p_map=new HashMap<>();
        HashMap<String, Integer> s_map=new HashMap<>();
        for(Integer i=0;i<pattern.length();i++){
            if(p_map.put(pattern.charAt(i), i)!=s_map.put(words[i],i)){
                return false;
            }
        }
        return true;
    }
}