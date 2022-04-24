/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                idx = i;
                int temp = nums[i];
                while (temp == target) {
                    idx--;
                    temp--;
                }
                return idx;
            }
        }
        idx = nums.length;
        while (idx == target) {
            idx++;
        }
        return idx;
    }
}
// @lc code=end