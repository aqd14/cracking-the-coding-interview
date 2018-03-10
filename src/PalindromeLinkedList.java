// Problem: Implement a method to check if a linked list is a palindrome

import java.util.Stack;

public class PalindromeLinkedList {

    /**
     * Push the first half to stack. Pop out when comparing with the node from second half
     *
     * @param head
     * @return
     */
    public static boolean isPalindrome(Node head) {
        // the linked list with one element is considered not palindrome
        if (head == null || head.next == null) return false;

        Stack<Integer> stack = new Stack<>();
        Node first = head;
        Node second = head.next;

        while (second != null && second.next != null) {
            stack.push(first.item);
            first = first.next;
            second = second.next.next;
        }

        if (second != null) stack.push(first.item); // if the linked list has the even length
        second = first.next;

        // compare the nodes of each half by pair, one by one
        while (!stack.isEmpty()) {
            if (stack.pop() != second.item) return false;
            second = second.next;
        }
        return true;
    }
}
