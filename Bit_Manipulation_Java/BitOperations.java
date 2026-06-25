

public class BitOperations {

    // Get ith bit
    public static int getIthBit(int n, int ith) {
        int bitMask = 1<<ith;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // Set ith bit
    public static int setIthBit(int n, int ith) {
        int bitMask = 1<<ith;
        return n | bitMask;
    }

    // Clear ith bit
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    // Update ith bit 
    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }

    // Clear last ith bits
    public static int clearLastIthBit(int n, int ith) {
        int bitMask = (~0)<<ith;
        return n & bitMask;
    }

    
    public static int clearBitsinRange(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    // power of two
    public static boolean isPowerOfTwo(int n) {
        return (n & (n-1) )== 0;
    }

    // Count set Bits in a Number 
    public static int countSetBits(int n) {
        int c = 0;
        while(n > 0) {
            if((n&1) != 0) {
                c++;
            }
            n >>=1;
        }
        return c;
    }

    // Fast Exponentiation
    public static int fastExpo(int a, int n) {
        int ans = 1;

        while(n>0) {
            if((n&1) != 0) { // check lsb
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(5, 3));
    }
}