class Solution {
    long rev=0;
    public int reverse(int x) {
        if (x==0) return 0;
        
        while (x != 0) {
            int digit = x % 10;
            rev = (rev * 10 )+ digit;
            x = x / 10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }

        

        return (int)rev;
    }
}
