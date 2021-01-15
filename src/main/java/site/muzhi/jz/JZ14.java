package site.muzhi.jz;

/**
 * @author lichuang
 * @date 2021/01/15
 * @description 链表中倒数第k个结点
 */
public class JZ14 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        if (k < 0 || head == null) {
            return null;
        }
        ListNode front = head;
        while (--k != 0) {
            front = front.next;
            if (front == null) {
                return null;
            }
        }

        ListNode nodeK = head;
        while (front.next != null) {
            front = front.next;
            nodeK = nodeK.next;
        }
        return nodeK;
    }
}
