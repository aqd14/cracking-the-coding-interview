public class LinkedList {
    private Node head;    // head of the singly linked list
    private int size;              // size of the linked list

    public LinkedList() {
        head = null;
        size = 0;
    }

    public Node head() {
        return head;
    }

    public int size() {
        return size;
    }

    /**
     * Add item to the end of the linked list
     * @param item
     */
    public void add(int item) {
        Node node = new Node(item);

        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        size++;
        temp.next = node;
    }

    @Override
    public String toString() {
        StringBuilder bd = new StringBuilder();

        Node cur = head;
        while (cur != null) {
            bd.append(cur.item).append("->");
            cur = cur.next;
        }
        return bd.toString();
    }
}
