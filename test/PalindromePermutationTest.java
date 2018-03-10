import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PalindromePermutationTest {

    @Test
    public void testIsPalindromePermutation() {
        String s = "abdaccb";

        boolean result = PalindromePermutation.isPalindromePermutation(s);
        Assert.assertTrue(result);
    }

    @Test
    public void testIsPalindromePermutation2() {
        String s = "abdaaccb";

        boolean result = PalindromePermutation.isPalindromePermutation(s);
        Assert.assertFalse(result);
    }
}