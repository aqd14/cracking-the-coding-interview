import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PalindromeLinkedListTest extends LinkedNodeParentTest {

    @Test
    /**
     * even-length palindrome linked list
     */
    public void testIsPalindrome() {
        int[] input = {1, 2, 3, 3, 2, 1};
        LinkedList list = array2LinkedList(input);
        boolean result = PalindromeLinkedList.isPalindrome(list.head());
        Assert.assertTrue(result);
    }

    @Test
    /**
     * odd-length palindrome linked list
     */
    public void testIsPalindrome2() {
        int[] input = {1, 2, 3, 4, 3, 2, 1};
        LinkedList list = array2LinkedList(input);
        boolean result = PalindromeLinkedList.isPalindrome(list.head());
        Assert.assertTrue(result);
    }

    @Test
    /**
     * palindrome linked list with length 2
     */
    public void testIsPalindrome3() {
        int[] input = {2, 2};
        LinkedList list = array2LinkedList(input);
        boolean result = PalindromeLinkedList.isPalindrome(list.head());
        Assert.assertTrue(result);
    }

    @Test
    /**
     * not palindrome linked list
     */
    public void testIsPalindrome4() {
        int[] input = {1, 2, 4, 3, 2, 1};
        LinkedList list = array2LinkedList(input);
        boolean result = PalindromeLinkedList.isPalindrome(list.head());
        Assert.assertFalse(result);
    }
}