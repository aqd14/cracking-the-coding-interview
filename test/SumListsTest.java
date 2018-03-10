import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SumListsTest extends LinkedNodeParentTest {

    @Test
    /**
     * Calculate two numbers with the same digits
     */
    public void testSumReverse() {
        int[] first = {7, 1, 6};
        LinkedList l1 = array2LinkedList(first);
        int[] second = {5, 9, 2};
        LinkedList l2 = array2LinkedList(second);
        int[] sum = {2, 1, 9};
        LinkedList expected = array2LinkedList(sum);

        LinkedList actual = SumLists.sum(l1, l2);

        Assert.assertEquals(actual, expected);
    }

    @Test
    /**
     * the first number has more digits
     */
    public void testSumReverse2() {
        int[] first = {9, 9, 9, 9, 9};
        LinkedList l1 = array2LinkedList(first);
        int[] second = {1};
        LinkedList l2 = array2LinkedList(second);
        int[] sum = {0, 0, 0, 0, 0, 1};
        LinkedList expected = array2LinkedList(sum);

        LinkedList actual = SumLists.sum(l1, l2);

        Assert.assertEquals(actual, expected);
    }

    @Test
    /**
     * the second number has more digits
     */
    public void testSumReverse3() {
        int[] first = {1};
        LinkedList l1 = array2LinkedList(first);
        int[] second = {9, 9, 9, 9, 9};
        LinkedList l2 = array2LinkedList(second);
        int[] sum = {0, 0, 0, 0, 0, 1};
        LinkedList expected = array2LinkedList(sum);

        LinkedList actual = SumLists.sum(l1, l2);

        Assert.assertEquals(actual, expected);
    }
}