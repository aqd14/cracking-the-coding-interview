// Implement an algorithm to delete a node in the middle of a singly linked
// list given only access to that node

public class DeleteMiddleNodeSolution {

    public static void deleteNode(Node node) {
        if (node == null || node.next == null) {
            System.err.println("Can't delete the null node or the last one!");
            return;
        }

        Node after = node.next;
        node.item = after.item;
        node.next = after.next;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        LinkedList list = new LinkedList();
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        list.add(node5);

        System.out.println(list);
        System.out.println("------------------");
        System.out.println("Delete the 3th node...");
        DeleteMiddleNodeSolution.deleteNode(node3);
        System.out.println(list);
    }
}
