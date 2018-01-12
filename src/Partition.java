public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;

        while (pHead != null) {
            ListNode next = pHead.next;
            pHead.next = null;

            if (pHead.val < x) {
                if (beforeStart == null) {
                    beforeStart = pHead;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = pHead;
                    beforeEnd = pHead;
                }
            } else {
                if (afterStart == null) {
                    afterStart = pHead;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = pHead;
                    afterEnd = pHead;
                }
            }

            pHead = next;
        }

        if (beforeStart == null) {
            return afterStart;
        }

        beforeEnd.next = afterStart;

        return beforeStart;

    }
}