package site.muzhi.cm;

/**
 * @author lichuang
 * @date 2021/01/14
 * @description 回文链表
 */
public class CM13 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public boolean isPalindrome(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return true;
        }
        ListNode slow = pHead, fast = pHead;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = slow.next;
        // 翻转后半段链表
        ListNode tempHead = new ListNode(0);
        while (slow != null) {
            ListNode node = tempHead.next;
            tempHead.next = slow;
            slow = slow.next;
            tempHead.next.next = node;
        }

        ListNode halfHead = tempHead.next;
        while (halfHead.next != null) {
            if (pHead.val != halfHead.val) {
                return false;
            }
            pHead = pHead.next;
            halfHead = halfHead.next;
        }
        return true;
    }
}
