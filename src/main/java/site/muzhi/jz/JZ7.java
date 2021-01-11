package site.muzhi.jz;

/**
 * @author lichuang
 * @date 2021/01/11
 * @description 斐波那契数列
 */
public class JZ7 {

    /**
     * 递归计算
     *
     * @param n
     * @return
     */
    public int Fibonacci1(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return Fibonacci1(n - 1) + Fibonacci1(n - 2);
    }

    /**
     * 迭代计算
     *
     * @param n
     * @return
     */
    public int Fibonacci2(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int front = 0, next = 1;
        while (n > 1) {
            int val = front + next;
            front = next;
            next = val;
            n--;
        }
        return next;
    }
}
