import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Integer型のキーとInteger型のバリューを持つHashMapのインスタンスを生成
        // HashMap<キーのデータ型,値のデータ型> 変数名 = new HashMap<>();
        HashMap<Integer, Integer> hash = new HashMap<>();

        // 配列の要素数分、繰り返す
        for (int i = 0; i < numbers.length; i++) {

            // targetとnumber[i]の差をInteger型にキャストしてdiff代入
            Integer diff = (Integer) (target - numbers[i]);

            // diffと同じキーを持つ値があったら
            if (hash.containsKey(diff) && (i != (int) hash.get(diff))) {
                // diffのバリュー（インデックス）と現在のインデックスを返す
                int toReturn[] = { hash.get(diff), i };
                return toReturn;
            }

            // キーとバリューをMapにセットする
            hash.put(numbers[i], i);

        }

        return null;
    }
}
// @lc code=end
