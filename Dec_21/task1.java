package AC_POTD.Dec_21;

class Solution {
    public static int gcd(int a, int b) {
        // code here
        while (a != 0) {
            int temp = a;
            a = b % a;
            b = temp;
        }
        return b;
    }
}
// time complexity : O(log(min(a,b)))
// space complexity : O(1)