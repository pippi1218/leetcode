/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        // StringBuilderクラスのインスタンス化
        StringBuilder result = new StringBuilder();

        // 配列が存在するとき
        if (strs != null && strs.length > 0) {

            // アルファベット順にソートする
            Arrays.sort(strs);

            // 先頭の要素の文字列を文字単位に分割してchar配列にする
            char[] a = strs[0].toCharArray();
            // 最後尾の要素の文字列を文字単位に分割してchar配列にする
            char[] b = strs[strs.length - 1].toCharArray();

            // 先頭の要素の文字列の文字数の上限までループする
            for (int i = 0; i < a.length; i++) {
                // もし文字数の上限に達していない & 一文字目が一致していたら
                if (b.length > i && b[i] == a[i]) {
                    // resultに文字を追加して文字列を作成していく
                    result.append(b[i]);
                } else {
                    return result.toString();
                }
            }
        }
        return result.toString();
    }
}
// @lc code=end
