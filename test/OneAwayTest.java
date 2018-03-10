import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OneAwayTest {

    @Test
    /**
     * remove one character
     */
    public void testHasOneEdit() {
        String s1 = "abcd";
        String s2 = "abd";

        boolean hasOneEdit = OneAway.hasOneEdit(s1, s2);
        Assert.assertTrue(hasOneEdit);
    }

    @Test
    /**
     * insert one character
     */
    public void testHasOneEdit2() {
        String s1 = "abcd";
        String s2 = "abcde";

        boolean hasOneEdit = OneAway.hasOneEdit(s1, s2);
        Assert.assertTrue(hasOneEdit);
    }

    @Test
    /**
     * replace one character
     */
    public void testHasOneEdit3() {
        String s1 = "abcd";
        String s2 = "abed";

        boolean hasOneEdit = OneAway.hasOneEdit(s1, s2);
        Assert.assertTrue(hasOneEdit);
    }

    @Test
    /**
     * more than two changes
     */
    public void testHasOneEdit4() {
        String s1 = "abcd";
        String s2 = "abeda";

        boolean hasOneEdit = OneAway.hasOneEdit(s1, s2);
        Assert.assertFalse(hasOneEdit);
    }
}