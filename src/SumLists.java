/**
 * Problem: You have two numbers represented by two linked lists where each node contains a digit.
 * The digits are store in reverse order where first digit is at the head of the list. Write a function to
 * add two numbers and return the sum as a linked list
 */
public class SumLists {

    /**
     * Add two linked list
     *
     * @param l1
     * @param l2
     * @return
     */
    public static LinkedList sum(LinkedList l1, LinkedList l2) {
        if (l1 == null || l2 == null) return null;

        LinkedList sumLists = new LinkedList();

        Node temp1 = l1.head();
        Node temp2 = l2.head();

        int sumTwoNodes, carry = 0;
        while (temp1 != null || temp2 != null) {
            sumTwoNodes = carry + (temp1 != null ? temp1.item : 0) + (temp2 != null ? temp2.item : 0);

            carry = sumTwoNodes >= 10 ? 1 : 0;
            sumTwoNodes = sumTwoNodes % 10;

            sumLists.add(new Node(sumTwoNodes));
            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }

        if (carry == 1) {
            sumLists.add(new Node(1));
        }

        return sumLists;
    }
}
