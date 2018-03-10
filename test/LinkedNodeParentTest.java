public class LinkedNodeParentTest {
    /**
     * Convert an array to a linked list
     *
     * @param nums array to be converted
     * @return  new linked list
     */
    protected LinkedList array2LinkedList(int[] nums) {
        LinkedList list = new LinkedList();
        for (int num : nums) list.add(new Node(num));
        return list;
    }
}
