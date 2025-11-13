public class Solution {

    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            rev = (rev << 1) | (n & 1);
            n >>= 1;
        }
        return rev;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 43261596;
        int reversed = obj.reverseBits(n);
        System.out.println("Original number: " + n);
        System.out.println("Original (binary): " + Integer.toBinaryString(n));
        System.out.println("Reversed (binary): " + String.format("%32s", Integer.toBinaryString(reversed)).replace(' ', '0'));
        System.out.println("Reversed number: " + reversed);
    }
}
