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
        add(node);
    }

    public void add(Node node) {
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

    @Override
    public boolean equals(Object other) {
        if (this == null || other == null) {
            return false;
        }

        Node temp1 = this.head;
        LinkedList otherLK = (LinkedList) other;
        Node temp2 = otherLK.head;

        while (temp1 != null || temp2 != null) {
            if (temp1.item != temp2.item) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        if (temp1 == null && temp2 == null) return true;
        return false;
    }
}
