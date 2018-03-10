import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RemoveDuplicateTest extends LinkedNodeParentTest {

    @Test
    /**
     * Test with some duplicates
     *
     * expected: all duplicates are removed
     */
    public void testRemoveDuplicate() {
        int[] input = {1, 2, 3, 4, 5, 3, 2, 5, 6, 4, 7};
        LinkedList actual = array2LinkedList(input);

        RemoveDuplicate.removeDuplicate(actual.head());

        int[] output = {1, 2, 3, 4, 5, 6, 7};
        LinkedList expected = array2LinkedList(output);

        Assert.assertEquals(actual, expected);
    }

    @Test
    /**
     * test with no duplicates
     *
     * expected: list stays the same
     */
    public void testRemoveDuplicate2() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        LinkedList actual = array2LinkedList(input);

        RemoveDuplicate.removeDuplicate(actual.head());

        int[] output = {1, 2, 3, 4, 5, 6, 7};
        LinkedList expected = array2LinkedList(output);

        Assert.assertEquals(actual, expected);
    }
}