/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {

        // 負の数のときと0以外の10で割り切れる数のときfalse
        if (x < 0 || (x != 0 && (x % 10 == 0)) || x == 2147483647) {
            return false;
        }
        // front:前から数えた数値
        int front = x;

        // rev:後ろから数えた数値
        int back = 0;

        // if back is less than front
        while (back < front) {
            back = back * 10 + x % 10;
            x = x / 10;
        }

        // 回文条件を満たしているか
        // 偶数桁のときfront = back
        // 奇数桁のときfront = back/10(真ん中の数値を除いて一致するか)
        return (front == back || front == back / 10);

    }
}
// @lc code=end
