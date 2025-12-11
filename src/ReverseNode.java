import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseNode {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverseNode(ListNode root) {
        Deque<Integer> stack = new ArrayDeque<>();
        while(root != null) {
            stack.push(root.val);
            root = root.next;
        }
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while(!stack.isEmpty()) {
            int val = stack.pop();
            ListNode newNode = new ListNode(val);
            cur.next = newNode;
            cur = cur.next;
        }
        return dummy.next;
    }

    /**
     * 递归法
     * @param head
     * @return
     */
    public static ListNode reverseListRecursive(ListNode head) {
        // 判断 head == null 是为了兼容一开始链表就是空的情况
        if (head == null || head.next == null) {
            return head; // 链表末尾，即下面的 revHead
        }
        ListNode revHead = reverseListRecursive(head.next); // 「递」到链表末尾，拿到新链表的头节点
        ListNode tail = head.next; // 在「归」的过程中，head.next 就是新链表的末尾
        tail.next = head; // 把 head 插在新链表的末尾
        head.next = null; // 如果不写这行，新链表的末尾两个节点成环，这俩节点互相指向对方
        return revHead;
    }

    /**
     * 迭代法
     * @param head
     * @return
     */
    public static ListNode reverseListIterator(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode root = node3;
        node3.next = node2;
        node2.next = node1;
        ListNode newRoot = reverseNode(root);
        reverseListRecursive(root);
        //System.out.println(newRoot.val + "-" + newRoot.next.val);
    }

}
