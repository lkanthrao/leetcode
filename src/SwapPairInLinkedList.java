/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


class SwapPairInLinkedList {
    public static ListNode swapRecursively(ListNode firstItem) {

        if (firstItem == null || firstItem.next == null) return null;

        ListNode secondItem = firstItem.next;

        firstItem.next = secondItem.next;

        secondItem.next = firstItem;

        secondItem.next.next = swapRecursively(firstItem.next);

        return secondItem;
    }

    public static void main(String[] head) {

        ListNode listNode3 = new ListNode(4, null);
        ListNode listNode2 = new ListNode(3, listNode3);
        ListNode listNode1 = new ListNode(2, listNode2);
        ListNode listNode = new ListNode(1, listNode1);


        ListNode listNodet = swapRecursively(listNode);

        System.out.println(listNodet);

    }
}