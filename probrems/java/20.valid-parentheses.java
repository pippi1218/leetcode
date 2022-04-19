/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {

        String[] strs = s.split("");

        int judge1, judge2, judge3;
        judge1 = judge2 = judge3 = 0;

        for (String str : strs) {
            if (str.equals("(")) {
                judge1++;
            } else if (str.equals("{")) {
                judge2++;
            } else if (str.equals("[")) {
                judge3++;
            } else if (str.equals(")")) {
                judge1--;
            } else if (str.equals("}")) {
                judge2--;
            } else if (str.equals("]")) {
                judge3--;
            } else {
                return false;
            }
        }
        if (judge1 == 0 && judge2 == 0 && judge3 == 0) {
            return true;
        } else {
            return false;
        }

    }

    // 回文判定
    static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
