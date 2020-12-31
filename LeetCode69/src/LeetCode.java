public class LeetCode {
    public static void main(String[] args) {

    }
}
class Solution {
    public int mySqrt(int x) {
        if(x == 0)
            return 0;
        int ans = (int)Math.exp(0.5 * Math.log(x));
        return (ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
    }
}
