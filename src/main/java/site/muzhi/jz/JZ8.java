package site.muzhi.jz;

/**
 * @author lichuang
 * @date 2021/01/13
 * @description 变态跳台阶
 * <p>
 * <p>
 * 思路：
 * 因为n级台阶，第一步有n种跳法：跳1级、跳2级....跳n级
 * 跳1级，剩下n-1级，则剩下跳法是f(n-1)
 * 跳2级，剩下n-2级，则剩下跳法是f(n-2)
 * 所以f(n)=f(n-1)+f(n-2)+...+f(1)
 * 因为f(n-1)=f(n-2)+f(n-3)+...+f(1)
 * 所以f(n)=2*f(n-1)
 */
public class JZ8 {

    /**
     * 递归版本
     *
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        return 2 * JumpFloorII(target - 1);
    }

    /**
     * 位运算版本
     * 因为在上面的递归方法中，其递归的本质是在进行 2^(n-1)计算
     *
     * @param target
     * @return
     */
    public int JumpFloorII_2(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        return 2 << (target - 1);
    }
}
