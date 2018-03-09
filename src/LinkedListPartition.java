/**
 * Problem: write code to partition a linked list around a value x such that all nodes less than x come before
 * all nodes that are equal or greater than x. If x is contained within the list, the values of x only needs to be
 * after the nodes that are less than x
 *
 * Example:
 *
 * Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 ------ partition = 5
 *
 * Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 *
 * Notes: the order might differ as long as we satisfy the requirements
 *
 */

public class LinkedListPartition {

    /**
     * Maintain two pointers, one refers to the latest node that less than x and other points to
     * the latest node that is equal or greater than x
     *
     * @param head
     * @param partitionValue
     */
    public void partitionLinkedList(Node head, int partitionValue) {
        if (head == null) return;

        Node equalOrGreater = head;
        while (equalOrGreater != null) {
            if (equalOrGreater.item >= partitionValue) {
                break;
            }
            equalOrGreater = equalOrGreater.next;
        }
        // all values in linked list are either less or otherwise
        if (equalOrGreater == null) return;

        Node cur = equalOrGreater.next;
        while (cur != null) {
            if (cur.item < partitionValue) {
                int temp = cur.item;
                cur.item = equalOrGreater.item;
                equalOrGreater.item = temp;
                equalOrGreater = equalOrGreater.next; // update pointer
            }
            cur = cur.next;
        }
    }
}
