import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KthToTheLastTest extends LinkedNodeParentTest {

    private LinkedList list;

    @BeforeTest
    public void beforeTest() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        list = array2LinkedList(nums);
    }

    @Test
    /**
     * get the node in the middle
     */
    public void kthNodeTest() {
        int k = 4;
        Node actual = KthToTheLast.kthNode(list.head(), k);

        Node expected = list.head().next.next.next;

        Assert.assertEquals(actual, expected);
    }

    @Test
    /**
     * get last node
     */
    public void kthNodeTest2() {
        int k = 1;
        Node actual = KthToTheLast.kthNode(list.head(), k);

        Node expected = list.head().next.next.next.next.next.next;

        Assert.assertEquals(actual, expected);
    }

    @Test
    /**
     * get the node position larger than list's size
     */
    public void kthNodeTest3() {
        int k = 10;
        Node actual = KthToTheLast.kthNode(list.head(), k);

        Node expected = null;

        Assert.assertEquals(actual, expected);
    }
}