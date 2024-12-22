package AC_POTD.Dec_21;

class Solution {
    public int scoreOfString(String s) {
        // int sn=0, sp=0;
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            // int d = Math.abs(s.charAt(i)-s.charAt(i+1));
            int d = (s.charAt(i) - s.charAt(i + 1));
            sum = sum + ((d > 0) ? d : (-d));
            // if(d<0)
            // sn=sn+d;
            // else
            // sp=sp+d;
        }
        // return sp-sn;
        return sum;
    }
}
// time complexity:O(n)
// space complexity:O(1)
