// Problem: implement an algorithm to find the kth to the last
// element of a singly linked list

public class KthToTheLast {

    public static Node kthNode(Node head, int k) {
        if (head == null || k < 1) return head;

        int num = 0; // keep track of how many nodes we have examined

        Node temp = head;
        Node kthNode = null;
        while (temp != null) {
            if (++num >= k) {
                if (kthNode == null) kthNode = head;
                else kthNode = kthNode.next;
            }
            temp = temp.next;
        }

        return kthNode;
    }
}
