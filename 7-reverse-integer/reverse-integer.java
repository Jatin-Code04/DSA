class Solution {
    public int reverse(int n) {
        int revnum = 0;

        while (n!=0) {
            int digit=n%10;

            if (revnum>Integer.MAX_VALUE/10 ||   revnum<Integer.MIN_VALUE/10) {
                return 0;
            }

            revnum = revnum*10+digit;
            n=n/10;
        }

        return revnum;
    }
}