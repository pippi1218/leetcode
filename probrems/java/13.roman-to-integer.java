/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int value = 0;
        int sum = 0;
        String[] array = s.split("");
        String temp = "A";

        for (int i = 0; i < s.length(); i++) {
            // if s.charAt(i) is "I" than value = 1;
            if (array[i].equals("I")) {
                value = 1;
                temp = array[i];
            }
            // if s.charAt(i) is "V" than value = 5;
            else if (array[i].equals("V")) {

                value = 5;

                // if s.charAt(i-1) is "I" than value = 4;
                if (temp.equals("I")) {
                    sum -= 1;
                    value = 4;
                }

                temp = array[i];
            }
            // if s.charAt(i) is "X" than value = 10;
            else if (array[i].equals("X")) {

                value = 10;

                // if s.charAt(i-1) is "I" than value = 9;
                if (temp.equals("I")) {
                    sum -= 1;
                    value = 9;
                }

                temp = array[i];
            }
            // if s.charAt(i) is "L" than value = 50;
            else if (array[i].equals("L")) {

                value = 50;

                // if s.charAt(i-1) is "X" than value = 40;
                if (temp.equals("X")) {
                    sum -= 10;
                    value = 40;
                }

                temp = array[i];
            }
            // if s.charAt(i) is "C" than value = 100;
            else if (array[i].equals("C")) {
                value = 100;

                // if s.charAt(i-1) is "X" than value = 90;
                if (temp.equals("X")) {
                    sum -= 10;
                    value = 90;
                }
                temp = array[i];
            }
            // if s.charAt(i) is "D" than value = 500;
            else if (array[i].equals("D")) {
                value = 500;

                // if s.charAt(i-1) is "C" than value = 400;
                if (temp.equals("C")) {
                    sum -= 100;
                    value = 400;
                }

                temp = array[i];
            }
            // if s.charAt(i) is "M" than value = 1000;
            else if (array[i].equals("M")) {

                value = 1000;

                // if s.charAt(i-1) is "C" than value = 900;
                if (temp.equals("C")) {
                    sum -= 100;
                    value = 900;
                }

                temp = array[i];
            }
            // sum
            sum += value;
        }

        return sum;
    }
}
// @lc code=end
