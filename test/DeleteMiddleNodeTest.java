import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DeleteMiddleNodeTest extends LinkedNodeParentTest {

    @Test
    /**
     * delete node in the middle
     *
     * expected: middle node is deleted
     */
    public void testDeleteNode1() {
        int[] input = {1, 2, 3, 4, 5};
        int[] output = {1, 2, 4, 5};
        LinkedList expected = array2LinkedList(output);

        LinkedList actual = array2LinkedList(input);
        Node node3 = actual.head().next.next;
        DeleteMiddleNode.deleteNode(node3);

        Assert.assertEquals(actual, expected);
    }

    @Test
    /**
     * delete node in the head
     *
     * expected: first node is deleted. new head
     */
    public void testDeleteNode2() {
        int[] input = {1, 2, 3, 4, 5};
        int[] output = {2, 3, 4, 5};
        LinkedList expected = array2LinkedList(output);

        LinkedList actual = array2LinkedList(input);
        Node node1 = actual.head();
        DeleteMiddleNode.deleteNode(node1);

        Assert.assertEquals(actual, expected);
    }

    @Test
    /**
     * delete last node
     *
     * expected: list stays the same
     */
    public void testDeleteNode3() {
        int[] input = {1, 2, 3, 4, 5};
        int[] output = {1, 2, 3, 4, 5};
        LinkedList expected = array2LinkedList(output);

        LinkedList actual = array2LinkedList(input);
        Node lastNode = actual.head().next.next.next.next;
        DeleteMiddleNode.deleteNode(lastNode);

        Assert.assertEquals(actual, expected);
    }

    @Test
    /**
     * delete null node
     *
     * expected: list stays the same
     */
    public void testDeleteNode4() {
        int[] input = {1, 2, 3, 4, 5};
        int[] output = {1, 2, 3, 4, 5};
        LinkedList expected = array2LinkedList(output);

        LinkedList actual = array2LinkedList(input);
        Node nullNode = null;
        DeleteMiddleNode.deleteNode(nullNode);

        Assert.assertEquals(actual, expected);
    }
}