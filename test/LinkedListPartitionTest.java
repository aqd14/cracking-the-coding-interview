import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkedListPartitionTest extends LinkedNodeParentTest {

    private int x; // partition value

    @BeforeTest
    public void beforeTest() {
        x = 5;
    }

    @Test
    /**
     * smaller element than x appears first
     *
     * x = 5
     * nums[0] = 3
     */
    public void testPartitionLinkedList() throws Exception {
        // data
        int[] input = {3, 5, 8, 5, 10, 2, 1};
        int[] output = {3, 2, 1, 5, 10, 5, 8};

        LinkedListPartition solution = new LinkedListPartition();

        LinkedList actual = array2LinkedList(input);
        solution.partitionLinkedList(actual.head(), x);

        LinkedList expected = array2LinkedList(output);
        Assert.assertEquals(actual, expected);
    }

    @Test
    /**
     * larger or equal element than x appears first
     *
     * x = 5
     * nums[0] = 6
     */
    public void testPartitionLinkedList2() throws Exception {
        int[] input = {6, 3, 8, 5, 10, 2, 1};
        int[] output = {3, 2, 1, 5, 10, 6, 8};

        LinkedListPartition solution = new LinkedListPartition();

        LinkedList actual = array2LinkedList(input);
        solution.partitionLinkedList(actual.head(), 5);

        LinkedList expected = array2LinkedList(output);
        Assert.assertEquals(actual, expected);
    }

    @Test
    /**
     * all elements are greater than partition value
     *
     * x = 5
     */
    public void testPartitionLinkedList3() throws Exception {
        int[] input = {6, 7, 8, 9, 10, 11, 12};
        int[] output = {6, 7, 8, 9, 10, 11, 12};

        LinkedListPartition solution = new LinkedListPartition();

        LinkedList actual = array2LinkedList(input);
        solution.partitionLinkedList(actual.head(), 5);

        LinkedList expected = array2LinkedList(output);
        Assert.assertEquals(actual, expected);
    }

    @Test
    /**
     * all elements are greater than partition value
     *
     * x = 5
     */
    public void testPartitionLinkedList4() throws Exception {
        int[] input = {1, 2, 3, 4};
        int[] output = {1, 2, 3, 4};

        LinkedListPartition solution = new LinkedListPartition();

        LinkedList actual = array2LinkedList(input);
        solution.partitionLinkedList(actual.head(), 5);

        LinkedList expected = array2LinkedList(output);
        Assert.assertEquals(actual, expected);
    }
}