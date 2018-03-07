public class Node {
    public int item;
    public Node next;

    public Node(int item) {
        this.item = item;
        this.next = null;
    }

    @Override
    public String toString() {
        return String.valueOf(item);
    }
}