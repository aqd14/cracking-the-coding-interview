// Implement an algorithm to delete a node in the middle of a singly linked
// list given only access to that node

public class DeleteMiddleNode {

    public static void deleteNode(Node node) {
        if (node == null || node.next == null) {
            System.err.println("Can't delete the null node or the last one!");
            return;
        }

        Node after = node.next;
        node.item = after.item;
        node.next = after.next;
    }
}
