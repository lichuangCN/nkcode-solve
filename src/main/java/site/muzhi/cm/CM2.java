package site.muzhi.cm;

/**
 * @author lichuang
 * @date 2021/01/13
 * @description 原字符串反转
 */
public class CM2 {
    public String reverseString(String iniString) {
        char[] charArray = iniString.toCharArray();
        for (int left = 0, right = iniString.length() - 1; left < right; left++, right--) {
            char leftChar = charArray[left];
            char rightChar = charArray[right];
            charArray[right] = leftChar;
            charArray[left] = rightChar;
        }
        return new String(charArray);
    }
}
