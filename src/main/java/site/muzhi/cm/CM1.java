package site.muzhi.cm;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author lichuang
 * @date 2021/01/16
 * @description 确定字符互异
 */
public class CM1 {

    /**
     * 暴力循环
     *
     * @param iniString
     * @return
     */
    public boolean checkDifferent_1(String iniString) {
        if (iniString == null || "".equals(iniString)) {
            return true;
        }
        int len = iniString.length();

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (iniString.charAt(i) == iniString.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 排序法
     *
     * @param iniString
     * @return
     */
    public boolean checkDifferent_2(String iniString) {
        if (iniString == null || "".equals(iniString)) {
            return true;
        }
        char[] array = iniString.toCharArray();
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * hash集合
     *
     * @param iniString
     * @return
     */
    public boolean checkDifferent_3(String iniString) {
        if (iniString == null || "".equals(iniString)) {
            return true;
        }
        HashSet<Character> set = new HashSet<>();
        char[] array = iniString.toCharArray();
        for (char c : array) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
}
