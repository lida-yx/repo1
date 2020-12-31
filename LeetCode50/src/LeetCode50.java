public class LeetCode50 {
    public static void main(String[] args) {
        Solution s = new Solution();
        double ans = s.myPow(2.0, 3);
        System.out.println(ans);
    }
}
class Solution {
    public double myPow(double x, long n) {
        if(n == 0)
            return 1.0;
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double half = myPow(x, N / 2);
        if(N % 2 == 0) {
            return half * half;
        }
        else {
            return half * half * x;
        }
    }
}
