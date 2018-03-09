import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckPermutationTest {

    @Test
    public void testCheckPermutation() {
        String s1 = "abc";
        String s2 = "bca";

        boolean isPermutation = CheckPermutation.checkPermutation(s1, s2);

        Assert.assertTrue(isPermutation);
    }

    @Test
    public void testCheckPermutation2() {
        String s1 = "abcdefgh";
        String s2 = "bcaefdgh";

        boolean isPermutation = CheckPermutation.checkPermutation(s1, s2);

        Assert.assertTrue(isPermutation);
    }

    @Test
    public void testCheckPermutation3() {
        String s1 = "abcdefgh";
        String s2 = "bcaeffgh";

        boolean isPermutation = CheckPermutation.checkPermutation(s1, s2);

        Assert.assertFalse(isPermutation);
    }
}