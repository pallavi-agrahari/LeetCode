class Solution {
    public int countSegments(String s) {
       if (s == null || s.length() == 0) {
            return 0;
        }

        String[] segments = s.trim().split("\\s+");
        if( segments[0].isEmpty()) {
            return 0;
        } 
        else return segments.length;
    
    }
}