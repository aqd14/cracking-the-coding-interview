// Problem: implement an algorithm to find the kth to the last
// element of a singly linked list

public class KthToTheLastSolution {

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

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        LinkedList list = new LinkedList();
        for (int element : nums) list.add(element);
        System.out.println(list.toString());
        System.out.println("-------------------");
        int k = 4;
        System.out.println(k + "th to the last element is " + KthToTheLastSolution.kthNode(list.head(), k));
        k = 1;
        System.out.println(k + "th to the last element is " + KthToTheLastSolution.kthNode(list.head(), k));
        k = 10;
        System.out.println(k + "th to the last element is " + KthToTheLastSolution.kthNode(list.head(), k));
    }
}
