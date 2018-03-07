// Problem: Write code to remove duplicates from an unsorted linked urlifiedStr
// FOLLOW UP: Not use temporary buffer

// usage: java RemoveDuplicateSolution e1 e2 e3 ... en where e is an integer
public class RemoveDuplicateSolution {

    // time complexity O(n^2)
    // space complexity O(1)
    public static void removeDuplicate(Node head) {
        // no element or only one element in the list
        if (head == null || head.next == null) return;

        Node first = head;
        Node previous, second;
        int firstItem, secondItem;
        while (first.next != null) {
            firstItem = first.item;
            previous = first;
            second = first.next;
            while (second != null) {
                secondItem = second.item;
                if (firstItem == secondItem) {
                    previous.next = second.next;
                    second = second.next;
                } else {
                    previous = second;
                    second = second.next;
                }
            }
            first = first.next;
        }
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            LinkedList bags = new LinkedList();
            for (String element : args) bags.add(Integer.parseInt(element));
            System.out.println(bags.toString());
            RemoveDuplicateSolution.removeDuplicate(bags.head());
            System.out.println("-------------------");
            System.out.println(bags.toString());
        }
    }
}
