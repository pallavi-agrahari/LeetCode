class Solution {
    public int[] constructRectangle(int area) {
        int W = (int) Math.sqrt(area);
        
        // Find the first divisor such that L * W = area and L >= W
        while (area % W != 0) {
            W--;
        }
        
        int L = area / W; // L should be larger or equal to W
        return new int[]{L, W};
    }
}