//$Id$
package com.learn.java.delete;

class Solution {
    static public String romanToInt(String[] strs) {
        int length = strs[0].length();
        int length2 = strs.length;
        String s1 = strs[0];
        String s = "";
        for (int i = 0; i < length; i++) {
            int k = 0;
            try {
                for (int j = 0; j < length2; j++) {
                    if (strs[i].charAt(j) == s1.charAt(j))
                        k++;
                    else
                        break;
                }
                if (k == length2) {
                    s += strs[0].charAt(i);
                }
            } catch (Exception e) {
                break;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String i[] = { "flower", "flow", "flight", "fdcs" };
        System.out.println(romanToInt(i));
    }
}
