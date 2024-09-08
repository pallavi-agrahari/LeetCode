class Solution {
    public int findComplement(int num) {
         int bitLength = Integer.toBinaryString(num).length();
        
        // Step 2: Create a mask that has all bits set to 1 of the same length as num
        int mask = (1 << bitLength) - 1;
        
        // Step 3: XOR the number with the mask to flip the bits
        return num ^ mask;
    }
}