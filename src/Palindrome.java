import java.util.Stack;


public class Palindrome {
    public boolean isPalindrome(ListNode pHead) {
        ListNode fast = pHead;
        ListNode slow = pHead;

        Stack<Integer> stack = new Stack<Integer>();

        while (fast != null && fast.next != null) {
            fast = fast.next.next;

            stack.push(slow.val);
            slow = slow.next;
        }

        if(fast != null){
            slow = slow.next;
        }

        while (slow != null){
            int value = stack.pop();

            if (value != slow.val){
                return false;
            }

            slow = slow.next;
        }

        return true;
    }
}