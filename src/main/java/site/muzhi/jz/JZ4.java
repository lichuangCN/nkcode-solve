package site.muzhi.jz;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author lichuang
 * @date 2021/01/13
 * @description 从尾部到头打印链表
 */
public class JZ4 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return new ArrayList<>(0);
        }
        LinkedList<Integer> list = new LinkedList<>();
        ListNode ptr = listNode;
        while (ptr != null) {
            list.addFirst(ptr.val);
            ptr = ptr.next;
        }
        ArrayList<Integer> result = new ArrayList<>(list.size());
        for (Integer integer : list) {
            result.add(integer);
        }
        return result;
    }
}
